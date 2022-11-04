package exceptEx;

public class ExceptEx00 {
	public static void main(String[] args) {
		try {
			String c = null;
			System.out.println(c);
			System.out.println(c.length());
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("시스템 정상 종료");
	}

}
