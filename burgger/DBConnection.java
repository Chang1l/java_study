package burgger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	private static Connection conn = null;
	PreparedStatement ps = null;	

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} 
	}
	
	public static Connection getConnection() {
		try {
			if(conn == null) {
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "test", "1111");
				conn.setAutoCommit(false);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void getClose() {
		try {
			if(conn!=null) {
				if(!conn.isClosed()) {
					conn.close();
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
