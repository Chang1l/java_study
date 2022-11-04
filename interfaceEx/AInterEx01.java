package interfaceEx;

public class AInterEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob=new A1();
		
		ob.display("테스트1");
		System.out.println("A의 상수 값은 : "+ob.CONS);
		System.out.println("A.CONS :"+A.CONS);
		
		
		A1 ob1= new A1();
		ob1.display("테스트2");
		System.out.println("A의 상수 값은 : "+ob1.CONS);
		System.out.println("A1.CONS :"+A.CONS);
		
	}

}
