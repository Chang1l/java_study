package first.etc;

public class PublicClass {
	
	public String name="가나다";
	
	public String getName() {
		return name;
	}

	public void setName(String name1) {
		String name=name1;
		System.out.println("setter 메소드 "+name);
//		this.name = name1;
	}


}
