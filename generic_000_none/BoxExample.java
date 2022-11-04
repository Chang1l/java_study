package generic_000_none;

public class BoxExample {

	public static void main(String[] args) {
		Box box = new Box();
		box.set("홍길동"); //업캐스팅
		String name = (String) box.get();
		//다운캐스팅
		box.set(new Apple());//업캐스팅
		Apple apple = (Apple) box.get();//다운캐스팅
		apple.setNum(100);
		System.out.println(apple.getNum());
	}

}
