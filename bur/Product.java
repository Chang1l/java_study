package bur;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

import dbc5.DBConn;

public class Product {
	public  void selectName() { // 검색 메소드 구현

		try {// 예외처리
			while (true) {// 무한 반복
				Scanner sc = new Scanner(System.in);
				Connection conn = Dbtest.getConnection();
				String sql = "SELECT * from members where mem_id=? and mem_pw =?";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				System.out.print("관리자 아이디입력 ");
				String id = sc.nextLine();
				pstmt.setString(1, id);
				System.out.print("관리자 비밀번호입력 ");
				String pw = sc.nextLine();

				pstmt.setString(2, pw);
				ResultSet rs = pstmt.executeQuery();

				if (id.equals("admin")) {
					System.out.println("관리자로 로그인 되었습니다.");

					System.out.println();

					break;
				} else {
					System.out.println("관리자가 아닙니다.");
				}

				rs.close();
				pstmt.close();
			}
		} catch (Exception e) {

		}
	}

	public int updatemenu() {
		int result = 0;
		Connection conn = DBConn.getConnection();
		Statement stmt = null;

		String menu_id, menu_name, cal, sql, weight_g, weight_ml, sugar, protein, fat, nat, caffeine;
		int price;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("수정할 menu_id?");
			menu_id = br.readLine();
			System.out.print("수정할 menu_name?");
			menu_name = br.readLine();
			System.out.print("수정할 가격?");
			price = Integer.parseInt(br.readLine());
			System.out.print("수정할 중량g?");
			weight_g = br.readLine();
			System.out.print("수정할 중량ml?");
			weight_ml = br.readLine();
			System.out.print("수정할 열량?");
			cal = br.readLine();
			System.out.print("수정할 당?");
			sugar = br.readLine();
			System.out.print("수정할 단백질?");
			protein = br.readLine();
			System.out.print("수정할 포화지방?");
			fat = br.readLine();
			System.out.print("수정할 나트륨?");
			nat = br.readLine();
			System.out.print("수정할 카페인?");
			caffeine = br.readLine();

			sql = "UPDATE menu SET ";
			sql += "menu_id='" + menu_id + "',";
			sql += "menu_name='" + menu_name + "',";
			sql += "price='" + price + "',";
			sql += "weight_g='" + weight_g + "',";
			sql += "weight_ml='" + weight_ml + "',";
			sql += "cal='" + cal + "',";
			sql += "sugar='" + sugar + "',";
			sql += "protein='" + protein + "',";
			sql += "fat='" + fat + "',";
			sql += "nat='" + nat + "',";
			sql += "caffeine='" + caffeine + "'";
			sql += " WHERE menu_id=" + "'" + menu_id + "'";

			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);

			int count = stmt.executeUpdate(sql);

			if (count > 0) {
				System.out.println("상품 수정 되었습니다.");
			} else {
				System.out.println("다시 수정해주세요.");
			}
			stmt.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		return result;
	}

	public int deletemenu() {
		int result = 0;
		Connection conn = DBConn.getConnection();
		Statement stmt = null;
		String sql, menu_id;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("삭제할 상품의 상품번호?");
			menu_id = br.readLine();
			sql = "DELETE FROM menu WHERE menu_id='" + menu_id + "'";
			stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			result = stmt.executeUpdate(sql);

			if (count > 0) {
				System.out.println("삭제되었습니다.");
			} else {
				System.out.println("해당 번호가 없습니다.");
			}
			stmt.close();
		} catch (Exception e) {

			System.out.println(e.toString());
		}
		return result;
	}

	public void insertmenu() {
		int result = 0;
		Connection conn = DBConn.getConnection();
		Statement stmt = null;

		String menu_id, menu_name, cal, sql, weight_g, weight_ml, sugar, protein, fat, nat, caffeine;
		int price;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {

			System.out.print("등록할 menu_id?");
			menu_id = br.readLine();
			System.out.print("등록할 menu_name?");
			menu_name = br.readLine();
			System.out.print("등록할 가격?");
			price = Integer.parseInt(br.readLine());
			System.out.print("등록할 중량3g?");
			weight_g = br.readLine();
			System.out.print("등록할 중량ml?");
			weight_ml = br.readLine();
			System.out.print("등록할 열량?");
			cal = br.readLine();
			System.out.print("등록할 당?");
			sugar = br.readLine();
			System.out.print("등록할 단백질?");
			protein = br.readLine();
			System.out.print("등록할 포화지방?");
			fat = br.readLine();
			System.out.print("등록할 나트륨?");
			nat = br.readLine();
			System.out.print("등록할 카페인?");
			caffeine = br.readLine();

			sql = "INSERT INTO MENU VALUES (";
			sql += "'" + menu_id + "' ,'" + menu_name + " ',";
			sql += "" + price + ",'" + weight_g + "','" + weight_ml + "'," + "'" + cal + "',";
			sql += "'" + sugar + "','" + protein + "','" + fat + "','" + nat + "','" + caffeine + "')";

			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);

			int count = stmt.executeUpdate(sql);

			if (count > 0) {
				System.out.println("상품 등록이 되었습니다.");
			} else {
				System.out.println("다시 등록해주세요.");
			}

			stmt.close();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

//	public void selectUser() {
//		// TODO Auto-generated method stub
//		try {// 예외처리
//			while (true) {// 무한 반복
//				Scanner sc = new Scanner(System.in);
//				Connection conn = Dbtest.getConnection();
//				String sql = "SELECT * from members ";
//				PreparedStatement pstmt = conn.prepareStatement(sql);
//				int result=pstmt.executeUpdate();
//				ResultSet rs = pstmt.executeQuery();
//
//				while(rs.next()) {
//				
//					
//				}
//				rs.close();
//				
//				pstmt.close();
//			}
//		} catch (Exception e) {
//
//		}
//	}
}
