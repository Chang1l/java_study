package interfaceEx;

public class A1 implements A{
	int a=10;
//	public static 
	final int CONS=2;
	
	public void display(String s) {
		// TODO Auto-generated method stub
		System.out.println("display 메소드 구현"+s);
	}
	public void imd() {
		// TODO Auto-generated method stub
		System.out.println("imd 메소드 재정의");
	}
	
}
