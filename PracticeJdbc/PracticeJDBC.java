package jdbc.project;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class ConnectionProv{
	private static Connection con;
	public static Connection getConnection() {
		if(con==null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url,username,password;
				url="jdbc:mysql://localhost:3306/longinfo";
				username="root";
				password="root";
				con=DriverManager.getConnection(url,username,password);
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		return con;
	}
}
class TableCreate{
	TableCreate(){
		try {
			Connection con=ConnectionProv.getConnection();
			String q = "CREATE TABLE UserInfo (Id INT(20) PRIMARY KEY AUTO_INCREMENT, Name VARCHAR(200), Country VARCHAR(200), Number VARCHAR(200))";
		    PreparedStatement pstmt=con.prepareStatement(q);
		    pstmt.executeUpdate();
		    System.out.println("Table Created....");
		}catch(Exception e) {
			System.out.println("Exception Caught: "+e);
		}
	}
}
public class PracticeJDBC {
	public static void main(String[] args) {
		try {
			Connection con=ConnectionProv.getConnection();
			String q="insert into userinfo (name,country,number) values(?,?,?)";
			PreparedStatement pstmt=con.prepareStatement(q);
			BufferedReader bfr=new BufferedReader(new InputStreamReader(System.in));
			String name,country,number;
			System.out.print("Enter Name    : ");
			name=bfr.readLine();
			System.out.print("Enter Country : ");
			country=bfr.readLine();
			System.out.print("Enter Number  : ");
			number=bfr.readLine();
			pstmt.setString(1, name);
			pstmt.setString(2, country);
			pstmt.setString(3, number);
			pstmt.executeUpdate();
			System.out.println("Data Saved On DataBase");
			
		}catch(Exception e) {
			System.out.println("Exception Caught: "+e);
		}
	}

}
