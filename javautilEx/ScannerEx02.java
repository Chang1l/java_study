package javautilEx;

import java.util.Scanner;

public class ScannerEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int Math;
		System.out.print("이름?");
		name = sc.nextLine(); 		
		
		System.out.print("취미?");
		name = sc.next();

		System.out.print("나이?");
		Math = sc.nextInt();
		
		System.out.println(name + ":" + Math);
	}

}
