package burgger;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberEx {

	public static void main(String[] args) {
		MemberDAO mDAO = new MemberDAO();
		String id=null, pw=null, nm=null, nk=null, ph=null, addr=null, bir=null, em=null;
		String str = "";
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("메뉴를 고르세요.");
			System.out.println("1.회원등록, 2.회원정보수정, 3.회원탈퇴, 4.회원목록조회, 5.종료");
			switch(sc.nextLine()) {
				case "1": case "회원등록":
					System.out.print("아이디 입력>> ");
					id = sc.nextLine();
					System.out.print("비밀번호 입력>> ");
					pw = sc.nextLine();
					System.out.print("이름 입력>> ");
					nm = sc.nextLine();
					System.out.print("닉네임 입력>> ");
					nk = sc.nextLine();
					System.out.print("폰번호 입력>> ");
					ph = sc.nextLine();
					System.out.print("주소 입력>> ");
					addr = sc.nextLine();
					System.out.print("생년월일 입력>> ");
					bir = sc.nextLine();
					System.out.print("이메일 입력>> ");
					em = sc.nextLine();
					mDAO.insertMember(id, pw, nm, nk, ph, addr, bir, em);
					break;
				case "2": case "회원정보수정":
					System.out.print("아이디 입력>> ");
					id = sc.nextLine();
					System.out.print("비밀번호 입력>> ");
					pw = sc.nextLine();
					System.out.print("닉네임 입력>> ");
					nk = sc.nextLine();
					System.out.print("폰번호 입력>> ");
					ph = sc.nextLine();
					System.out.print("주소 입력>> ");
					addr = sc.nextLine();
					System.out.print("생년월일 입력>> ");
					bir = sc.nextLine();
					System.out.print("이메일 입력>> ");
					em = sc.nextLine();
					mDAO.updateMember(id, pw, nk, ph, addr, bir, em);
					break;
				case "3": case "회원탈퇴":
					System.out.print("아이디 입력>> ");
					id = sc.nextLine();
					mDAO.deleteMember(id);
					break;
				case "4": case "회원목록조회":					
					ArrayList<MemberVO> mvArr = mDAO.selectList();
					for(MemberVO m: mvArr) {
						System.out.println(m);
					}
					break;
				default: 
					str = "종료";
					DBConnection.getClose();
			}
			
			if(str.equals("종료")) break;
		}
		System.out.println("종료되었습니다.");
	}

}
