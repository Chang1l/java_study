package innerEx;

class Outer {
	int data = 0;
	static int data1 = 50;
	
	void myMethod() {
		System.out.println("Outer 클래스의 메소드 data : "+data);
	}

	// 내부클래스 1 - 멤버 이너 클래스
	class InstanceInner{
		int iv = 100;

		void myMethod() {
			System.out.println("InstanceInner 클래스의 메소드 data : "+data + ", iv: "+ iv );
		}
	}
	
	// 내부클래스 2 - 정적 클래스
	static class StaticInner {
		int iv = 200;
		static int cv = 300;
		
		void myMethod() {
			System.out.println("StaticInner 클래스의 메소드 data1 : "+data1);
//			System.out.println("StaticInner 클래스의 메소드 data : "+data);
//			클래스 외부 데이터인 경우는 static만 올 수 있다.
			System.out.println("StaticInner 클래스의 iv : "+iv +", cv: "+cv );
		}
	}
}

public class InnerEX01 {
	public static void main(String[] args) {
		Outer outer = new Outer();
		//내부클래스 객체 생성
		Outer.InstanceInner instanceInner = outer.new InstanceInner();
		System.out.println("instanceInner.iv : " + instanceInner.iv);//100
		System.out.println();
		System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv);//300
		Outer.StaticInner.cv = 50;//50저장
		System.out.println("Outer.StaticInner.cv : " + Outer.StaticInner.cv);//50

		Outer.StaticInner staticInner = new Outer.StaticInner();
		System.out.println("staticInner.iv : " + staticInner.iv);//200
		System.out.println();
		outer.myMethod();//0
		instanceInner.myMethod();//0, 100
		staticInner.myMethod();//200, 50
		
		staticInner.iv = 50;
		System.out.println("staticInner.iv : " + staticInner.iv);//50
	}
}
