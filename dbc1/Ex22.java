package dbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "test";
		String passwd = "1111";
		Connection con = null;
		Statement stmt = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			stmt = con.createStatement();

			String sql = "Insert into dept (deptno, dname, loc)" + "Values(50,'개발','서울')";
			int n = stmt.executeUpdate(sql);
			System.out.println(n + "개 레코드 저장");

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {

				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();

			}
		}

	}

}
