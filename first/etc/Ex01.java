package first.etc;
//import second.Ex01;
public class Ex01 {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		second.Ex01 ex01=new second.Ex01();
		
		
		StaticClass s1= new StaticClass();
		s1.md();
		s1.md1();//2

		StaticClass s2= new StaticClass();
		s2.md();
		s2.md1();//3
//		StaticClass.b=1;
		StaticClass.md1();//4
	}

}
