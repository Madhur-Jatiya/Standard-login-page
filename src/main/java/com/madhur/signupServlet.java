package com.madhur;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/signupServlet")
public class signupServlet extends HttpServlet {
	private String username;
	private String password;
	private String name;
	private String mobile;
	private String address;
//	private DAO dao;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		username = request.getParameter("signUpUsername");
		password = request.getParameter("signUpPswd");
		name = request.getParameter("name");
		mobile = request.getParameter("mobile");
		address = request.getParameter("address");
		
		
		try {
			DAO dao = new DAO();
			dao.signDao(username, password, name, mobile, address);
			request.getRequestDispatcher("login.jsp").forward(request, response);
		} 
		
		catch (SQLException e) {
			System.out.println("Insert error");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		
	}

}
