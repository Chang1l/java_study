package burgger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class MemberDAO {
	String sql = null;
	Connection conn = DBConnection.getConnection();
	PreparedStatement ps = null;

	// 회원 등록
	public void insertMember(String id, String pw, String nm, String nk, String ph, String addr, String bir,
			String em) {
		sql = "INSERT INTO MEMBER (MEMBER_NUM ,MEMBER_PW , MEMBER_NM , MEMBER_NICK ,"
				+ "MEMBER_PHONE ,MEMBER_ADDR ,MEMBER_BIRTH , MEMBER_EMAIL,MEMBER_ID ) VALUES "
				+ "( MEMBER_MEMBER_ID_SEQ.NEXTVAL , ? , ? , ? , ? , ? , ? , ? , ?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, pw);
			ps.setString(2, nm);
			ps.setString(3, nk);
			ps.setString(4, ph);
			ps.setString(5, addr);
			ps.setString(6, bir);
			ps.setString(7, em);
			ps.setString(8, id);
			ps.executeUpdate();

			System.out.println(id + "님 회원정보가 등록되었습니다.");
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 회원 수정
	public void updateMember(String id, String pw, String nk, String ph, String addr, String bir, String em) {
		sql = "UPDATE MEMBER SET MEMBER_PW = ? , MEMBER_NICK=? , MEMBER_PHONE=? ,"
				+ "MEMBER_ADDR=? ,MEMBER_BIRTH=? , MEMBER_EMAIL =? WHERE MEMBER_ID = ? ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, pw);
			ps.setString(2, nk);
			ps.setString(3, ph);
			ps.setString(4, addr);
			ps.setString(5, bir);
			ps.setString(6, em);
			ps.setString(7, id);
			ps.executeUpdate();
			System.out.println(id + "님 회원정보가 수정되었습니다.");
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 회원 탈퇴
	public void deleteMember(String id) {
		sql = "DELETE FROM MEMBER WHERE MEMBER_ID = ? ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ps.executeUpdate();
			System.out.println(id + "님 회원탈퇴가 정상처리되었습니다.");
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 회원한명목록조회
	public MemberVO selectOne(String member_id, String member_pw) {
		MemberVO m = new MemberVO();
		sql = "SELECT * FROM MEMBER WHERE MEMBER_ID = ? AND MEMBER_PW = ?";
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, member_id);
			ps.setString(2, member_pw);
			rs = ps.executeQuery();
			if(rs.next()) {
				m.setMember_id(rs.getString("member_id"));
				m.setMember_nm(rs.getString("member_nm"));
				m.setMember_pw(rs.getString("member_pw"));
				m.setMember_addr(rs.getString("member_addr"));
				m.setMember_nick(rs.getString("member_nick"));
				m.setMember_phone(rs.getString("member_phone"));
				m.setMember_birth(rs.getString("member_birth"));
				m.setMember_email(rs.getString("member_email"));
				m.setMember_point(0);
			}else {
				m = null;
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return m;
	}

	// 회원목록조회
	public ArrayList<MemberVO> selectList() {
		ArrayList<MemberVO> mArr = new ArrayList<MemberVO>();
		Statement st = null;
		ResultSet rs = null;
		sql = "SELECT * FROM MEMBER";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				MemberVO m = new MemberVO();
				m.setMember_id(rs.getString("member_id"));
				m.setMember_nm(rs.getString("member_nm"));
				m.setMember_pw(rs.getString("member_pw"));
				m.setMember_nick(rs.getString("member_nick"));
				m.setMember_phone(rs.getString("member_phone"));
				m.setMember_birth(rs.getString("member_birth"));
				m.setMember_email(rs.getString("member_email"));
				m.setMember_point(0);
				mArr.add(m);
			}
			rs.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mArr;
	}

}
