package first.etc;
//import first.etc.StaticClass;

public class HelloJava {

	public static void main(String[] args) {
		// 
//		System.out.println("Hello Java!!!");
		String str = new String("Hey, Java");
		str.replace("a","i");
		System.out.println(str);
		str=str.replace("a","i");
		System.out.println(str.replace("a","i"));
		
		System.out.println(str);
//		StaticClass.staticMethod();
//		StaticClass st1 = new StaticClass();
//		StaticClass.staticMethod();
//		st1.ins = 5;
//		System.out.println("st1의 count값은: "+ st1.count + ", ins의 값은: " + st1.ins);
//		StaticClass st2 = new StaticClass();
//		System.out.println("st2의 count값은: "+ st2.count + ", ins의 값은: " + st2.ins);
	}

}
