package collectionEx;

import java.util.*;

public class CollEx04 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();//컬렉션 ArrayList 생성
		list.add(new Student("자바왕", 1, 1));//학생클래스 객체 생성후 배열에 추가
		list.add(new Student("자바짱", 1, 2));
		list.add(new Student("홍길동", 2, 1));
		list.add(new Student("전우치", 2, 2));

		Iterator<Student> it = list.iterator();//학생 자료형 반복자 생성

		while (it.hasNext()) {//다음 객체 확인 있으면 반복
			Student s = it.next();//다음 객체 값을 가져옴
			System.out.println(s.name + " " + s.ban + "반 " + s.no + "번");
			//학생 클래스에 들어있는 변수 출력
		}
	}
}

class Student {
	String name = "";
	int ban;
	int no;//변수

	Student(String name, int ban, int no) { //생성자
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}