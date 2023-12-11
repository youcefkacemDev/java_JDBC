package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connect {
	//before execute this web application make sure the database is prepared 
	/*
	 * create database servletapplication;
	 * 
	    CREATE TABLE client(
			id int(2) not null AUTO_INCREMENT,
	    	firstname varchar(30) not null,
	    	lastname varchar(30) not null,
	    	address varchar(20) not null,
	    	country varchar(20) not null,
	    	gender varchar(5) not null,
	    	skills varchar(100) not null,
	    	email varchar(50) not null,
	    	pwd varchar(300) not null,
	    	PRIMARY KEY(id)
		);
	 */
	static String server = "jdbc:mysql://localhost/servletapplication";
	static String db_user = "root";
	static String db_password = "";
	static Connection connect;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect = DriverManager.getConnection(server, db_user, db_password);
		}catch(Exception e) {
			System.out.println("connection failed :");
			e.printStackTrace();
		}
	}
	
	protected static Connection toconnect() {
		return connect;
	}
}
