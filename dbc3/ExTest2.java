package dbc3;

import java.util.ArrayList;

public class ExTest2 {
	public static void main(String[] args) {
		ExDAO dao = new ExDAO();
		if(dao.insert(80, "관리과", "대구")>0) {
			System.out.println("정상처리");
		}
		else {
			System.out.println("처리 x");
		}
	}
}
