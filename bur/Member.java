package bur;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Member {
//	==================================================================
	public void insert() throws ClassNotFoundException, SQLException {
		
		Connection con = Dbtest.getConnection();
		Statement stmt = null;
		String sql;
		String id = null, pw = null, name = null, nic = null, adr = null, email = null, num = null, bir = null;

		Scanner br = new Scanner(System.in);
		int result = 0;

		try {
			System.out.print("ID를 입력하세요");
			id = br.nextLine();
			System.out.print("비밀번호를 입력하세요");
			pw = br.nextLine();
			System.out.print("이름을 입력하세요");
			name = br.nextLine();
			System.out.print("닉네임을 입력하세요(8자이내)");
			nic = br.nextLine();
			System.out.print("연락처를 입력하세요(010-1234-1234)");
			num = br.nextLine();
			System.out.print("주소를 입력하세요");
			adr = br.nextLine();
			System.out.print("생일을 입력하세요(ex : 87/09/02)");
			bir = br.nextLine();
			System.out.print("email을 입력하세요");
			email = br.nextLine();

			sql = "INSERT INTO members VALUES ('" + id + "', '" + pw + "', '" + name + "', '";
			sql += nic + "', '" + num + "', '" + adr + "', '" + bir + "', '" + email + "', 0)";
			stmt = con.createStatement();
			result = stmt.executeUpdate(sql);
			System.out.println("회원 가입이 완료되었습니다.");
			stmt.close();

		} catch (Exception e) {
			System.out.println("오류가 발생했습니다. 처음부터 다시 시작하여 주십시오.");
			System.out.println(e.toString());

		}
		
	}

//		====================================================================
	public void update() throws ClassNotFoundException, SQLException {

		Connection con = Dbtest.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql;
		String id, pw, name, nic, adr, email, num, bir;
		int result;
		Scanner br = new Scanner(System.in);

		try {
			System.out.print("ID를 입력하세요");
			id = br.nextLine();
			String sql1 = "select mem_id from members where mem_id = '" + id + "'";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql1);
			rs.next();

//==============================첫번째 이프문 시작==========================	
			if (rs.getString(1).equals(id)) {

				System.out.print("비밀번호를 입력하세요");
				pw = br.nextLine();

				String sql2 = "select mem_pw from members where mem_pw = '" + pw + "'";
				stmt = con.createStatement();
				rs = stmt.executeQuery(sql2);
				rs.next();

//==============================두번째 이프문 시작==========================	
				if (rs.getString(1).equals(pw)) {

					System.out.print("이름을 입력하세요");
					name = br.nextLine();
					System.out.print("닉네님을 입력하세요(8자이내)");
					nic = br.nextLine();
					System.out.print("연락처를 입력하세요(010-1234-1234)");
					num = br.nextLine();
					System.out.print("주소를 입력하세요");
					adr = br.nextLine();
					System.out.print("생일을 입력하세요(ex : 87/09/02)");
					bir = br.nextLine();
					System.out.print("email을 입력하세요");
					email = br.nextLine();

					sql = "Update members set mem_name = '" + name + "', " + "mem_nic = '" + nic + "', " + "mem_num = '"
							+ num + "', ";
					sql += "mem_adr = '" + adr + "', mem_bir = '" + bir + "', mem_email = '" + email + "' ";
					sql += "where mem_id = '" + id + "'";
					stmt = con.createStatement();
					result = stmt.executeUpdate(sql);
					System.out.println("회원 정보 수정이 완료되었습니다. ");
					stmt.close();

				} else {
					System.out.println("회원 정보가 잘못 되었습니다.");
					System.out.println("처음부터 다시 시작하여 주십시오.");

				}
//======================두번째 이프문 끝============================					
				stmt.close();

			} else {
				System.out.println("회원 정보가 잘못 되었습니다.");
				System.out.println("처음부터 다시 시작하여 주십시오.");

			}
//======================첫번째 이프문 끝=============================		
			stmt.close();

		} catch (Exception e) {
			System.out.println("회원 정보가 잘못 되었습니다.");
			System.out.println(e.toString());
			System.out.println("처음부터 다시 시작하여 주십시오.");

		}

	}
//	=================================================================================

	public void delete() throws ClassNotFoundException, SQLException {

		Connection con = Dbtest.getConnection();
		Statement stmt = null;
		ResultSet rs = null;
		String sql;
		String id, pw;
		int result;
		Scanner br = new Scanner(System.in);

		try {
			System.out.print("ID를 입력하세요");
			id = br.nextLine();
			String sql1 = "select mem_id from members where mem_id = '" + id + "'";
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql1);
			rs.next();

//==========================첫번째 이프문===========================		
			if (rs.getString(1).equals(id)) {

				System.out.print("비밀번호를 입력하세요");
				pw = br.nextLine();

				String sql2 = "select mem_pw from members where mem_pw = '" + pw + "'";
				stmt = con.createStatement();
				rs = stmt.executeQuery(sql2);
				rs.next();
//=============================두번째 이프문============================				
				if (rs.getString(1).equals(pw)) {

					sql = "delete from members where mem_id = '" + id + "'";
					stmt = con.createStatement();
					result = stmt.executeUpdate(sql);

					System.out.println("회원 탈퇴가 완료되었습니다. ");
					stmt.close();

				} else {

					System.out.println("회원 정보가 잘못 되었습니다.");
					System.out.println("처음부터 다시 시작하여 주십시오.");

				}
//=============================두번째 이프문 끝============================						
			} else {
				System.out.println("회원 정보가 잘못 되었습니다.");
				System.out.println("처음부터 다시 시작하여 주십시오.");

			}
//==========================첫번째 이프문===========================

		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("회원 정보가 잘못 되었습니다.");
			System.out.println("처음부터 다시 시작하여 주십시오.");

		}
	}


}
