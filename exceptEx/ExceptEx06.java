package exceptEx;

public class ExceptEx06 {

	public static void main(String[] args) {
		try {
			String c = null;
			System.out.println(" 문자열 값 :  " + c.toString());
		} catch (Exception e) {
			System.out.println(" >> 예외처리 구문 <<");
			System.out.println(" >> e << ");
			System.out.println(e);
			System.out.println(e.getCause());
			System.out.println("\n >> e.toString() << ");
			System.out.println(e.toString());
			System.out.println("\n >> e.getMessage() <<");
			System.out.println(e.getMessage());
			System.out.println("\n >> e.printStackTrace() <<");
			// 예외 발생 당시의 호출 스택에 있는 메소드의 정보와 예외 메시지를 화면에 출력
			e.printStackTrace();
		}finally{
			System.out.println("finally처리");
		}
		System.out.println("완료");
	}

}
