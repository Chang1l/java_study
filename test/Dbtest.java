package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Dbtest {
	private static Connection connec;// 커넥션 객체 생성 static메모리

	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		// 예외발생 시 ClassNotFoundException, SQLException
		if (connec == null) {// 지역변수 자동초기화 값은 null이므로
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "test";
			String pw = "1111";

			Class.forName("oracle.jdbc.driver.OracleDriver");// 드라이버 로딩
			connec = DriverManager.getConnection(url, user, pw);// 데이터베이스 연결

		}
		return connec;// 커넥션 리턴
	}

	public static void close() throws SQLException {// 예외발생 시 SQLException
		if (connec != null) {// 연결이 되어있으면
			if (!connec.isClosed()) {// 연결 종료를 하지않았으면
				connec.close();// 종료
			}
		}

		connec = null;// 초기화
	}
}
