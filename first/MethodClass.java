package first;

public class MethodClass {

	
	//메소드 선언문
	static String hello_func()
	{//함수생성 (메소드) 반환값이 없으므로 void, 메소드는 main 이외에는 호출해야 실행
	
		return "Hello World!"; //실행문
	}
	
	
	static int sum(int a,int b) {
		int c= a+b;
		System.out.println("a+b="+c);
		return c;
	}
	static void sum2(int a,int b) {
		int c;
		c=sum(a,b);
//		System.out.println("a+b="+c);
		
	}
	
	static String add(int a) {
		String c;
		c="안녕하세요"+a;
		return c;
	}
	
	static int abs(int i) {
		int r=i;
		if(i<0) {
			r=-i;
		}
		
		return r;
	}
	
//	static int mul(int i,int j) {
//		int r;
//		r=i*j;
//		return r;
//	}
	static String div(int i, int j) {
		int k=i%j;
		String s=i+"를 "+j+"로 나눈 나머지는 "+k+"입니다.";
		return s;
	}
	
	static void md(int x) {
		char c;
		if(x==4) {
			c='a';
		}else {
			c='b';
		}
			
		System.out.println(c+" 값은 "+x+"입니다");
	}
	static int md(int a, int b) {
		int s= a+b;
		return s;
		
	}
	
	static String md() {
		
		String s="테스트";
		return s;
		
	}
	
	static void prn(int x, int y, int z) {
		System.out.println(x+"\t"+y+"\t"+z);
	}
	
	static void prn(int x, int y) {
		System.out.println(x+"\t"+y);
		
	}
//	static void prn(int x) {
//		System.out.println(x);
//	}
//	static void prn() {
//		System.out.println("출력");
//	}
//	
	static void printstr(String str) {
		System.out.println(str);
	}
	
	static void printstr(int str) {
		System.out.println(str);
	}
	static void printstr(char ch, int cnt) {
		for(int i=0;i<cnt;i++) {
			System.out.print(ch);
		
		}System.out.println();
	}
	
	
	
	public static void main(String[] args) {//메인 메소드(함수) 자동실행
		
//		String s=hello_func();  //함수호출 해당 함수 실행
//		System.out.println(hello_func());
//		System.out.println(s);
//		
//		int a=10,b=20;
//		
//		int c=sum(a,b)+5;
//		System.out.println(c);
//		sum2(2,2);
		
//		int a=-5, result;
//		result=abs(a);
//		System.out.println(result);
//		String c= div(a,b);
//		System.out.println(c);	
//		int a=4, b=5;
//		md(a);
//		md(b);
//		System.out.println(md(a,b));
//		System.out.println(md());
//		System.out.println("두수의 합은"+add(a,b));
//		System.out.println("두수의 곱은"+mul(a,b));
		
//		prn(10,20,30);
//		prn(40,50);
//		prn(60);
//		prn();
		
		printstr("슬프도록 아름다운");
		printstr(4);
		printstr('A',10);
		
	}
	
}
