package first;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] a; // 문자열 배열 a 생성
		a = new String[] { "빨간불", "주황불", "녹색불" };
		// 문자열 배열a에 0번방부터 빨간불 ,1번방 주황불,2번방 녹색불 값 저장
		int i;// 정수형 i 선언

		for (i = 0; i < a.length; i++) {// i는 0부터 a 배열 길이 만큼 1씩 증가하면서 반복
			System.out.println("신호등이 " + a[i] + "일때");// 해당 번호 배열 안에 있는 값을 출력
			switch (i) {// 조건문 i의 값을 보고 해당 case를 선택
			case 0:
				System.out.println(" 보행자는 걷는다\n 자동차는 멈춘다");
				break;// 배열0번일 경우
			case 1:
				System.out.println(" 보행자는 걷널 준비를 한다\n 자동차는 멈출 준비를 한다");
				break;// 배열1번일 경우
			case 2:
				System.out.println(" 보행자는 멈춘다\n 자동차는 출발한다");
				break;// 배열2번일 경우
			}
		} // 반복 i++

	}

}
