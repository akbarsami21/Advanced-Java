package jdbc;

import java.sql.*;
public class FirstJDBC{
	public static void main(String []args){
			try{
				//1st step: load memeory
		Class.forName("com.mysql.cj.jdbc.Driver");

		//2nd step: connection jdbc and database
		String url="jdbc:mysql://localhost:3306/samiinfo";
		String username="root";
		String password="root";

		Connection con=DriverManager.getConnection(url,username,password);
		if(con.isClosed()){
			System.out.println("Connection is Closed");
		}else{
			System.out.println("Connection Created.......");
		}

	}catch(Exception e){
		e.printStackTrace();
	}
 }

}

