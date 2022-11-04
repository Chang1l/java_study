package dbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "test";
		String passwd = "1111";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			stmt = con.createStatement();
			// String query="SELECT empno , ename, job, hiredate FROM EMP";
			String query = "SELECT*FROM EMP";
			rs = stmt.executeQuery(query);
			
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				String hiredate = rs.getString("hiredate");
//				 Date hiredate=rs.getDate("hiredate");
				System.out.println(empno + " " + ename + " " + job + " " + hiredate);

			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();

			}
		}

	}

}
