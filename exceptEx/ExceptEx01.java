package exceptEx;

public class ExceptEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c;
		try {
//			c=0/4;
			c=4/0;
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("젯수는 0이 될 수 없습니다");
			System.out.println("0이상 되도록 변경해주세요");
		}
	}

}
