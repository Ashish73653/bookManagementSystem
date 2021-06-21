package functions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;


public class cp {

	static Connection con;
	ResultSet rs = null;
	public static Connection createC() {
		try {
			// load driver
			Class.forName("com.mysql.jdbc.Driver");
			
			// create connection
			String user = "root";
			String password = "Ashish@73653";
			String url ="jdbc:mysql://localhost:3306/bookmanagement";
			con = DriverManager.getConnection(url,user,password);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
