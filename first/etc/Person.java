package first.etc;

public class Person {
	String name;
	int age;
	Person(){//디폴트 생성자
		
		this("이름없음",1);
		System.out.println("ㅇㄴㅁ");
	}
	
	Person(String name,int age){//setter?
		this.name=name;
		this.age=age;
		
	}
	
	Person returnItSelf() {// getter?
		return this;
	}
	int md(int age) {//메소드
		this.age=age+50;
		return age;  
	}
}
