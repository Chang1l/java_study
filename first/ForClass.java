package first;

public class ForClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		System.out.println("for문1");
//		int n=0;
//		for(n=1; n<=10;n++) {
//			System.out.println("Hello Java"+n);
//			
//		}
//		System.out.println("n의 값은"+n);
//		System.out.println("for문을 빠져 나옴");
//		System.out.println("\n================\n");
//		int total=0;
//		
//		for(int n=1; n<=10;n++) {
//			if(n==7) {
//				break;
//			}
//			total +=n;
//			
//		}
//		System.out.println("합계는 "+total);
		
//		for(int i=1; i<=10;i++) {
//			if(i % 2 ==0) {
//				continue;}
//			System.out.println(i+" ");
//		}
//		System.out.println("\n================\n");
//		System.out.println("while문 1");
//		int total=0;
//		int i=1;
//		
//		while(i<=10) {
//			
//			total+=i;
//			i++;
//			
//		}
//		System.out.println(total);
//		
//		int total=0 ,i=1;
//		do {
//			total+=i;
//			i++;
//			
//		}while(i<=5);
//		System.out.println(total);
//		System.out.println();
//		int i=5;
//		do {
//			System.out.print(i+" ");
//			i--;
//		}while(i>=1);
//		
//		System.out.println("\n do while문 종료 후 : "+i+"\n");
		
//		for(int j=1; j<=5;j++) {
//			for(int k=1; k<=j; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		System.out.println("\n=============\n");
		
//		int i=5;
//		while(i>=1) {
//			if(i==3) {break;}
//			System.out.print(i+" ");
//		i--;
//		}
//		System.out.println("\n while 종료후 "+i);
//		int i=0;
//		do {  //일단 실행
//			i++; //i 값 1증가;
//			if(i%2 !=0)continue; //만약 i를 2로 나눈 나머지가 0이 아니면 밑에 실행문 패스 (다음 반복)
//			System.out.print(i+" "); //i값 출력
//		}while(i<=10); //i가 10보다 작거나 같을때 까지 반복, 아닐경우 반복 종료
//		System.out.println("\n i의 값"+i); //최종 i 값 출력
		
//		System.out.println("라벨 분기문");
//		gugudan: //라벨
//		for(int i=2; i<=9;i++) { //2부터 9까지 1씩 증가
//			if(i%2==0)System.out.println("구구단"+i+"단"); 
//			// 구구단 i단 출력 i를 2로 나눈 나머지가 0이면 출력 (짝수단)
//			for(int j=1; j<=9; j++) { //1부터 9까지 1씩 증가
//				if(i%2!=0)continue gugudan; 
//				//구구단라벨이 붙은 반복문으로 i를 2로 나눈 나머지가 0이 아니면 패스 (홀수단)
//				System.out.println(i+"*"+j+"="+(i*j)); //i * j = i*j 출력
//				}
//		System.out.println();
//		}
//		System.out.println("\n ---------------\n");
////		
//		String area="안양시" ,area_num;
//		int chk= 0;
//	
//		switch(area) { //area 해당값을 찾음
//		case "서울시": area_num="02"; break;
//		case "과천시": case "안산시": case "안양시": 
//		case "고양시": area_num="031"; break;
//		case "인천시": area_num="032"; break;
//		case "진주시": case "통영시": 	case "사천시": case "양산시": 
//		case "김해시": area_num="055"; break; //해당 케이스에 맞는 area_num에 값을 저장
//		default :chk=1; area_num="찾으시는 국번이 확인되지 않습니다";//해당되는 경우가 없을 경우 chk=1로 변경
//		
//		}
//		if(chk==0)  //chk가 0이면 실행
//		System.out.println(area+"국번은 " +area_num+" 번입니다");
//		else System.out.println(area_num);//0이 아니면 실행
		
		//for if 문
//		int year=2022, month; //년도 월 설정
//	    String day; //일 변수 생성
//	    for(month=1; month<13;month++) {  //월을 12월까지 반복
//				if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
//					day="31"; //만약 월일 1,3,5,7,8,10,12월이면 일은 31일까지
//					
//				}else if(month==4 || month==6||month==9 ||month==11) {
//					day="30";//월이 4,6,9,11이면 일은 30일까지
//					
//				}else if(month==2) {//월이 2월
//					if(year%4==0) {//4로 년로를 나눈 나머지가0이면
//						day="29";  //29일까지있고
//					}else {			//아니면
//						day="28";	//28일까지있음
//					}
//				}else {				//해당 값이 없을경우
//					day="입력 값이 잘못됨";
//				}
//			System.out.println(year+"년"+month+"월"+day+"일입니다");  //월을 1부터 늘려가며 해당 월의 일수를 출력함
//			}
//	    //switch case 문
//	    int year=2022, month=0, day=0;
//	    System.out.println(year+"년도의 월별 일자 수 출력");
//	    for(month=1;month<=12;month++) {
//	    switch(month) {
//	    case 1: case 3: case 5: case 7:case 8:  case 10: case 12: day=31; break;
//	    case 4: case 6 : case 9 : case 11: day=30; break;
//	    default : if (year%4==0) {
//				    	day=29; break;
//					}else {
//						day=28; break;
//				    }
//	    }
//	    System.out.println(year+"년"+month+"월"+day+"일입니다");
//	}
//		System.out.println("무한루프");
//		int i=1;
//		for(;;) {  //몇부터 몇까지 몇증가를 생략해서 계속 돔
//			System.out.println(i+"번째");
////			i++;
//			if(i>10)break;
//		}
////		
//		int i=1;
//		while(true) {
//			System.out.print((i!=1?" ":"")+i); //i가 1이 아니면 한칸 공백 +i 결합
//			i++; //i 1씩증가
//			if(i>10) //i가 10보다 커지면 종료
//				break;
//		}
//		System.out.println("\n 종료 후의 i의 값 "+i);
//		
//		
//		int i=1;
//		do {
//			System.out.print((i!=1?" ":"")+i);
//			if(++i>10)break;
//		}while(true);
//		System.out.println("\n 종료 후의 i의 값 "+i);
//		
		
		
//		System.out.println("\n \t \\ \' \"-------------------");
		
}}