package first.etc;

class Box1 {
	int width, height, depth;
	long idNum;
	static long boxID=100;
	
	static long getcurrentID() {
		//클래스 메소드는 클래스 변수만 사용
		
		return ++boxID;
		
	}
}
