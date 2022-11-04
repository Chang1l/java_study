package collectionEx;

import java.util.*;

public class CollEx01 {

	public static void main(String[] args) {
		// 리스트 생성
		ArrayList<String> arrList = new ArrayList<String>();
		
		// 리스트에 요소의 저장
		arrList.add("넷");
		arrList.add("둘");
		arrList.add("셋");
		arrList.add("하나");
		System.out.println(arrList);
		// 리스트 요소의 출력
		for (String s: arrList) {
			System.out.println(s);
		}
		
		
		List<String> lst = new ArrayList<String>();  
	      lst.add("alpha");
	      lst.add("beta");
	      lst.add("charlie");
	      System.out.println("lst객체: "+ lst);
	 
	      Iterator<String> iter = lst.iterator();
	      while (iter.hasNext()) {
	         String str = iter.next();
	         System.out.println(str);
	      }
	 
	      for (String str : lst) {
	         System.out.println(str);
	      }

	}

}
