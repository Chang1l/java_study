package dbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ex31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String id = "test";
			String pass = "1111";
			String tname = "TB_TEST";
			Connection conn = DriverManager.getConnection(url, id, pass);
			System.out.println("db 연결 성공");

			PreparedStatement ps;
			ResultSet rs=null;
			String sql = "select count(*) as cnt from USER_Tables where Table_name=?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, tname);
			rs = ps.executeQuery();
			int cnt = 0;
			while (rs.next()) {
				cnt = rs.getInt("cnt");
			}
			
			
			if (cnt <= 0) {
				sql = "create table " + tname + " ( test1 varchar2(10) Primary key, "
							+ " test2 number not null)";
				ps.executeUpdate(sql);
				System.out.println(sql + "문 실행 완료");
				System.out.println("테이블 생성 ok");

			} else {
				System.out.println("테이블이 이미 있습니다");

			}
			rs.close();

			ps.close();
			conn.close();

		} catch (ClassNotFoundException e) {
			System.out.println("예외: 드라이버 로딩 실패" + e.getMessage());
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("예외:" + e.getMessage());
			e.printStackTrace();
		}
	}

}
