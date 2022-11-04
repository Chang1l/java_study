package first.etc;

class Method{
	int a=10,b=20;
	int add() {
		return a+b;
	}
	static int add(int x, int y) {
		return x+y;
	}
}

class Field {

	static int classVar=10;//클래스 변수
	int instanceVar=20;//인스턴스 변수
	final int MAX=100;//상수
	
	void method() {
		int somthing=10;//지역변수
		System.out.println(somthing);
	}
	
}

public class Prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(Method.add(20,30));
//		
//		Method myMethod= new Method();
//		System.out.println(myMethod.add());
		
		int var=30;
		System.out.println(var+"\n");//지역변수
		
		Field myField1= new Field();
		Field myField2= new Field();

		System.out.println(Field.classVar);//10 필드객체의 멤버변수 값
		System.out.println(myField1.classVar);//10
		System.out.println(myField2.classVar+"\n");//10
		
		
		myField1.classVar=100;
		//100 classvar는 스태틱변수이기 때문에 스태틱메모리영역에서 값을 따로 관리 
		System.out.println(Field.classVar);//100 스태틱 영역이라 객체 생성 없이 바로 접근가능
		System.out.println(myField1.classVar);//100
		System.out.println(myField2.classVar+"\n");//100
		
		System.out.println(myField1.instanceVar);//20
		System.out.println(myField2.instanceVar+"\n");//20
		
		myField1.instanceVar=200;//인스턴스 변수이기에 myField1 객체의 변수값은 200
		
		System.out.println(myField1.instanceVar);//1객체는 200
		System.out.println(myField2.instanceVar);//2객체는 20
		myField1.method();// 메소드내 지역변수출력
	}

}
