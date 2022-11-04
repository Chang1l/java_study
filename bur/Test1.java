package bur;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member m1 = new Member();
		Test1 t1 = new Test1();
		Product p1 = new Product();
		String ch;

		Scanner sc = new Scanner(System.in);

		try {

			System.out.println("1.주문하기 2.회원관리 3.상품등록 0.종료");
			System.out.println("번호를 입력해주세요");

			ch = sc.nextLine();

			switch (ch.replace(" ", "")) {
			case "1":

				System.out.println("로그인"); // t1메소드 구현
				t1.selectName();

				break;
			case "2":
				System.out.println("회원관리 메뉴");
				System.out.println("1.회원가입 2.회원수정 3.회원탈퇴");
				System.out.println("번호를 입력해주세요");
				ch = sc.nextLine();
				switch (ch.replace(" ", "")) {

				case "1":

					System.out.println("회원가입 정보를 입력해주세요 ");
					m1.insert();

					break;

				case "2":
					System.out.println("수정할 정보를 입력해주세요 ");
					m1.update();

					break;
				case "3":

					System.out.println("탈퇴할 정보를 입력해주세요 ");
					m1.delete();
					break;

				}

				break;
			case "3":
				System.out.println("상품등록 메뉴");
				System.out.println("관리자로 로그인 해주세요");
				p1.selectName();

				System.out.println("1.상품등록 2.상품수정 3.상품삭제 4.회원검색");
				ch = sc.nextLine();
				switch (ch.replace(" ", "")) {

				case "1":
					p1.insertmenu();
					break;

				case "2":
					p1.updatemenu();
					break;
				case "3":
					p1.deletemenu();
					break;
				case "4":
					p1.selectUser();
				}

				break;

			case "0":
				System.out.println("종료되었습니다.");
				break;
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

	public void selectName() { // 로그인 처리
		User user = null;
		try {// 예외처리
			while (true) {

				Scanner sc = new Scanner(System.in);
				Connection conn = Dbtest.getConnection();
				String sql = "SELECT * from members where mem_id=? and mem_pw =?";
				PreparedStatement pstmt = conn.prepareStatement(sql);
				System.out.print("아이디입력 ");
				String id = sc.nextLine();
				pstmt.setString(1, id);
				System.out.print("비밀번호입력 ");
				String pw = sc.nextLine();

				pstmt.setString(2, pw);
				ResultSet rs = pstmt.executeQuery();
				String pk, name, ph, add = null;
				if (rs.next()) {
					user = new User(rs.getString("mem_id"), rs.getString("mem_name"), rs.getString("mem_nic"),
							rs.getString("mem_num"), rs.getString("mem_adr"));

					if (id.equals(rs.getString("mem_id")) && pw.equals(rs.getString("mem_pw"))) {
						System.out.println("로그인 성공");

						Test1.selectMenu(user);

						break;
					}
				} else {

					System.out.println("존재하지않는 회원입니다.");
					sql = "Insert into MEMBERS (MEM_ID,MEM_NAME,MEM_NIC,MEM_NUM,MEM_ADR) values (?,?,'비회원',?,?)";
					pstmt = conn.prepareStatement(sql);

					System.out.print("임시비번입력 ");
					pk = sc.nextLine();
					pstmt.setString(1, pk);
					System.out.print("이름입력");
					name = sc.nextLine();
					pstmt.setString(2, name);
					System.out.print("연락처입력 ");
					ph = sc.nextLine();
					pstmt.setString(3, ph);

					System.out.print("주소입력");
					add = sc.nextLine();
					pstmt.setString(4, add);
					int result = pstmt.executeUpdate();
					if (rs.next()) {

						user = new User(rs.getString("mem_id"), rs.getString("mem_name"), rs.getString("mem_nic"),
								rs.getString("mem_num"), rs.getString("mem_adr"));

					}

					System.out.println("비회원 처리 되었습니다.");
					System.out.println(user);
					Test1.selectMenu(user);

				}

				rs.close();
				pstmt.close();
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {// 무조건 실행 구문
			try {
				Dbtest.close();// Dbtest 클래스에 close메소드 실행
			} catch (SQLException e) {// 예외 처리
			}

		}

	}

	private static void selectMenu(User user) {
		// TODO Auto-generated method stub\

		String MEMO = null;
		int cnt = 0;
		String ch;
		User user2 = user;
		String id = user2.getId();
		String name = user2.getName();
		String nic = user2.getNic();
		String num = user2.getNum();
		String add = user2.getAdd();
		String menu_id = null;
		Scanner sc = new Scanner(System.in);

		try {

			Connection conn = Dbtest.getConnection();
			Test1 t1 = new Test1();
			System.out.println("메뉴선택");

			while (true) {
				int e = 1;
				String sql = "SELECT * from menu where Menu_id like   ? || '%' ";

				System.out.println("메뉴를 선택해주세요 1.버거 2.사이드 3.음료 0.주문완료 ");

				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = null;
				ch = sc.nextLine();
				e = Integer.parseInt(ch);
				switch (ch.replace(" ", "")) {
				case "1":
					System.out.println("1.버거 메뉴");
					pstmt.setString(1, "B");
					rs = pstmt.executeQuery();

					int i = 1;
					while (rs.next()) {

						System.out.print(i + " ");
						System.out.print(rs.getString("Menu_name") + " ");
						System.out.println(rs.getString("price"));
						i++;

					}

					while (true) {
						sql = "SELECT * from menu where Menu_id like   ? ";
						pstmt = conn.prepareStatement(sql);
						ch = null;
						System.out.println("메뉴를 골라주세요  /0번 메뉴 선택 종료");
						ch = sc.nextLine();
						if (ch.equals("0")) {
							break;
						}
						System.out.println(ch + "번 메뉴가 선택되었습니다");

						pstmt.setString(1, "B" + ch);
						rs = pstmt.executeQuery();
						while (rs.next()) {
							menu_id = rs.getString("menu_id");
							System.out.print(rs.getString("Menu_name") + "가 선택되었습니다. ");
						}
						int result = 0;
						System.out.println("개수를 선택해주세요");
						ch = sc.nextLine();
						cnt = Integer.parseInt(ch);
						System.out.println(cnt + "개 선택 되었습니다");
						// insert 처리 들가야할듯
						sql = " INSERT INTO ORDERS (NO, o_date ,mem_nic ,mem_num ,mem_adr ,menu_id, cnt, mem_id) "
								+ " VALUES (TO_CHAR(SYSDATE,'YYMMDD')||LPAD(list_seq.nextval, 4, '0'),systimestamp,?,?,?,?,?,?)";
						pstmt = conn.prepareStatement(sql);
						pstmt.setString(1, nic);
						pstmt.setString(2, num);
						pstmt.setString(3, add);
						pstmt.setString(4, menu_id);
						pstmt.setInt(5, cnt);
						pstmt.setString(6, id);
						result = pstmt.executeUpdate();

					}
					rs.close();

					break;
				case "2":
					System.out.println("2.사이드 메뉴");
					pstmt.setString(1, "S");
					rs = pstmt.executeQuery();

					i = 1;
					while (rs.next()) {

						System.out.print(i + " ");
						System.out.print(rs.getString("Menu_name") + " ");
						System.out.println(rs.getString("price"));
						i++;

					}
					while (true) {
						sql = "SELECT * from menu where Menu_id like   ? ";
						pstmt = conn.prepareStatement(sql);
						ch = null;
						System.out.println("메뉴를 골라주세요 /0번 메뉴 선택 종료");
						ch = sc.nextLine();
						if (ch.equals("0")) {
							break;
						}
						System.out.println(ch + "번 메뉴가 선택되었습니다");

						pstmt.setString(1, "S" + ch);
						rs = pstmt.executeQuery();
						while (rs.next()) {

							System.out.print(rs.getString("Menu_name") + "가 선택되었습니다. ");
						}

						System.out.println("개수를 선택해주세요");
						ch = sc.nextLine();
						cnt = Integer.parseInt(ch);
						System.out.println(cnt + "개 선택 되었습니다");
						// insert 처리 들가야할듯

					}
					rs.close();

					break;

				case "3":
					System.out.println("3.음료 메뉴");
					pstmt.setString(1, "D");
					rs = pstmt.executeQuery();

					i = 1;
					while (rs.next()) {

						System.out.print(i + " ");
						System.out.print(rs.getString("Menu_name") + " ");
						System.out.println(rs.getString("price"));
						i++;

					}
					while (true) {
						sql = "SELECT * from menu where Menu_id like   ? ";
						pstmt = conn.prepareStatement(sql);
						ch = null;
						System.out.println("메뉴를 골라주세요 /0번 메뉴 선택 종료");
						ch = sc.nextLine();
						if (ch.equals("0")) {
							break;
						}
						System.out.println(ch + "번 메뉴가 선택되었습니다");

						pstmt.setString(1, "D" + ch);
						rs = pstmt.executeQuery();
						while (rs.next()) {

							System.out.print(rs.getString("Menu_name") + "가 선택되었습니다. ");
						}

						System.out.println("개수를 선택해주세요");
						ch = sc.nextLine();
						cnt = Integer.parseInt(ch);
						System.out.println(cnt + "개 선택 되었습니다");
						// insert 처리 들가야할듯

					}
					rs.close();

					break;
				case "0":
					System.out.println("고객요청사항 입력");
					MEMO = sc.nextLine();
					t1.orderend(id, menu_id);
					break;

				}

				pstmt.close();
				if (e == 0) {
					break;
				}
			}

		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {// 무조건 실행 구문
			try {
				Dbtest.close();// Dbtest 클래스에 close메소드 실행
			} catch (SQLException e) {// 예외 처리
			}

		}
	}

	public static String checkNull(String str, String replaceStr) {
		return (str == null || str.equals("")) ? replaceStr : str;
	}

	public void orderend(String id, String menu_id) {
		try {
			String g, ml, kcal, sugar, protein, fat, nat, caffeine = null;
			String id2 = id;
			String menu_id2 = menu_id;

			Connection conn = Dbtest.getConnection();
			String sql = "SELECT o_date ,mem_id ,mem_nic, mem_num, mem_adr , menu_name, price, cnt , memo, m.menu_id FROM orders o, menu m where o.menu_id=m.menu_id and mem_id=?  ";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id2);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println("V 주문서(영수증) 출력내용");
				System.out.println("=================================================================");

				System.out.println("주문서");
				System.out.println("지점명: 맥도날드 안양점");
				System.out.println(rs.getString(1));
				System.out.println("");
				System.out.println("담당자 : 홍길동 ");
				System.out.println("");
				System.out.println("주문자: " + rs.getString(3));
				System.out.println("연락처: " + rs.getString(4));
				System.out.println("주소: " + rs.getString(5));
				System.out.println();
				int price = Integer.parseInt(rs.getString(8));
				int cnt = Integer.parseInt(rs.getString(7));
				int total = price * cnt;
				System.out.println("주문내용:");
				System.out.println(rs.getString(6) + " " + rs.getString(8) + "개 " + total + "원");
				System.out.println();
				System.out.println("총 금액 " + total);

				System.out.println("------------------------------------------");
				System.out.println("고객요청사항: " + rs.getString(9));

				System.out.println("------------------------------------------");
				String food = rs.getString(10);
				sql = "  select *from menu m, orders o where m.menu_id=o.menu_id and o.mem_id=?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, id);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					System.out.println(rs.getString(2));
					g = rs.getString(4);
					g = Test1.checkNull(g, "");
					System.out.println("중량(g):" + g + "g");
					ml = rs.getString(5);
					ml = Test1.checkNull(ml, "");
					System.out.println("중량(ml):" + ml + "ml");
					kcal = rs.getString(5);
					kcal = Test1.checkNull(kcal, "");
					System.out.println("칼로리:" + kcal + "kcal");
					sugar = rs.getString(5);
					sugar = Test1.checkNull(sugar, "");
					System.out.println("당:" + sugar + "g");
					protein = rs.getString(5);
					protein = Test1.checkNull(protein, "");
					System.out.println("단백질:" + protein + "21g");
					fat = rs.getString(5);
					fat = Test1.checkNull(fat, "");
					System.out.println("포화지방:" + fat + "g");
					nat = rs.getString(5);
					nat = Test1.checkNull(nat, "");
					System.out.println("나트륨:" + nat + "mg");
					caffeine = rs.getString(5);
					caffeine = Test1.checkNull(caffeine, "");
					System.out.println("카페인:" + caffeine + "ml");
					System.out.println();
				}
				System.out.println("=================================================================");
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {// 무조건 실행 구문
			try {
				Dbtest.close();// Dbtest 클래스에 close메소드 실행
			} catch (SQLException e) {// 예외 처리
			}

		}
	}
}
