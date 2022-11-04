package collect_003_hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample1 {
	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//객체 저장
		map.put("고영희", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);//키값 중복 덮어씀
		map.put("둘리", 95);
		
		System.out.println("총 Entry 수: " + map.size());//키 벨류 한쌍의 수 4
		
		//객체 찾기		
		System.out.println("\t홍길동 : " + map.get("홍길동"));//홍길동 이름을 가진 키값의 벨류를 가져옿ㅁ
		System.out.println();
		
		//객체를 하나씩 처리
		Set<String> keySet = map.keySet();//set에 map키값만 가져옴
		Iterator<String> keyIterator = keySet.iterator();//set 반복자 생성
		while(keyIterator.hasNext()) {//다음 요소 확인
		  String key = keyIterator.next();//다음 요소 가져옴
		  Integer value = map.get(key);//map에 키값에 해당되는 값을 가져옴
		  System.out.println("\t" + key + " : " + value); 
		}		
		System.out.println();	
		
		//객체 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수: " + map.size());
		
		//객체를 하나씩 처리
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
		  Map.Entry<String, Integer> entry = entryIterator.next();
		  String key = entry.getKey();
		  Integer value = entry.getValue();
		  System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		//객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수: " + map.size());
	}
}

