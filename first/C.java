package first;

public class C extends P{
	String a="오버라이딩";
	
	
	public void md(){
		System.out.println(a+b);
		this.md1();
	}
	public void md1() {
		System.out.println("md1()메소드호출");
	}
}