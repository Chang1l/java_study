package collectionEx;

import java.util.*;

public class CollEx09 {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(2);
		set.add(1);
		set.add(3);
		System.out.println("HashSet add() 입력요소 출력: " + set); 
		
		set = new HashSet<Integer>(Arrays.asList(2,1,3));
		System.out.println("HashSet Arrays.asList() 입력요소 출력: " + set); 
		Iterator iter = set.iterator();	
		while(iter.hasNext()) {
		    System.out.print(iter.next()+"\t");
		}
		System.out.println();		
	
	}

}
