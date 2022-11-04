package interfaceEx;

public interface X {//인터페이스
	void xmeth1();//추상메소드
	void xmeth2();//추상메소드
}

interface Y {//인터페이스
	void ymeth1();//추상메소드
}

interface Z extends X, Y { // 두 개의 인터페이스 상속
	void zmeth1();//추상메소드
	
	//인터페이스 끼리 상속 받았으므로 추상메소드구현 X
}
