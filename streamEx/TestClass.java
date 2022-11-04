package streamEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class TestClass {
	static Connection conn;
	static PreparedStatement pst;
	static ResultSet rs;
	static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	static String user = "test", pw = "1111";

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		
		try {
			conn = DriverManager.getConnection(url, user, pw);
			Student st = null; 
			
		while(true) {	
			Scanner sc = new Scanner(System.in);
			System.out.print("학번입력 >> ");
			String n = sc.next();	
			
			
			if(n.length() != 9 ) {
				System.out.println("학번은 9자리로 입력해주세요.");
				continue;
			}

			String sql = "SELECT NAME, NUM, AGE, TEST_FUNC(CLASSNUM) AS CNAME FROM ACLASS WHERE NUM = ?";
			pst = conn.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			pst.setInt(1, Integer.parseInt(n));
			rs = pst.executeQuery();
			rs.last();
			
			if( rs.getRow() > 0) {
				rs.beforeFirst();
				while (rs.next()) {
					st = new Student(rs.getString("NAME"), rs.getString("CNAME"),
							rs.getInt("NUM"), rs.getInt("AGE"));
				}
				break;
			}else {
				System.out.println("존재하지 않는 데이터입니다.");
				continue;
			}
		}
		
		System.out.println(st);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				pst.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
