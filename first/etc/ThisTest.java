package first.etc;

class ThisTest {

	int x, y;//멤버변수 지역변수 인스턴스 변수
	public ThisTest() {//디폴트 생성자
		this(10,10);
		//이 객체안에 매개변수 2개를 가진 생성자를 찾아서 호출ㄱ
		}
	public ThisTest(int x) {//매개변수 1개 생성자
		this(x,10);
		/*받은 x값과 두번째 매개변수 10을 가지고
		 *  매개변수2개를 가진 생성자 호출 ㄱ
		 */
	}
	public ThisTest(int x, int y) {//매개변수 2개 생성자
		this.x=x;//이 객체 맴버변수x에 받은 x값 대입
		this.y=y;//이 객체 맴버변수x에 받은 y값 대입
	}
	
	public void setX(int x) {//setter 
		this.x=x;  
		//setX메소드 호출시 int형 값을 받아 이객체 멤버변수 x에 대입
		
	}
	public void showPoint() {//메소드
		System.out.println(x+", "+y);
		//메소드 호출시 x값과 y값 출력
	}
}
