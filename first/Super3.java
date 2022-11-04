package first;

class AA1 {
	   double d1;

	   AA1() {
	      System.out.println("AA1의 생성자");
	      d1 = 10 * 10;
	   }
	}

	class AA2 extends AA1 {
	   double d2;

	   AA2() {
//	      super(); 
	      System.out.println("AA2의 생성자");
	      d2 = 10 * 10 * 10;
	   }
	}

	class AA3 extends AA2 {
	   double d3;//10000

	   AA3() {
//	      super();
	      System.out.println("AA3의 생성자");
	      d3 = 10 * 10 * 10 * 10;
	   }
	}

	public class Super3 {
	   public static void main(String args[]) {
	      AA1 super1 = new AA3();
	      System.out.println("10의 2제곱 : " + super1.d1);
//	      System.out.println("10의 3제곱 : " + super1.d2);
//	      System.out.println("10의 4제곱 : " + super1.d3);
	   }
	}