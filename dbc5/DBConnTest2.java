package dbc5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnTest2 {
	public static void main(String[] args) {
		Connection conn = DBConn.getConnection();
		if (conn == null) {
			System.out.println("연결 실패");
			System.exit(0);
		}
		System.out.println("연결 성공");

		try {
			String sql = "select * from dept";//쿼리문 
			PreparedStatement pstmt = conn.prepareStatement(sql); // sql문을 미리 캐시에 생성
			ResultSet rs = pstmt.executeQuery();//쿼리 실행 및 결과 rs에 저장
			while (rs.next()) {//rs 레코드 출력 (한 줄 씩)
				System.out.println(rs.getInt("deptno") + ", "
					+ rs.getString("dname") + ", "
					+ rs.getString("loc")); //컬럼이나 몇번째 컬럼인지 통일
			}

			rs.close();  //resultset 종료
			pstmt.close();//명령문 종료
		} catch (SQLException e) {
			System.out.println(e.toString());
		}
		DBConn.close();
	}
}
