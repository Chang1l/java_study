package collectionEx;

import java.util.ArrayList;

public class CollEx03 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
//		ArrayList<String> list = new ArrayList<String>();
		list.add("사과");
		list.add("수박");
		list.add("귤");
		list.add("딸기");
		list.add("체리");
		list.add("사과");
		prn(list);

		System.out.println(">> 인덱스 2인 위치에 키위 삽입 <<");
		list.add(2, "키위");
		prn(list);

		System.out.println(">> 인덱스 4인 위치의 데이터를 포도로 변경 <<");
		list.set(4, "포도");
		prn(list);

		System.out.println(">> 인덱스 1인 위치의 데이터를 제거 <<");
		list.remove(1);
		prn(list);

		System.out.println(">> 사과 데이터를 찾아서 제거 <<");
		list.remove("사과");
		prn(list);
		
	}

	static void prn(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + "\t");
		System.out.println("\n");
	}
}