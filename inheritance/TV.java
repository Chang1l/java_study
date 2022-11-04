package inheritance;

public interface TV extends Radio {
//라디오 기능을 상속받는 TV
	void lightup();
	//상속받는 클래스에서 구현해야하는 밝기up 메소드
	void lightdown();
	//상속받는 클래스에서 구현해야하는 밝기down 메소드
	
	
}
