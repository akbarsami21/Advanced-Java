package jdbc;
import java.sql.*;
public class Fun{
	public static void main(String []args){
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/samiinfo";
			String username="root";
			String password="root";
			Connection con=DriverManager.getConnection(url,username,password);
			
			String q="insert into table1 (tName,tCity) values (?,?)";

			PreparedStatement pstmt=con.prepareStatement(q);
			pstmt.setString(1,"X");
			pstmt.setString(2,"Washington DC");
			pstmt.executeUpdate();
			System.out.println("inserted......");
			con.close();


		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
