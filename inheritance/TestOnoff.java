package inheritance;

public class TestOnoff implements Moblie,Keyboard {
//모바일기능과 키보드 기능을 구현할 Test클래스
	int volume=0;//초기 볼륨값
	int light=0;//초기 밝기값
	final int MAXLIGHT=100;//최대 밝기 값
	final int MINLIGHT=0;//최소 밝기 값
	final int MAXVOL=50;//최대볼륨 값
	final int MINVOL=0;//최소볼륨 값

	@Override
	public void setkey() {
		//키보드 인터페이스에서 구현시키는 메소드		
		System.out.println("키보드를 눌렀습니다\n키보드를 눌렀다 떼었습니다.");
		
	}

	@Override
	public void minLight() {
		
		// 모바일 인터페이스에서 구현시키는 메소드
		if(light==0)System.out.println("최소 밝기입니다");
	}

	@Override
	public void restart() {
		// 모바일 인터페이스에서 구현시ㅣㅋ는 메소드
		System.out.println("핸드폰을 재시작하겠습니다");
	}

	@Override
	public void lightup() {
		// Tv 구현 메소드
		this.light=light+1;
		//현재 밝기 값에 메소드 호출시 밝기+1 
		if(light>100) {
		//만약 밝기가 100이 넘어가면
			System.out.println("밝기 : "+MAXLIGHT);
			//최대 밝기값 출력
			this.light=MAXLIGHT;
			//밝기 값 100으로 세팅
		}else  {//아닐경우 밝기값 출력
		System.out.println("밝기 : "+light);
		}
	}

	@Override
	public void lightdown() {
		// tv 구현 메소드
		this.light=light-1;
		//현재 밝기 값에 -1
		if(light<0) {
		//만약 밝기가 0 밑ㅇ,ㅡ로 내려가면
			System.out.println("밝기 : "+MINLIGHT);
			this.light=MINLIGHT;
			//밝기 0으로 세팅
		}else  {
		System.out.println("밝기 : "+light);
		}	}

	@Override
	public void volup() {
		// 라디오 메소드
		this.volume=volume+1;
		if(volume>50) {
		
			System.out.println("볼륨 : "+MAXVOL);
			this.volume=MAXVOL;
		}else  {
		System.out.println("볼륨 : "+volume);
		}
	}

	@Override
	public void voldown() {
		// 라디오 메소드
		this.volume=volume-1;
		if(volume<0) {
		
			System.out.println("볼륨 : "+MINVOL);
			this.volume=MINVOL;
		}else  {
		System.out.println("볼륨 : "+volume);
		}
	}

	@Override
	public void on() {
		// power 메소드
		System.out.println("전원이 켜졌습니다");
	}

	@Override
	public void off() {
		// power 메소드
		System.out.println("전원이 꺼졌습니다");
	}

	public void TVshow() {
		//클래스에서 구현하는 tv 기능 출력 메소드
		System.out.println("TV 기능을 시작합니다");
		this.on();
		this.volup();
		this.voldown();
		this.lightup();
		this.lightdown();
		this.off();
		System.out.println();
	}
	
	public void Radioshow() {
		System.out.println("Radio 기능을 시작합니다");
		this.on();
		this.volup();
		this.voldown();
		this.off();
		System.out.println();
	}
	public void KeyBoardshow() {
		System.out.println("Keyboard 기능을 시작합니다");
		this.on();
		this.setkey();
		this.off();
		System.out.println();
	}
	public void Moboileshow() {
		System.out.println("Mobile 기능을 시작합니다");
		this.on();
		this.volup();
		this.voldown();
		this.lightup();
		this.lightdown();
		this.minLight();
		this.restart();
		this.off();
		
		System.out.println();
	}
	
}
