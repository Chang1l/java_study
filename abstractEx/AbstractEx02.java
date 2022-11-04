package abstractEx;

abstract class Shape {//추상클래스
	   public abstract void draw();
	}//추상메소드
	
class Circle extends Shape {
	//추상 상속받는 클래스
	   @Override //어노테이션 Annotation @기호로 시작
	   public void draw() {
	      System.out.println("원을 그리다.");
	   }//반드시 구현할 메소드 (재정의)
	}

	public class AbstractEx02 {
	   public static void main(String[] args) {
	      Shape ref = new Circle();//업캐스팅
	      ref.draw();
	   }
	}