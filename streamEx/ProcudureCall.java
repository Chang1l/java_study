package streamEx;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class ProcudureCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//연결 객체 생성
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","test","1111");
			
			//프로시저 실행 객체생성
			CallableStatement cstmt=con.prepareCall("{call res()}");
			//?에 값 바인딩
			cstmt.executeQuery();
			cstmt.close();
			con.close();
			System.out.println("프로시저 호출 완료");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
