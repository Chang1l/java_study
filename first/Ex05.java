package first;

class Point6{
	
	int x;//0
	int y;//0
	public Point6() {//생성자 
		System.out.println("매개변수가 없는 디폴트 생성자");}
	public void showPoint() {System.out.println(x+", "+y);}//메소드 =호출이 되어야 사용가능
}

public class Ex05 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Overload ob=new Overload();  //생성자 인스턴스화
//		double result;  //변수 생성
//		ob.test();   //메소드 호출
//		ob.test(5,10);//메소드 호출
//		result=ob.test(100);//메소드 호출 후 변수에 초기화(대입)
//		System.out.println("ob.test(100)의 결과: "+result);//출력
//		result=ob.test(4.2);//메소드 호출 후 변수에 초기화(대입)
//		System.out.println("ob.test(4.2)의 결과: "+result);//출력
		
		Point6 pt06=new Point6(); //객체생성
		pt06.showPoint();//메소드호출
	}

}

//class Overload{
//	void test() {System.out.println("매개변수 없음");}
//	//매개변수가 없는 test메소드 
//	void test(int a,int b) {System.out.println("매개변수 int"+a+"와 int "+b);}
//	//매개변수가 정수2개인 test메소드
//	double test(double a) {
//		System.out.println("매개변수 double"+a);
//		return a*2;
//		//더블형 리턴 값이 있는 test메소드
//	}
//	
//}
