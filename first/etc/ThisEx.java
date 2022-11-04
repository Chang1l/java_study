package first.etc;

public class ThisEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisTest t01=new ThisTest(10,20);
		//매개변수 두개 생성자 호출 
		t01.showPoint();
		ThisTest t02=new ThisTest(30);
		//매개변수 한개 생성자 호출
		t02.showPoint();
		t02.setX(100);
		//t02객체의 x값 100 설정(초기화= 대입)
		t02.showPoint();
		ThisTest t03=new ThisTest();
		//t03 객체의 디폴트 생성자 호출
		t03.showPoint();
	}

}

