package javautilEx;

import java.util.Scanner;

public class ScannerEx03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = "";

		do {
			System.out.print("입력 (입력 종료는 Q) : ");
			input = scan.nextLine(); //한 줄 입력
			System.out.println("입력 값은 : " + input);
		} while (!input.equalsIgnoreCase("Q"));

		System.out.println("프로그램 종료");
	}

}
