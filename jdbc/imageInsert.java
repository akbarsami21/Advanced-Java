package jdbc;

import java.sql.*;
import java.io.*;

public class imageInsert {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/samiinfo";
			String username = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url, username, password);
			String q = "insert into images (pic) values (?)";
			PreparedStatement pstmt=con.prepareStatement(q);
			FileInputStream fis=new FileInputStream("C://Users//mdsam//Downloads//w.png");
			pstmt.setBinaryStream(1, fis,fis.available());
			pstmt.executeUpdate();
			System.out.println("Done..");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}