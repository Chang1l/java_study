package collectionEx;

import java.util.HashMap;
import java.util.Scanner;

public class CollEx06_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map = new HashMap<>();// hashmap 생성
		map.put("castello", "1234");// map에 키 벨류 저장
		map.put("asdf", "1111");// map에 키 벨류 저장
		map.put("lang", "1234");// map에 키 벨류 저장

		Scanner sc = new Scanner(System.in);// 스캐너 생성

		while (true) {// 참일경우 계속 반복

			System.out.print("아이디 입력");
			String id = sc.next();// 스캐너로 입력

			if (map.containsKey(id)) {
				System.out.print("비밀번호 입력");
				String password = sc.next();
				if (map.get(id).equals(password)) {
					System.out.println("아이디와 비밀번호가 일치합니다");
					break;
				} else {
					System.out.println("패스워드가 일치하지않습니다\n");
				}
			} else {
				System.out.println("아이디가 없음\n");
			}

		}

	}

//		for(String key: map.keySet()) {
//			System.out.println("key"+key+"value : "+map.get(key));
//		}
}
