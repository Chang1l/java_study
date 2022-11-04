package first.etc;

class Box {
	static long boxID = 0;//스태틱변수 스태틱영역메모리에 따로 
	long idNum; //변수

	Box() {//생성자
		idNum = boxID++; //객체 생성후 boxid+1 저장 idNum= boxId
	}

}

public class BoxEx {

	public static void main(String[] args) {

		Box box1 = new Box();//객체 생성및 초기화 후 boxid+1   0
		Box box2 = new Box();//객체 생성및 초기화 후 boxid+1   1
		Box box3 = new Box();//객체 생성및 초기화 후 boxid+1   2
		Box box4 = new Box();//객체 생성및 초기화 후 boxid+1   3   
								//boxid = 4
		System.out.println("box1 의 idNum :" + box1.idNum);
		System.out.println("box1 의 idNum :" + box2.idNum);
		System.out.println("box1 의 idNum :" + box3.idNum);
		System.out.println("box1 의 idNum :" + box4.idNum);

		System.out.println("박스의 총 개수" + Box.boxID);
	}

}
