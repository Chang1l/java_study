package dbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex30 {
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		String user = "test";
		String pass = "1111";
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pass);

			stmt = con.createStatement();
			String query = "SELECT * FROM dept";
			rs = stmt.executeQuery(query);

			//ResultSetMetaData의 getMetaData()를 이용하여 instance를 얻어오고,
			//해당 객체를 통하여 sql에 해당되는 정보를 얻을 수 있다.
			ResultSetMetaData data = rs.getMetaData();
			// 총 컬럼 갯수를 보여 줌.
			
			System.out.printf("%10s \t%10s \n", "ColumnName", "DataType");
			System.out.println("-------------------------------------------------");
			int cols = data.getColumnCount();
			for (int i = 1; i <= cols; i++) {
				//컬럼명 가져오기
				System.out.printf("%10s \t", data.getColumnName(i));
				//컬럼의 자료형 가져오기
				System.out.printf("%10s(%s) \t", data.getColumnTypeName(i),data.getColumnDisplaySize(i));
				//컬럼 최대 용량
				System.out.printf("%10s(%s) \t", data.getColumnTypeName(i),data.getPrecision(i));
				System.out.println();
			}
			System.out.println();
			System.out.println("-------------------------------------------------");
			for (int i = 1; i <= cols; i++) {
				//컬럼명 가져오기
				System.out.printf("%10s \t", data.getColumnName(i));
				rs.next();
				System.out.printf("%10s \t", rs.getString(1));
				System.out.printf("%10s \t", rs.getString(2));
				System.out.printf("%10s \t", rs.getString(3));
			}
			System.out.println();
			System.out.println("-------------------------------------------------");
			
			while(rs.next()) {
				System.out.printf("%10s \t", rs.getString(1));
				System.out.printf("%10s \t", rs.getString(2));
				System.out.printf("%10s \t", rs.getString(3));
				System.out.println();
			}
			System.out.println("-------------------------------------------------");
			
			
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
