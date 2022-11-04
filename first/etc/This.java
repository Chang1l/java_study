package first.etc;

class This {
	int num = 1;
	String str = "한글";

	public void setNum(int num, String str) {//setter
		this.num = num;//멤버변수에 매개인자 대입해서 초기화
		this.str = str;//멤버변수에 매개인자 대입해서 초기화
	}

	public int getNum() {//멤버변수 num값 리턴
		return num;
	}

	public int getNum(int j) {
		//멤버변수 num 값에 매개인자 j를 곱하여 num에 초기화하고 num 값 리턴
		this.num = num * j;
		return num;
	}

	public void amd() {
		int num = 3;//지역변수
		 String str = "wow";
//		int str = 7;//지역변수
		if (num <= 5) {//5가 5랑 같거나 작으면 출력
//			 int num = 3;
			System.out.println("this.num 는 " + this.num);//멤버변수 출력
//			
			System.out.println("this.str는 " + this.str);//멤버변수 출력
		}
		System.out.println("num 는 " + num);//지역변수 출력
		System.out.println("str는 " + str);//지역변수 출력
		System.out.println();

	}

}