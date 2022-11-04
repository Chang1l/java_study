package test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Scanner;

import test.Dbtest;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1 = new Test1(); // 객체생성

		t1.selectName();// 메소드 호출

	}

	public void selectName() { // 검색 메소드 구현

		try {// 예외처리
			while (true) {// 무한 반복
				Scanner sc = new Scanner(System.in);// 스캐너 객체 생성
				Connection conn = Dbtest.getConnection(); // jdbc 연결 클래스 호출 static
				String sql = "SELECT a.name, a.num, a.age,b.class FROM aclass a, aclassdept b where a.classnum=b.classnum and num=?";
				PreparedStatement pstmt = conn.prepareStatement(sql); // 캐시에 쿼리문 미리실행
				System.out.print("학번입력 ");
				String a1 = sc.nextLine();// 학번 입력
				pstmt.setString(1, a1);// 첫번째 바인드 변수에 입력값 대입
				
				ResultSet rs = pstmt.executeQuery();// 쿼리 실행
				if (a1.length() <= 9) {// 입력 값 길이가 9보다 작거나 같으면 실행

					if (rs.next() == true) {// 쿼리문 가져올 데이터가 있으면 출력
						System.out.println("로그인 되었습니다.");
						System.out.print("이름: " + rs.getString(1) + "\t"); // 1번 컬럼
						System.out.print("학번: " + rs.getString(2) + "\t");// 2번 컬럼
						System.out.print("나이: " + rs.getString(3) + "\t");// 3번 컬럼
						System.out.print("학과명: " + rs.getString(4) + "\t");// 4번 컬럼
						System.out.println();
						break;// while문 종료
					} else {
						System.out.println("존재하지않는 데이터입니다.");// 일치하는 데이터가 없을 경우
					}
				} else {
					System.out.println("입력이 잘못되었습니다");// 입력 값이 9자리를 넘을 경우
				}
				// 정보 출력

				rs.close();
				pstmt.close();// 마지막에 열었던 객체부터 종료
			}
		} catch (Exception e) {// 예외발생시 처리 구문
			System.out.println(e.toString());
		} finally {// 무조건 실행 구문
			try {
				Dbtest.close();// Dbtest 클래스에 close메소드 실행
			} catch (SQLException e) {// 예외 처리
			}

		}

	}
}
