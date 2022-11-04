package first;

class C1 {
	   static int x;
	   static int y;
	}

	class C2 extends C1 {
	   static String x;
	}

	public class InhEx06 {
	   public static void main(String args[]) {
	      C2.x = "알기쉽게 해설한 자바";
	      C2.y = 20000;
	      C1.x = 30000;
	      System.out.println("C2.x : " + C2.x);
	      System.out.println("C2.y : " + C2.y);
	      System.out.println("C1.x : " + C1.x);
	   }
	}