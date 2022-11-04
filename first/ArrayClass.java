package first;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int []a;
//		a= new int[] {1,2,3,4,5}; //메모리할당 및 초기화
//		System.out.println(a);//메모리 주소 값 
//		for(int i=0;i<5;i++) {
//			System.out.print(a[i]+" ");//배열안의 값
//		}System.out.println();
//		//배열의 길이 
//		System.out.println(a.length);//. 접근연산자 a배열길이
		
//		int[]b =new int[5]; //b 라는 int형의 5칸을 가진 배열 생성
//		b[2]=1; //2번 방에 1을 저장 / 배열은 0부터시작
//		System.out.println(b); //b 주소값출력
//		for(int i=0; i<b.length; i++) { //배열길이만큼 반복
//			System.out.print(b[i]+" "); //b배열 0번방부터 안에 값 출력
//		}
//		System.out.println();
//		
//		int[] c= {1,2,3,4,5};
//		for(int i:c) {
//			System.out.println(i +" ");
//		}
//		System.out.println();
//		
//		int[] a= new int[5];
//		int i;
//		a[0]=50;
//		a[1]=100;
//		a[2]=150;
//		a[3]=200;
//		a[4]=250;
//		for(i=0; i<a.length;i++) {
//			System.out.println("a[" + i+ "]" + "=" + a[i]);
		
//		int[]a= {95,73,100};  //a 배열에 0 ,1,2번방 값 저장
//		int tot=0; //합계 변수 생성
//		double avg; //평균 변수 생성
//		int i;	//i 생성
//		for(i=0; i<a.length; i++) {//i=0부터 a의 길이(3)까지 1씩 증가하며 반복
//			tot +=a[i];		/*합계 변수에 i번째 값을 누적합계시킴  
//								i=0 95  
//								i=1 95+73
//								i=2 95+73+100  */
//		}
//			avg=(double)tot/a.length; //tot 변수는 int기 때문에 더블형으로 형변환시켜서 합계를 배열 길이만큼 나눔
//			avg=tot/a.length; 	//tot변수를 배열 길이만큼 나눔 정수이기때문에 값손실이 발생하나 avg가 더블형이기에 소수점까지는 표시
//								//나중에 저장된 값이 저장
//			System.out.println("총합 = "+tot);//합계 출력
//			System.out.println("평균 = "+avg);//평균 출력
//		
//		int[] score= {79,88,91,33,100,55,95}; //참조자료형변수
//		//정수형 길이가 7인 score인 이름의 배열 생성;
//		int max=score[0]; //정수형 max생성후 score배열 0번째 값 저장
//		int min=score[0]; //정수형 min생성후 score배열 0번째 값 저장
//		
//		
//		for(int i=1; i<score.length;i++) { //i는 1부터 score 배열길이까지 1씩증가 시키며 반복
//			if(score[i]>max) //만약 배열 안에 값이 max 값보다 크면?
//				max=score[i];//max에 해당 값으로 교체
//			if(score[i]<min)//만약 배열 안에 값이 min 값보다 작으면?
//				min=score[i];//min에 해당 값으로 교체
//			
//		}//i를 증가시키면 반복
//		System.out.println("최대값 "+max);//최대값 출력
//		System.out.println("최소값 "+min);//최소값 출력
//		
//		int []array= new int[] {3,4,5,6,7};
//		for( int k: array) {  //
//			System.out.print(k+" ");
//		}
//		System.out.println();
//		System.out.println(Arrays.toString(array));
		
			//둘리-80 희동이-77 마이콜-95 고길동-100
			//90점 이상 학점A
			//80점 이상 학점B
			//70점 이상 학점C
			//60점 이상 학점D
			//60점 미만 학점F
		/*
		 * 출력결과
		 * 둘리:b
		 * 희동이 :C
		 * 마이콜:A
		 * 고길동 :A
		 * */
