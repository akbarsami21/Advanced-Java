package jdbc;

import java.io.*;
import java.sql.*;
import jdbc.*;

public class UpdateJDBC {

	public static void main(String[] args) {
		try {
			Connection c = ConnectionProvider.getConnection();
			String q = "update table1 set tName=?,tCity=? where tId=?";
			PreparedStatement pstmt = c.prepareStatement(q);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Enter Name: ");
			String name = br.readLine();
			System.out.print("Enter City: ");
			String city = br.readLine();
			System.out.print("Enter Id  : ");
			int id = Integer.parseInt(br.readLine());
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			pstmt.setInt(3, id);
			pstmt.executeUpdate();
			System.out.println("Update SuccessFully...");
			c.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
