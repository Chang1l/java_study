package abstractEx;

abstract class Shape1 {
   public double res = 0;
   public abstract double area();
   public void printArea() {
      System.out.println("면적은 " + res);
   }
}

class Circle1 extends Shape1 {
   public int r = 5;
   @Override
   public double area() {
      System.out.println("Circle1 area()메소드");
      res = r * r * Math.PI;
      return res;
   }
}

class Rectangle extends Shape1 {
   public int w = 10, h = 10;
   @Override
   public double area() {
      System.out.println("Rectangle area()메소드");
      res = w * h;
      return res;
   }
}

public class AbstractEx03 {
   public static void main(String[] args) {
      Shape1 ref = new Circle1();//업캐스팅
      ref.area();
      ref.printArea();
      ref = new Rectangle();
      ref.area();
      ref.printArea();
   }
}