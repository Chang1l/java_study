package first.etc;

public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Account.total "+Account.total);
//		
//		Account acc01=new Account(10);
//		System.out.println("acc01.total "+acc01.total);//스태틱
//		System.out.println("acc01.count "+acc01.count);		
//		
//		Account acc02=new Account(10);
//		System.out.println("acc02.total "+acc02.total);//스태틱
//		System.out.println("acc02.count "+acc02.count);		
//		
//		Account acc03=new Account(10);
//		System.out.println("acc03.total "+acc03.total);//스태틱
//		System.out.println("acc03.count "+acc03.count);		
		
		Box1 mybox1= new Box1();
		System.out.println(Box1.boxID);
		mybox1.idNum=Box1.getcurrentID();
		Box1 mybox2= new Box1();
		mybox2.idNum=mybox2.getcurrentID();
		
		System.out.println("mybox1의 id 번호 "+mybox1.idNum);
		System.out.println("mybox2의 id 번호 "+mybox2.idNum);
		System.out.println("다음 박스 번호는"+ Box1.boxID+"번입니다");
		
	}

}
