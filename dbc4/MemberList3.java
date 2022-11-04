package dbc4;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MemberList3 {
	public static void main(String[] args) {
		try {
			Connection conn = DBConnec1.getConnection();
			String sql = "SELECT m_seq, m_userid, m_pwd, m_email, m_hp, m_registdate, m_point "
				+ "FROM tb_member ORDER BY m_seq desc";
			Statement stmt = conn.createStatement();//명령문 공간 생성
			ResultSet rs = stmt.executeQuery(sql);//select 쿼리는 executeQuery 사용
			//db 커서 객체 같은 기능
			
			System.out.println("번호\t아이디\t비밀번호\t이메일\t\t핸드폰번호\t\t가입일자\t\t\t포인트");
			while (rs.next()) {
				for (int i = 1; i <= 7; i++)//db는 1부터 시작 
					System.out.print(rs.getString(i) + "\t");
				System.out.println();
			}

			rs.close();
			stmt.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			try {
				DBConnec1.close();
			} catch (SQLException e) {
			}
		}
	}
}
