package jdbc;

import java.sql.*;

public class ConnectionProvider {
	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:7708/facebook", "root", "root");
			String q = "insert into userinfo(name,email,password) values(?,?,?)";
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setString(1, "Akbar Sami");
			pstmt.setString(2, "mdsami6251@gmail.com");
			pstmt.setString(3, "");
			pstmt.executeUpdate();
			System.out.println("Successfully Done");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
