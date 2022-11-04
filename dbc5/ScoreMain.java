package dbc5;

import java.util.Scanner;

public class ScoreMain {
	public static void main(String[] args) {
		String ch;
		Score ob = new Score(); // 스코어 객체 생성
		Scanner sc = new Scanner(System.in);

		try {
			while (true) {
				System.out.print("1.입력 2.수정 3.삭제 4.이름검색 5.전체출력 6.종료=>");
				ch = sc.nextLine();// 한줄 단위 입력 엔터
									//next() 공백으로 구분

				switch (ch.replace(" ", "")) {// 공백 있을경우 공백 제거로 변환
				case "1":
				case "입력": // 1 이나 입력
					if (ob.insertDate() != 0)// 스코어 객체 입력 메소드
						System.out.println("입력 성공!");
					break;
				case "2":
				case "수정":
					if (ob.updateData() != 0)// 스코어 객체 수정 메소드
						System.out.println("수정 성공!");
					else
						System.out.println("수정 실패!");
					break;
				case "3":
				case "삭제":
					if (ob.deleteDate() != 0)// 스코어 객체 삭제 메소드
						System.out.println("삭제 성공!");
					else
						System.out.println("삭제 실패!");
					break;
				case "4":
				case "이름검색":
					ob.selectName();
					break;
				case "5":
				case "전체출력":
					ob.selectAll();
					break;
				case "6":
					System.out.println("종료되었습니다.");
					DBConn.close();
					System.exit(0);//0 정상종료 1 강제종료
				}
			}
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}