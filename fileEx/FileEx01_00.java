package fileEx;

import java.io.*;

public class FileEx01_00 {

	public static void main(String args[]) throws Exception {
		
		String source = "비어있어야 비로서 가득해 지는 사랑\n"
				+ " 영원히 사랑한다는 것은\n"
				+ " 평온한 마음으로 아침을 맞는다는 것입니다.\n";
		System.out.println(source.length());
		char intxt[] = new char[source.length()];
		//getChars(복사할 객체의 시작인덱스번호(int), 복사할객체의 마지막인덱스-1(int),
		//복사해서 붙여넣기할 객체명, 붙여넣을 객체의 시작 위치 인덱스 번호(int));
		source.getChars(0, source.length(), intxt, 0);
		//source.getChars(6, 20, intxt, 5);
		FileWriter fw = new FileWriter("data1.txt");
		fw.write(intxt);
		fw.write(source);
		fw.close();
	}

}
