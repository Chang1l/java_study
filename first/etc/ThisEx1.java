package first.etc;

public class ThisEx1 {
	   public static void main(String[] args) {
	      This a = new This();
	      a.amd();//amd 메소드 호출
	      a.setNum(2, "테스트");//메소드 호출 setter
	      a.amd();//메소드 호출
	      int x = a.getNum();//리턴받은 값 대입(초기화)
	      System.out.println(x);//지역변수x 출력
	      int y = a.getNum(5);//리턴받은 값 대입(초기화)
	      System.out.println(y);//지역변수y 출력
	   }
	}