package com.madhur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.Result;

public class DAO {
	private Connection connection;
	private PreparedStatement ps;
	
	public DAO() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/servletdatabase","root","My$ql123");
	}

	public void signDao(String username, String password, String name, String mobile, String address) throws SQLException, ClassNotFoundException
	{
			ps = connection.prepareStatement("insert into login(username,password,name,mobile,address) values(?,?,?,?,?)");
			ps.setString(1, username);
			ps.setString(2, password);
			ps.setString(3, name);
			ps.setString(4, mobile);
			ps.setString(5, address);
			ps.executeUpdate();
	}
	
	public Boolean loginDao(String username, String password) throws SQLException {
		System.out.println("mj"+username);
		ps = connection.prepareStatement("select * from login where username = ? and password = ?");
		ps.setString(1, username);
		ps.setString(2, password);
		
		ResultSet rs = ps.executeQuery();
		
		if(rs.next())
		{
			return true;
		}
		
		return false;
	}
	
}
