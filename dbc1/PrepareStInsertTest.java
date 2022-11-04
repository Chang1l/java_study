package dbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrepareStInsertTest {
	private Connection con;
	private PreparedStatement ps;
//, String ename, double sal
	public PrepareStInsertTest(int empno, int empno2) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			User user = new User();
			con = DriverManager.getConnection(user.getUrl(), user.getUser(), user.getPwd());
			System.out.println("db연결 성공");

//			String sql = "insert into emp(empno,ename,sal) values(?,?,?)";
			
//			String sql = "delete from emp where empno =?";
			String sql = "delete from emp where empno in(?,?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, empno);
			ps.setInt(2, empno2);
//			ps.setString(2, ename);
//			ps.setDouble(3, sal);

			int result = ps.executeUpdate();
			System.out.println("처리된 레코드 개수: " + result);

			ps.close();
			con.close();
		} catch (ClassNotFoundException e) {
			System.out.println(e + "=> 드라이버 로딩 오류");
		} catch (SQLException e) {
			System.out.println(e + " => DB 연결 실패");
		}catch (Exception e) {
			System.out.println(e + "=>일반 예외");
		}
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		new PrepareStInsertTest(1, "JavaPris", 100);
		new PrepareStInsertTest(1,2);
	}

}
