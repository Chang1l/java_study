package interfaceEx;

abstract class Shape {//추상클래스 생성
	public double res = 0;//더블형 res 0값설정

	public abstract double area();//추상메소드
	public abstract void draw();
	public void printArea() {//메소드
		System.out.println("면적은 " + res);
	}
}

class Rectangle extends Shape implements Drawable {
//클래스 상속 인터페이스 상속
	public int w = 10, h = 10;//in형 변수 설정
	@Override
	public double area() {//추상메소드 구현
		res = w * h;//10*10=100.0
		return res;//더블형 값으로 리턴
	}
	public void draw() {//추상메소드 구현
		System.out.println("사각형을 그리다.");
	}
}

public class InterEx02 {
	public static void main(String[] args) {
		Rectangle ref = new Rectangle();
		//ref이름의 Rectangle 객체 인스턴스 생성
		ref.area();//res에 100.0 리턴
		ref.printArea();//면적은 100.0
		ref.draw();//사각형을 그리다
	}
}
