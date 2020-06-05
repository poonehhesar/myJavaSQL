package myJavaSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ConnectingDB 
{
	private String databurl="jdbc:mysql://localhost:3306/customers?serverTimezone=UTC";
	private String databuname="root";
	private String databpassword="";
	private String databdriver="com.mysql.jdbc.Driver";
	public void loadDriver(String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	public Connection getConnection() 
	{
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(databurl, databuname, databpassword);
		
		} catch (SQLException e) {
		
		e.printStackTrace();
	}
		return con;

}
	public String insert(aBean aBean)
	{
		loadDriver(databdriver);
		Connection con = getConnection();
		String result = "Data enterd successfully";
		String sql="insert into customers.accounts values(?,?,?,?)";
		
		try {
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, aBean.getUsername());
			ps.setString(2, aBean.getPassword());
			ps.setString(3, aBean.getFullName());
			ps.setString(4, aBean.getPhone());
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Data not enterd";
		}
		return result;
		
	}
}