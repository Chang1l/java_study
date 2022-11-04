package dbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateTest {

	private Connection con;
	private Statement st;
//	private ResultSet rs;
	private PreparedStatement ps;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			new UpdateTest(7844,"Javaking",1500);
	}

	
	public UpdateTest(int empno, String ename, double sal) {
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		User user = new User();
		con = DriverManager.getConnection(user.getUrl(), user.getUser(), user.getPwd());
		System.out.println("db연결 성공");
		
//		String sql= "update emp set ename='"+ename+"',sal="+sal+"where empno="+empno;
		String sql= "update emp set ename=?, sal=? where empno=?";
//		st=con.createStatement();
		ps=con.prepareStatement(sql);
		ps.setString(1, ename);
		ps.setDouble(2,sal);
		ps.setInt(3, empno);
//		int result=st.executeUpdate(sql);
		int result=ps.executeUpdate();
		System.out.println("처리된 레코드 개수"+result);
//		st.close();
		ps.close();
		con.close();
		}catch (ClassNotFoundException e) {
			System.out.println(e + "=> 드라이버 로딩 오류");
		} catch (SQLException e) {
			System.out.println(e + " => DB 연결 실패");
		}catch (Exception e) {
			System.out.println(e + "=>일반 예외");
		}
	}
}
