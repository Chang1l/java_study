package collectionEx;

import java.util.HashMap;
import java.util.Scanner;

class Login {
	private String Id;
	private String Pw;
	
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		this.Id = id;
	}
	public String getPw() {
		return Pw;
	}
	public void setPw(String Pw) {
		this.Pw = Pw;
	}


}

public class CollEx06 {

	public static void main(String[] args)throws Exception {
		HashMap<String, String> map = new HashMap<>();
		
		map.put("castello", "1234");
		map.put("asdf", "1111");
		map.put("lang", "1234");
		
		
		System.out.println("아이디를 입력하세요.");
		for(; ;) {
			Scanner sc = new Scanner(System.in);
			Login m = new Login();
			
			System.out.println("아이디: ");
			m.setId(sc.next());
			
			if(!map.containsKey(m.getId())) {
				System.out.println("아이디가 존재하지 않습니다.");
			}
			else {
				System.out.println("비밀번호: ");
				String key = map.get(m.getId());
				m.setPw(sc.next());
				if(m.getPw().equals((String)key)) {
					System.out.println("로그인 성공 \n프로그램을 종료합니다.");
					break;
				} else				
				System.out.println("비밀번호가 일치하지 않습니다.\n");
			}
		}
	}
}
