package streamEx;

public class Student {
	String name, cname;
	int num, age;
	
	public Student(String name, String cname, int num, int age) {
		this.name = name;
		this.cname = cname;
		this.num = num;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public String getCname() {
		return cname;
	}
	public int getNum() {
		return num;
	}
	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "이름=" + name + ", 학과명=" + cname + ", 학번=" + num + ", 나이=" + age;
	}
	
	

}
