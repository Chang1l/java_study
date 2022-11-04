package first.etc;

public class CallAnotherConst {

	public static void main(String[] args) {
		Person noName=new Person();
		System.out.println(noName.name);
		System.out.println(noName.age);
		System.out.println();
		System.out.println(noName.md(50));
		System.out.println(noName.age);
		System.out.println();
		Person p= noName.returnItSelf();
		System.out.println(p);
		System.out.println(noName);
	}

}
