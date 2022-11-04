package collect_001_arraylist;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListExample {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("홍길동", "마이콜", "도치");
		for(String name: list1) {
			System.out.println(name);
		}
		System.out.println();
		for(int i = 0; i < list1.size(); i++ ) {
			System.out.println(list1.get(i));
		}
		System.out.println();
		
		List<Integer> list2 = Arrays.asList(1, 2, 3);
		for(int value : list2) {
			System.out.println(value);
		}
		System.out.println();
		
		for(int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
	}
}
