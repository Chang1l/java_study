package first;

public class MainClass {

	public static void main(String[] args) {
		int a=5,b=10;
		AddClass ac= new AddClass();//객체 인스턴스화	
		ac.add(a,b);//해당객체(클래스)에 .으로 메소드 접근
		System.out.println(ac.add(a,b));
	}

}

 class AddClass {
	 int x=0;
	public int add(int a, int b) {
		
		return a+b;
	}
	
}
