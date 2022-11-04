package networkEx;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetEx01 {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
		
		InetAddress Address=InetAddress.getLocalHost();//자신pc 정보
		//getLocalHost() static으로 선언된 클래스 메소드
		
		System.out.println("로컬 컴퓨터의 이름"+Address.getHostName());
		System.out.println("로컬 컴퓨터의 ip주소1"+Address.getHostAddress());
		System.out.println("로컬 컴퓨터의 ip주소2"+Address.toString());
		System.out.println();
		
		Address=InetAddress.getByName("java.sun.com");//도메인= 고정 ip 값으로 연결
		System.out.println("java.sun.com 컴퓨터의 이름과 IP 주소 : "+Address); //해당 도메인의 고정ip
		System.out.println();
		
		System.out.println("naver 도메인에 대응되는 IP를 반환");
		InetAddress sw[]=InetAddress.getAllByName("www.naver.com");
		for(int i=0; i<sw.length; i++)
			System.out.println(sw[i]);//서브 도메인 : 하나 도메인에 여러 주소를 가질 수 있음
		
	}

}
