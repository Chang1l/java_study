package inheritance.test.other;
import inheritance.test.SameClass;

public class ChileClass extends SameClass {

    public static void main(String[] args) {

    	ChileClass sp= new ChileClass();

        System.out.println(sp.sameVar); // 다른 패키지에 속하는 자식 클래스까지 허용

    }

}