package exceptEx;

public class ExceptEx07 {

	public static void main(String[] args) {
		try  {
				method1();		
		} catch (Exception e)	{
				System.out.println("main 에서 예외 처리");
				System.out.println(e.getMessage());
//				e.printStackTrace();
		}
		System.out.println("종료");
	}

//	static void method1() throws Exception {
//		System.out.println("예외발생시키기");
//		throw new Exception(); // 예외를 고의로 발생시킴
//	}
	
	static void method1() {
		System.out.println("예외발생시키기");
		try {
			throw new Exception(); // 예외를 고의로 발생시킴
		} catch (Exception e) {
			System.out.println("자신이 처리");
			e.printStackTrace();
			
		} 
	}
}
