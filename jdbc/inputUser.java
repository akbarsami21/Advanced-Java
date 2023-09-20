package jdbc;

import java.sql.*;
import java.io.*;

public class inputUser {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/samiinfo";
			String username = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, username, password);
			String q = "insert into table1 (tName,tCity) values (?,?)";
			PreparedStatement pstmt = con.prepareStatement(q);
			BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter Name : ");
			String name = br.readLine();
			System.out.print("Enter City : ");
			String city = br.readLine();
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			pstmt.executeUpdate();
			System.out.println("Inserted.....");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}