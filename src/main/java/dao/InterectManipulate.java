package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import owner.Client;

public class InterectManipulate implements Manipulate{

	@Override
	public void add(Client client) {
		try {
			String SQL = "INSERT INTO client(firstname, lastname, address, country, gender, skills, email, pwd) values(?, ?, ?, ?, ?, ?, ?, ?);";
			PreparedStatement ps = Connect.toconnect().prepareStatement(SQL);
			ps.setString(1, client.getFirstname());
			ps.setString(2, client.getLastname());
			ps.setString(3, client.getAddress());
			ps.setString(4, client.getCountry());
			ps.setString(5, client.getGender());
			ps.setString(6, client.getSkills());
			ps.setString(7, client.getEmail());
			ps.setString(8, client.getPassword());
			
			ps.executeUpdate();
			ps.close();
		}catch(Exception e) {
			System.out.println("add client failed ");
			e.printStackTrace();
		}
	}

	@Override
	public Client check(String password, String email) {
		try {
			String SQL = "SELECT * FROM client WHERE email = ? and pwd = ?;";
			PreparedStatement ps = Connect.toconnect().prepareStatement(SQL);
			ps.setString(1, email);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				return new Client(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8),rs.getString(9));
			}
		}catch(Exception e) {
			System.out.println("check client failed :");
			e.printStackTrace();
		}
		return null;
	}

}
