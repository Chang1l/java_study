package networkEx;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

public class NetEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		URL url=null;
		BufferedReader input=null;
		String address="https://www.naver.com/index.html";
		//https://www.naver.com = URI  호스트 path까지 url 파일까지
		String line="";
		
		try {
			url= new URL(address); //해당 url 정보를 담음
			input= new BufferedReader(new InputStreamReader(url.openStream()));
			//데이터 흐름 바이트 방식으로 읽어들임
			while((line=input.readLine())!=null) {
				System.out.println(line);
				
			}
			input.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
