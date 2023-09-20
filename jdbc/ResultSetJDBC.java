package jdbc;

import java.sql.*;

import javax.swing.JOptionPane;
public class ResultSetJDBC {
	public static void main(String[] args) {
		try {
			Connection con=ConnectionProvider.getConnection();
			String q="select * from table1";
			Statement stmt=con.createStatement();
		    ResultSet set=stmt.executeQuery(q);
		    while(set.next()) {
		    	int id=set.getInt(1);
		    	String name=set.getString(2);
		    	String city=set.getString(3);
		    	System.out.println(id+"  "+name+",  "+city);
		    }
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Error!!");
		}
	}

}
