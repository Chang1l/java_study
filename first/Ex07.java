package first;
//class Point7 {//클래스
//	int x;//멤버변수
//	int y;//멤버변수
//	public  Point7() {//디폴트생성자
//		System.out.println("디폴트생성자");
//	}
//	public Point7(int new_x, int new_y) {//생성자
//		x= new_x;
//		y= new_y;
//	}
//	public void showPoint() {//메소드
//		System.out.println(x+", "+y);
//	}
//}

public class Ex07 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Point7 pt07=new Point7(100,200);//클래스 객체 생성 및 초기화
//		System.out.println(pt07.x+", "+pt07.y);
//		Point7 pt08=new Point7(300,400);
//		System.out.println(pt08.x+", "+pt08.y);
//		Point7 pt=new Point7();
//		pt.showPoint();//해당 객체의 메소드 호출
//	
//		pt08.showPoint();
		Point2 pt02=new Point2();//객체 생성과 동시에 초기화 (디폴트생성자 자동)
		pt02.setX(10);//객체 메소드 호출 
		pt02.setY(20);
		
		System.out.println(pt02.getX()+", "+pt02.getY());
		
	}

}
