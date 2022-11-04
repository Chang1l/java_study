package collectionEx;

import java.util.HashMap;
import java.util.Map.Entry;

public class CollEx07 {
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<>();
		// key, value로 입력이 가능
		// key를 null로 할 수 있고 value도 null로 할 수 있다.
		
		hm.put("hello", 123);
		hm.put("world", 345);
		hm.put(null, 555);
		hm.put(null, 777);//중복 덮어써짐
		hm.put("nullKey", null);
		hm.put("nullKey1", null);
		hm.replace(null, 333);// null 키 값 변경
		System.out.println(hm.get("world") + "\n");//키값이 월드인  value값 가져옴
		for (String key : hm.keySet()) {//키값을 가져와서 String key 에 저장
			System.out.println("key : " + key + ", value : " + hm.get(key));
			//키값가 해당 키에 대한 벨류 값 출력
		}
		System.out.println("\n\n");
		hm.remove(null);//키가 null 인거 삭제
		// entrySet 메서드는 key, value를 볼 수 있게 해준다.
		for (Entry<String, Integer> s : hm.entrySet()) {
			System.out.println(s.getKey() + ", " + s.getValue());
		}
	}
}
