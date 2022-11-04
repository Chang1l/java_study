package first;
//싱글톤 패턴 :  객체의 인스턴스가 1개만 생성
//외부에서 객체 생성을 할 수 없도록 생성자의 접근을 제한한다
//private 생성자(){}
//자기의 클래스 내에 자신의 객체를 가지고 있어야 한다.
//단, 멤버필드로 존재하는 자신의 객체에 접근을 제한한다
//메모리공유가 필요함 static
//
public class Company {
	private static Company instance;//null
	
	private Company() {};
	private static int count=0;
	
	public static Company getinstance() {
		
		if(instance==null) {
			instance=new Company();//객체생성
		}
		count++;
		System.out.println(count);
		return instance;
	}
	
}
