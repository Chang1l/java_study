package first.etc;

class Counter {

	static int count=0;
	
	Counter(){//생성자
	this.count++;
	}
	
	public static int getCount() {//메소드 호출시
		 
		return count;// count에 저장된 값을 돌려줌
	}
	
}

public class CounterEx{
	
	public static void main(String[] args) {
		System.out.println(Counter.getCount());//0
		Counter c1= new Counter();//객체 생성 생성자 호출+1  1
		System.out.println(c1.getCount());
		Counter c2= new Counter();//객체 생성 생성자 호출+1  2
			
		System.out.println(c2.getCount());
		
		
	}
	
	
}