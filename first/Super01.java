package first;
//
//
//class Pa3{
//	int x= 1000;
//	void display() {
//		System.out.println("상위클래스 display()");
//	}
//	
//}
//class Ch3 extends Pa3{
//	
//	 int x=2000;
//	 void display() {
//			System.out.println("하위클래스 display()");
//		}
//	 void write() {
//		 super.display();
//		 this.display();
//		 System.out.println("super.x : "+super.x);
//		 System.out.println("this.x :"+x);
//	 }
//}
//
//
//public class Super01 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Ch3 c=new Ch3();
//
//		c.write();
//		
//	}
//
//}
//
//

public class Super01 {
   public static void main(String[] args) {
      Pt pt = new Pt();
      pt.display();
      
      Cd ch = new Cd();
      ch.display();
      
      Pt ch1 = new Cd();
      ch1.display();
   }
}

class Pt {
   private int a = 10;
   public int b = 20;
   void display() {
      System.out.println("Pt_a: " + a);
      System.out.println("Pt_b: " + b);
      System.out.println("=====================");
   }
   
   public int getA() {
      return a;
   }
   
}

class Cd extends Pt {
   public int c = 30;
   void display() {
//      System.out.println("Cd_a: " + a); 
      System.out.println("Cd_a: " + getA());
      System.out.println("Cd_b: " + b); 
      System.out.println("Cd_c: " + c); 
      System.out.println("=====================");
   }
}