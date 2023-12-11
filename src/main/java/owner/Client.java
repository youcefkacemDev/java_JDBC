package owner;

public class Client {
	private int id;
	private String firstname;
	private String lastname;
	private String address;
	private String country;
	private String gender;
	private String skills;
	private String email;
	private String password;
	
	// constructor for add client to database
	public Client(String firstname, String lastname, String address, String country, String gender, String skills, String email, String password){
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.country = country;
		this.gender = gender;
		this.skills = skills;
		this.email = email;
		this.password = password;
	}
	
	// constructor to bring the data from database
	public Client(int id, String firstname, String lastname, String address, String country, String gender, String skills, String email, String password){
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.country = country;
		this.gender = gender;
		this.skills = skills;
		this.email = email;
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "id " + id + "<br>firstname " + firstname + "<br>lastname " + lastname + "<br>address " + address
				+ "<br>country " + country + "<br>gender " + gender + "<br>skills " + skills + "<br>email " + email
				+ "<br>password " + password ;
	}
	
	
}
