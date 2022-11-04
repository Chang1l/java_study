package fileEx;

import java.io.*;

public class FileEx09 {

	public static void main(String[] args) {
		try {
			File f = new File("c:/jwork/first/src/fileEx", "FileEx01_00.java");

			System.out.println(f.getName());
			System.out.println(f.exists());
			System.out.println(f.getPath());
			System.out.println(f.length());
			System.out.println(File.separator);
//			boolean result = new File("c:/jwork/Exam/log").mkdir();
//			boolean result = new File("c:/jwork/Exam").mkdir();
			boolean result = new File("c:/jwork/Exam/log").mkdirs();
			
			if (result==true){
		      System.out.println("Exam 디렉토리 생성 성공");
		    }else{
		      System.out.println("Exam 디렉토리 생성 실패");
		    }

			String[] listing = new File("c:/jwork/Exam").list();
			for (String x : listing) {
				System.out.println("디렉토리 목록 : " + x);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
