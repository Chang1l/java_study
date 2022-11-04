package dbc1;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			//1. 드라이버 로딩 static으로 메모리에 올려 놓음
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 로딩 성공");
			//2.db 커넥션 정보 설정 및 접속
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="test";
			String pwd="1111";
			
			Connection conn=DriverManager.getConnection(url,user,pwd);
			System.out.println("connected~~!");
			
			//3. 
			Statement st= conn.createStatement();
			String sql="select*from dept";
			
			//4,db에 쿼리문 전송(명령문 -쿼리문 실행)
			ResultSet rs= st.executeQuery(sql);
			//select 문일 경우 executeQuery(sql) 이용
			//반환 타입 ResultSet
			
			//5.ResultSet 커서 이동하면서 객체 데이터 출력
			while(rs.next()) {
				int col1=rs.getInt(1);
				String col2=rs.getString(2);
				String col3=rs.getString(3);
				System.out.println(col1+ "\t"+col2+"\t"+col3);
				
			}
			//6. 자원 반납(닫기)
			//보통 close() 는 finally 블록에 작성
			if(rs !=null)
				rs.close();
			if(st!=null)
				st.close();
			if(conn !=null)
				conn.close();
			
		}
		catch(ClassNotFoundException e) {
			System.out.println(e+"=> 드라이버 로딩 오류");
		}
		catch(SQLException e) {
			System.out.println(e+"=> DB 연결 오류");
		}
	}

}
