package streamEx;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class FunctionCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//연결 객체 생성
			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","test","1111");
			
			//프로시저 실행 객체생성
			CallableStatement cstmt=con.prepareCall("{?=call TEST_FUNC(?)}");
			
			//첫번째 바인드 변수 리턴( 반환 값), 바인드 변수 자료형 varchar 타입으로 가져옴
			cstmt.registerOutParameter(1, Types.VARCHAR);
			//두번째?에 값 바인딩
			cstmt.setString(2, "TURNER");
			cstmt.executeQuery();//실행
			System.out.println(cstmt.getString(1));//1번 컬럼 
			cstmt.close();
			con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
