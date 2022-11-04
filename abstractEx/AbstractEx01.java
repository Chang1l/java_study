package abstractEx;

public class AbstractEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Animal a= new Animal();
		//추상 클래스는 인스턴스를 생성할 수 없음
		Cat c= new Cat();
		Dog d= new Dog();
		
		c.cry();
		d.cry();
		System.out.println(c.getAstr());
	}

}
