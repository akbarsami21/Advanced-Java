package jdbc.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.sql.*;

public class ConnectionJDBC {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url,username,userpassword;
			url="jdbc:mysql://localhost:3306/register";
			username="root";
			userpassword="root";
			Connection con=DriverManager.getConnection(url,username,userpassword);
			String q="insert into userdata(name,password,email) values(?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(q);
			pstmt.setString(1,"X");
			pstmt.setString(2,"12345");
			pstmt.setString(3,"x@gmail.com");
			pstmt.executeUpdate();
			System.out.println("Saved on database");
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
