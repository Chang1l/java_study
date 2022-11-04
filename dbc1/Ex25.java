package dbc1;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;


public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String userid = "test";
		String passwd = "1111";
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, userid, passwd);
			//입사일이 81-9-28 이후인 사원의 empno ename hiredate
			String query = "SELECT empno,ename, hiredate FROM EMP Where hiredate>=?";
			pstmt = con.prepareStatement(query);
//			pstmt.setString(1,"81-9-28");

			Calendar c= Calendar.getInstance();
			c.set(1981,8,28);
			Date d= new Date(c.getTimeInMillis());
			pstmt.setDate(1, d);
			rs=pstmt.executeQuery();
			
			while (rs.next()) {
				int empno = rs.getInt("empno");
				String ename = rs.getString("ename");
				String hiredate = rs.getString("hiredate");
				System.out.println(empno + " " + ename + " " + hiredate);

			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();

			}
		}

	}

}

