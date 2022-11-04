package dbc5;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnTest1 {
	public static void main(String[] args) {
		Connection conn = DBConn.getConnection(); 
		//dbconn 클래스.메소드로 접근 static 메모리
		//db 드라이버 로딩 및 연결
		if (conn == null) {  //커넥션 값이 null인 경우
			System.out.println("연결 실패");
			System.exit(0);  //시스템 종료
		}
		System.out.println("연결 성공");  //연결되면 출력

		try {
			Statement stmt = conn.createStatement();  //단순 쿼리 명령문 객체 생성
			String sql = "insert into dept values (90, '개발', '강남')";// 단순쿼리문 
			int result = stmt.executeUpdate(sql); //쿼리 실행문 줄 개수를 result에 저장 
			System.out.println(result + "개 레코드 실행");
			stmt.close();
		} catch (SQLException e) {
			System.out.println(e.toString());//예외 발생시 출력
		}finally {
			DBConn.close();//커넥션 연결 종료	
			
		}
		
		
	}
}
