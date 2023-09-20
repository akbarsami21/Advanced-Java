package com.user;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Register extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();

		String name = req.getParameter("user_name");
		String password = req.getParameter("user_password");
		String email = req.getParameter("user_email");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url, username, userpassword;
			url = "jdbc:mysql://localhost:3306/register";
			username = "root";
			userpassword = "root";
			Connection con = DriverManager.getConnection(url, username, userpassword);
			String q = "insert into userdata(name,password,email) values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, name);
			pstmt.setString(2, password);
			pstmt.setString(3, email);
			pstmt.executeUpdate();
			out.println("<h2>Saved on database</h2>");
		} catch (Exception e) {
			e.printStackTrace();
			out.println("<h2>Error!!</h2>");
		}

	}

}
