package first;

class B1{int x;}

class B2 extends B1{String x;}

public class PaEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B2 b2=new B2();
		b2.x="자바 상속 extends";
		
		System.out.println("b2.x : "+b2.x);
		B1 b1=new B1();
		b1.x=5000;
		System.out.println("b1.x : "+b1.x);
		
		B1 b3= new B2();

		System.out.println("b3.x :"+b3.x);
	}

}
