package first;

class Two extends One{
	int d2,t;
	
	Two(){
		this(20,20);
		System.out.println("two 의 디폴트생성자");
	}
	
	Two(int s1,int t1){
		super(s1);
		System.out.println("two의 다른 생성자");
		t=t1; 
		d2=t*t;
		
	}
}
