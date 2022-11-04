package first;

public class TTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//형변환 (String => ) 문자(char)로
		String str = new String("Java");
		System.out.println("원본 문자열 : " + str);

		System.out.print("charAt() 메소드 호출 후 원본 문자열 : ");
		for (int i = 0; i < str.length(); i++) {
		    System.out.print(str.charAt(i) + " ");
		}

		System.out.println("\ncharAt(0) 메소드 호출 후 원본 문자열 : "+ str.charAt(0));

		String s = "50";
		int i = Integer.parseInt(s);
		String s = "3.14";
		double d = Double.parseDouble(s);
		float f = Float.parseFloat(s);


		//형변환 ( => String) : valueOf() , toString()
		double d = 3.141592;
		String s = String.valueOf(d);
		System.out.println(s);

		int i = 50;
		String s = Integer.toString(i);
		float d = 3.141592f;
		String s = Float.toString(d);
		System.out.println(s);
		long d = 329L;
		String s = Long.toString(d);
		System.out.println(s);

	}

}