//		String[] name = new String[] { "둘리", "희동이", "마이콜","고길동" };
//		//문자열 형식의 배열 name의 값을 초기화시켜줌 name[0],name[1],name[2],name[3]
//		int[] score = new int[] { 50,77,95,100 };
//		//정수 형식의 배열 score의 값을 초기화시켜줌 score[0],score[1],score[2],score[3]
//		int i; //정수 변수 i 선언
//		for(i=0;i<name.length;i++) {//i는 0부터 name배열의 길이만큼 1씩반복
//			if(score[i]>=90) {		//점수 배열의 i번째 값이 90이상이냐?
//			System.out.println(name[i]+": A");	//참이면실행
//			}else if(score[i]>=80) {		//점수 배열의 i번째 값이 80이상이냐?
//				System.out.println(name[i]+": B");		
//			}else if(score[i]>=70) {		//점수 배열의 i번째 값이 70이상이냐?
//				System.out.println(name[i]+": C");		
//			}else if(score[i]>=60) {		//점수 배열의 i번째 값이 60이상이냐?
//				System.out.println(name[i]+": D");		
//			}else {							//점수 배열의 i번째 값이 위 조건에 해당이 모두 안되면 해당 문장 실행
//				System.out.println(name[i]+": F");
//			}
//			
//		} //i값증가 for문 다시 반복
//	
		
//		String s="다람쥐";
//		System.out.println("문자열 길이:" + s.length()); //문자열길이
//		
//		String[]sarr= {"하늘","땅","바다"};
//		
//		for(int i=0; i<sarr.length; i++) {//배열길이
//			System.out.println(i+"번 방의 값은"+ sarr[i]+"입니다");
//		}
		
//		int[] o= {1,2,3};
//		int[] n=new int[5];
//		for(int i:o) System.out.print(i);
//			System.out.println();
//			System.arraycopy(o, 0, n, 2, 2);
//			//o 배열에 0번쨰 값을 n배열에 2번방부터 o배열의 2개를 집어넣음 
//		
//			for(int i:n) {System.out.print(i);}
		
		
//		int[][] a= new int[2][3]; //2행 3열
//		
//		a[0][0]=0;  
//		a[0][1]=1;
//		a[0][2]=2;
//		a[1][0]=3;
//		a[1][1]=4;
//		a[1][2]=5;
//						// 0 , 1 ,2
//						// 3 , 4, 5
//		for(int i=0; i<a.length; i++) {//행개수2
//			for(int j=0;j<a[i].length; j++) {//[i]행의 방개수 3
//				if(j==a[i].length-1) //방개수 -1    2와 같은가?
//					System.out.println(a[i][j]); //같으면 출력후 줄바꿈
//				else
//					System.out.print(a[i][j] + " "); //방 개수가 2와 같지 않으면 출력 후 공백
//			}
//		}
	
//		int[][] a= new int[2][];   //2차원 배열  2줄짜리 선언
//		a[0]=new int[2]; 	//0번째줄은 2칸
//		a[1]=new int[3];	//1번째줄은 3칸
//		
//		for(int i=0; i<a.length;i++) {//i번째줄
//			for(int j=0; j<a[i].length;j++) { //i번째줄의 방
//				a[i][j]=i+j;		//i번째 줄과 j번째방의 값을 더해서 저장
//				if(j==a[i].length-1) { //j가 i번째 줄의 길이-1이랑 같아지면   
//					//배열은 0부터 시작하는데?  개수 -1을 해야 배열 방번호랑 같아져서?
//					System.out.println(a[i][j]);//해당 값 출력후 줄바꿈
//				}else {
//					System.out.print(a[i][j]+" ");//아닐경우 해당 값 출력후 공백
//				}
//				
//			}
//			
//		}
		
//		int[][] a= {{0,1},{2,3,4} };//0번째줄 0,1  1번째줄 2,3,4
//		for(int i=0; i<a.length;i++) {//
//			for(int j=0; j<a[i].length;j++) { //
//						//
//				if(j==a[i].length-1) { // 
//					//배열은 0부터 시작하는데?  개수 1부터 세는데 -1을 해야 배열 방번호랑 같아져서?
//					System.out.println(a[i][j]);//
//				}else {
//					System.out.print(a[i][j]+" ");//
//				}
//				
//			}//j++  j=j+1
//			
//		}
		
		String s1="Java Korea";
		//직접 문자열 지정
		//단축 초기화로 객체 생성
		String s2=new String ("Java Korea");
		
		String s3=s2.intern();
		//문자열을 canonical 문자열로 전환
		String s4= "Java Korea";
		//단축 초기화로 객체 생성
//		System.out.println(">> String 객체가 참조하는 주소가 같은지 비교");
//		System.out.println("s1==s2 : "+(s1==s2));
//		System.out.println("s2==s3 : "+(s2==s3));
//		System.out.println("s1==s3 : "+(s1==s3));
//		System.out.println("s1==s4 : "+(s1==s4));
//		
//		System.out.println(">> String 값 비교");
//		System.out.println(s1.equals(s2));
//		System.out.println(s2.equals(s3));
//		System.out.println(s1.equals(s3));
//		System.out.println(s1.equals(s4));
		
