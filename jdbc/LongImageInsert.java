package jdbc;

import java.io.*;
import java.sql.*;
import javax.swing.*;

class ConnectionProvider {
	private static Connection con;

	public static Connection getConnection() {
		try {
			if (con == null) {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/samiinfo", "root", "root");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}

public class LongImageInsert {
	public static void main(String[] args) {
		try {
			Connection c = ConnectionProvider.getConnection();
			String q = "insert into images(pic) values(?)";
			PreparedStatement pstmt = c.prepareStatement(q);
			JFileChooser jfc = new JFileChooser();
			jfc.showOpenDialog(null);
			File file = jfc.getSelectedFile();
			FileInputStream fis = new FileInputStream(file);
			pstmt.setBinaryStream(1, fis, fis.available());
			pstmt.executeUpdate();
			JOptionPane.showMessageDialog(null, "SuccessFully Saved On DataBase.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
