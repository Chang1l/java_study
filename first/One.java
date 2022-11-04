package first;


class One{
	int d1, s;
		One(){
		System.out.println("One의 디폴트 생성자");
	}
	One(int s1){
		System.out.println("One의 다른 생성자");
		s=s1;
		d1=s*s;
	}
}