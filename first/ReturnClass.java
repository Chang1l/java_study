package first;

class Return{
	final int MAX=10;
	static int a;
	static{
		
		a=5;
	}
	
	
	public void say_nick(String nick) {
		if("fool".equals(nick)) {
			return;//메소드 종료
			}
		System.out.println("나의 별명은 "+nick+"입니다");
	}
	
	
}


public class ReturnClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Return rt= new Return();
		rt.say_nick("fool");
		System.out.println("출력결과 ");
		rt.say_nick("apple");
		System.out.println("출력결과 ");
	}

}
