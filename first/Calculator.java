package first;
import java.util.Scanner;

public class Calculator {

   public static void main(String[] args) {
      System.out.println("시스템을 종료하려면 no를 입력해주세요.");
      while (true) {
         Scanner sc = new Scanner(System.in);
         System.out.print("계산할 식을 입력해주세요.(예시: 1+2)\n>");
         String ipstr = sc.nextLine();
         //한줄단위 입력 저장
         if(ipstr.toLowerCase().equals("no")) break;//equals 문자열 값 비교
         //분기처리문 no입력시 종료
         char c = ' ';
         int lnum = 0, rnum = 0, result = 0;
         if (ipstr.contains("+")) {//해당문자열 포함여부
            c = ipstr.charAt(ipstr.indexOf("+"));//해당 문자위치 찾기 해당 위치문자 찾아 저장
            String[] sarr = ipstr.replace("+", "p").split("p");//+를 p로 바꾸고 p로나눔
            lnum = Integer.parseInt(sarr[0]);
            rnum = Integer.parseInt(sarr[1]);
         } else if (ipstr.contains("-")) {
            c = ipstr.charAt(ipstr.indexOf("-"));
            String[] sarr = ipstr.split("-");
            lnum = Integer.parseInt(sarr[0]);
            rnum = Integer.parseInt(sarr[1]);
         } else if (ipstr.contains("*")) {
            ipstr = ipstr.replace("*", "x");
            c = ipstr.charAt(ipstr.indexOf("x"));
            String[] sarr = ipstr.split("x");
            lnum = Integer.parseInt(sarr[0]);
            rnum = Integer.parseInt(sarr[1]);
         } else if (ipstr.contains("/")) {
            c = ipstr.charAt(ipstr.indexOf("/"));
            String[] sarr = ipstr.split("/");
            lnum = Integer.parseInt(sarr[0]);
            rnum = Integer.parseInt(sarr[1]);
         } else {
            c = ipstr.charAt(ipstr.indexOf("%"));
            String[] sarr = ipstr.split("%");
            lnum = Integer.parseInt(sarr[0]);
            rnum = Integer.parseInt(sarr[1]);
         }

         switch (c) {
         case '+':
            result = lnum + rnum;
            break;
         case '-':
            result = lnum - rnum;
            break;
         case 'x':
            result = lnum * rnum;
            break;
         case '/':
            result = lnum / rnum;
            break;
         default:
            result = lnum % rnum;

         }

         System.out.println(result);
      }
   }

}