package jdbc;

import java.sql.*;
public class insertJDBC{
	public static void main(String []args){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");

			String url="jdbc:mysql://localhost:3306/samiinfo";
			String username="root";
			String password="root";
            Connection con=DriverManager.getConnection(url,username,password);

            String q = "CREATE TABLE table1 (tId INT(20) PRIMARY KEY AUTO_INCREMENT, tName VARCHAR(200) NOT NULL, tCity VARCHAR(400))";
            Statement stmt=con.createStatement();
            stmt.executeUpdate(q);
            System.out.println("Table Created in Database");
            con.close();


		}catch(Exception e){
			e.printStackTrace();
		}
	}
}