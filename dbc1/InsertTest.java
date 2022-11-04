package dbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
	private Connection con;
	private Statement st;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InsertTest(1,"Tom",100);
		new InsertTest(2,"javaking",500);
	}
	public InsertTest(int empno,String ename,double sal) {
		try {
			 Class.forName("oracle.jdbc.driver.OracleDriver");
				User user=new User();
				
				Connection con=DriverManager.getConnection(user.getUrl(),user.getUser(),user.getPwd());
				System.out.println("db연결 성공");
				
//				String sql= "insert into emp(empno,ename,sal) values("+empno + ",'" +ename+ "'," +sal+")";
				String sql = "update emp set comm=100 where ename='SMITH'";
//				String sql = "delete from emp where empno in(1,2)";
				st=con.createStatement();
				int result= st.executeUpdate(sql);
				//update insert delete는 executeUpdate 사용
				System.out.println("처리된 레코드 개수: "+result);
				
				st.close();
				con.close();
		}
		catch(ClassNotFoundException e){
			System.out.println(e+"=> 드라이버 연결 실패");
		}
		catch(SQLException e) {
			System.out.println(e+" => DB 연결 실패");
		}
		catch(Exception e) {
			System.out.println(e+"=>일반 예외");
		}
	}
	
}
