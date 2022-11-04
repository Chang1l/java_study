package streamEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long millisecond = 0;

		try {
			FileInputStream fis = new FileInputStream("a.zip");
			//바이트형식으로읽어오기 디폴트 경로 :해당 자바 프로젝트 안
			FileOutputStream fos = new FileOutputStream("copy.zip");
			//내보내기
			millisecond = System.currentTimeMillis();
			//현재시간 long 타입 밀리초로 
			int i;

			while ((i = fis.read()) != -1) {
					//파일 읽어오기
				fos.write(i);//내보낼 파일에 복사
			}
			millisecond = System.currentTimeMillis() - millisecond;

			fos.close();
			fis.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("파일 복사" + millisecond + " Milliseconds 소요되었습니다");
	}

}
