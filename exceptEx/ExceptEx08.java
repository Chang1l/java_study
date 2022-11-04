package exceptEx;

public class ExceptEx08 {

	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassNotFoundException e) { 
			System.out.println("클래스가 존재하지 않습니다.");
			System.out.println("에러 사유: " + e);
		}
	}

	public static void findClass() throws ClassNotFoundException
	{
		Class clazz = Class.forName("java.lang.WowClass"); 
							//사용할 클래스 경로및 클래스이름 기술
	}
}