//		System.out.println(">> String 데이터 해시코드 :method 메모리");
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//		System.out.println(s3.hashCode());
//		System.out.println(s4.hashCode());
//		
//		System.out.println(">>String 데이터 식별해시코드 :힙 메모리");
//		System.out.println(System.identityHashCode(s1));
//		System.out.println(System.identityHashCode(s2));
//		System.out.println(System.identityHashCode(s3));
//		System.out.println(System.identityHashCode(s4));
		
//		String str= new String ("java");
//		System.out.println("원본 분자열 : "+str);
//		System.out.println(str.concat("수업"));
//		System.out.println("concat() 메소드 호출 후 원본 문자열 : "+str);
//		
//		String str1=new String("해피  썬데이");//5
//		System.out.println("기존길이"+str1.length());
//		str1="  "+ str1+"   ";//문자열길이 공백은 1로 취급, 2+5+3 (  해피썬데이   )을 저장 
//		System.out.println("공백추가길이"+str1.length());//10
//		System.out.println("str1="+str1);//str1의 저장된 값은(  해피썬데이   )
//		System.out.println("str1="+str1.trim());//앞뒤공백제거된 문자열
//		System.out.println("str1="+str1.length());//문자열 길이
//		
//		str1=str1.trim();//앞뒤공백제거하고 저장
//		
//		System.out.println("공백제거 str 길이"+ str1.length());//문자열길이
//		System.out.println("str1 :"+str1.length());//문자열길이
		
		
//		String str1=new String("해피썬데이");//5
//		char ch=str1.charAt(2);
//		System.out.println(str1+"의 charAt(2) : "+ch);
		
		
//		String str1=new String("해피썬데이");
//		String str2=str1.substring(3); //str1의 3번쨰 부터 문자열을 가져와서 str2에 저장
//		System.out.println(str1+"의 substring(3) : "+str2);
//		
//		String str3= str1.substring(2,4);//str1의 2번쨰부터 4번째전까지 문자열을 가져와서 str3에 저장
//		System.out.println(str1+"의 substring(2,4): "+str3);
		
//		 String a= "Good Afternoon";
//		 System.out.println(a.indexOf("nooa"));//noon이 몇번째부터 나오냐
//		 System.out.println(a.indexOf(" Af"));// Af가 몇번째부터 나오냐ㅐ
//		 
//		 String hello="HelloWorld_MyWorld";
//		 System.out.println(hello.indexOf("World"));//world가 몇번째에 나오냐
//		 System.out.println(hello.indexOf("World",10));//world가 10번째 이후에 몇번째에 나오냐? 
//		 System.out.println(hello.lastIndexOf("World"));//world가 오른쪽에서 몇번째에 나오냐>?
//		 System.out.println(hello.lastIndexOf("World",10));//world가 오른쪽에서 10번째 다음에 몇번째에 나오냐?		 
//		
////		 System.out.println(hello.indexOf(65));//A-65 a-97
////		 System.out.println(hello.indexOf(99));//c-99
////		 
//		 String str="http://www.naver.com/m/index.jsp";
//		 str.substring(str.lastIndexOf("/"));
//		 System.out.println( str.substring(str.lastIndexOf("/")));
//		 
//		 System.out.println(str.contains("java"));//해당 단어가 존재하는지 참 거짓값으로 구분 대소문자 구분
//		 System.out.println(str.contains(" my"));
//		 System.out.println(str.contains("JAVA"));
//		 System.out.println(str.contains("java test"));
		 
//		String b= "Welcome to Java World Java World";
//		System.out.println(b);
//		System.out.println(b.replace("Java","Computer"));
//		
//		System.out.println(b.replaceAll("Java","Computer"));
		
//		String str= "abcdefghijk";
//		System.out.println("result===>"+str.replaceAll("[abcdhij]","굿"));
//		System.out.println("result===>"+str.replaceAll("[^abcdhij]","굿"));
		
//		String a= "Welcome to Java World";
//		System.out.println(a.toUpperCase());
//		System.out.println(a.toLowerCase());
		
//		String str4="   공백  제거    공백  제거   ";
//		System.out.println((str4.substring(3,5))+(str4.substring(7,9))+(str4.substring(13,15)).trim()+(str4.substring(17,19)).trim()   );
//		
//		System.out.println(str4.replaceAll("[^공백제거]", ""));
//		System.out.println(str4.replace(" ",""));
		
		
	}
}
