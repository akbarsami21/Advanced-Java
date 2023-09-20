package jdbc.project;


import java.sql.Connection;
import java.sql.DriverManager;

public class dk {

	private static Connection con;

	public static Connection getConnection() {

		try {
			if (con == null) {
				// driver class load
				Class.forName("com.mysql.cj.jdbc.Driver");
				String url = "jdbc:mysql://localhost:3306/enotes";
				String name = "root";
				String password = "root";
				// create a connection
				con = DriverManager.getConnection(url, name, password);
				if(con.isClosed()) {
					System.out.println("stop");
				}else
				System.out.println("start");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}