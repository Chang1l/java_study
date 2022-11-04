package interfaceEx;

class InterfaceClass implements Z {//Z 인터페이스 상속
	//클래스에서 추상메소드 재정의
	public void xmeth1() {//추상메소드 구현
		System.out.println("xmeth1() 메소드의 구현");
	}

	public void xmeth2() {//추상메소드 구현
		System.out.println("xmeth2() 메소드의 구현");
	}

	public void ymeth1() {//추상메소드 구현
		System.out.println("ymeth1() 메소드의 구현");
	}

	public void zmeth1() {//추상메소드 구현
		System.out.println("zmeth1() 메소드의 구현");
	}
	
}

public class XInterEx06 {
	public static void main(String arg[]) {
		InterfaceClass ic = new InterfaceClass();
		// ic 객체 생성
		ic.xmeth1();//메소드호출
		ic.xmeth2();//메소드호출
		ic.ymeth1();//메소드호출
		ic.zmeth1();//메소드호출
	}
}