package abstractEx;

abstract class Animal {
	private String astr="추상클래스";
	 abstract void cry();
	 //상속받는 클래스는 반드시 구현할 메소드임
	 Animal() {
		 System.out.println("any class");
	 }
	//디폴트 생성자
	public String getAstr() {
		return astr;
	}
}
