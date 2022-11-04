package inheritance;

public interface Radio extends Power {
//전원 기능을 상속받는 라디오
	void volup();
	//상속받는 클래스에서 구현해야하는 볼륨up 메소드
	void voldown();
	//상속받는 클래스에서 구현해야하는 볼륨down 메소드
}
