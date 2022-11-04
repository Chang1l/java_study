package first;

class Fruits {
	int apple, straw, grape, sum;

	// 멤버변수 생성
	public Fruits(int ap, int st, int gr) {
		apple = ap;
		straw = st;
		grape = gr;
		count();
//		sum = ap + st + gr;
		// 멤버변수 초기화 생성자
	}

	public int count() {// count 메소드
		sum = apple + straw + grape;
		return sum;
	}

}

public class Constructor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total;
		Fruits f1 = new Fruits(30, 30, 30);// 객체 생성및 초기화
		total = f1.sum;// count 리턴값 저장
		System.out.println("객체 f1의 총 개수 " + total);
		System.out.println("f1의 apple의 개수 " + f1.apple);
		Fruits f2 = new Fruits(50, 100, 0);
		System.out.println("객체 f2의 총 개수 " + f2.count());
	}

}
