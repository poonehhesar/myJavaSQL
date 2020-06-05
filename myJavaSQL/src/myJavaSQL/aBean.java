package myJavaSQL;

public class aBean 
{
	private String username,password,fullName,phone;

	public aBean() {
		super();
	}

	public aBean(String username, String password, String fullName, String phone) {
		super();
		this.username = username;
		this.password = password;
		this.fullName = fullName;
		this.phone = phone;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFullName() {
		return fullName;
	}
	
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}

}