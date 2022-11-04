package generic_002_yes;

public class ProductExample {
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<Tv, String>();
		//제네릭형식 T    M
		product1.setKind(new Tv("런닝맨", 6, 15, 50));
		//클래스 타입 값 세팅
		product1.setModel("Tv자료형");
		//String 타입  값 세팅
		Tv tv = product1.getKind();
		//tv 객체에 제네릭 입력값 대입
		System.out.println(product1.getModel());
		//Model 변수 get메소드 호출
		System.out.println(tv);
		//tv 객체 메소드 호출
		Product<Car, String> product2 = new Product<Car, String>();
		// 제네릭형식 T     M
		product2.setKind(new Car());// car 객체 생성자 값 세팅
		product2.setModel("Car자료형");//문자열 세팅
		product2.getKind().setCarName("소나타");
		Car car = product2.getKind();//car 객체 생성 후 제네릭 객체get메소드 호출  
		System.out.println(product2.getModel());//제네릭객체 M 값 호출
		System.out.println(car);//car 
	}
}
