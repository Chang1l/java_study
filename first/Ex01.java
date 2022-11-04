package first;


class Point01{
	int x;
	int y;

	public void prt() {
		System.out.println(x+","+y);
	}
	
}

public class Ex01 {

	public static void main(String[] args) {


		Point01 pt01= new Point01();//객체 이름 pt01 
		pt01.x=10;
		pt01.y=20;
		pt01.prt();
//		System.out.println(pt01.x+","+pt01.y);
//		
//		Point01 pt02=new Point01(); //객체  새로 생성
//		System.out.println(pt02.x+","+pt02.y);//자동초기화 값
//		
//		Point01 pt03=pt01; //객체 복사
//		System.out.println(pt03.x+","+pt03.y);
	}

}
