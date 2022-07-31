package com.madhur;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginServlet extends HttpServlet {
	private String username;
	private String password;
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		username = request.getParameter("logInUsername");
		password = request.getParameter("logInPswd");
		
		System.out.println("rj" + username);
		
		try {
			DAO dao = new DAO();
			if(dao.loginDao(username, password))
			{
				request.setAttribute("name", username);
				request.getRequestDispatcher("Welcome.jsp").forward(request, response);
			}
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}