package first.etc;

public class Account {
	int count;
	static int total;
	
	
	public Account(int amount) {
		count +=amount;
		total +=amount;
		//객체 생성시 실행 되는 생성자.
	}
	
}
