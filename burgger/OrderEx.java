package burgger;

import java.util.ArrayList;
import java.util.Scanner;

public class OrderEx {

	public static void main(String[] args) {
		System.out.println("주문하기");
		Scanner sc = new Scanner(System.in);
		ArrayList<OrderProductListVO> opvArr = new ArrayList<OrderProductListVO>();
		OrderDAO oDAO = new OrderDAO();
		MemberDAO mDAO = new MemberDAO();
		MemberVO mv = null;	
		boolean bl = true;
		while(true) {
			if(bl) {
				System.out.println("선택해주세요.\n1.회원주문, 2.비회원주문");
				
				switch(sc.nextLine()) {
					case "1": case "회원주문":
						System.out.print("아이디 입력>> ");
						String id = sc.nextLine();
						System.out.print("비밀번호 입력>> ");
						String pw = sc.nextLine();
						mv = mDAO.selectOne(id, pw);
						if(mv!=null) {
							System.out.println("로그인되었습니다.");
						} else {
							System.out.println("회원 정보가 없습니다.");
							continue;
						}
						break;
					default : 
						System.out.println("비회원주문을 선택하셨습니다.");
				}
				bl = false;
			}
			
			System.out.println("상품선택하기\n1.버거단품, 2.버거세트, 3.사이드, 4.커피, 5.음료, 6.주문완료, 7.종료");
			ArrayList<ProductVO> pArr = null;
			int product_id = 0;
			int product_unit = 0;
			
			switch(sc.nextLine()) {
				case "1": case "버거단품":
					pArr = oDAO.selectKind("단품");
					System.out.println("상품번호: 0번 , 선택안함");
					for(ProductVO pv: pArr){
						System.out.print("상품번호: "+pv.getProduct_id());
						System.out.print(" , 상품명: "+pv.getProduct_nm());
						System.out.println(" , 가격: "+pv.getProduct_price());						
					}
					System.out.print("상품번호를 선택하세요. >>");
				    product_id = Integer.parseInt(sc.nextLine());
				    if(product_id > 0) {
				    	System.out.print("수량을 입력하세요. >>");
				    	product_unit = Integer.parseInt(sc.nextLine());
				    }
				    OrderProductListVO opv = new OrderProductListVO();
				    if(product_unit > 0) {
				    	opv.setProduct_id(product_id);
				    	opv.setProduct_unit(product_unit);
				    	opvArr.add(opv);
				    }
					break;
				case "2": case "버거세트":
					pArr = oDAO.selectKind("세트");
					System.out.println("상품번호: 0번 , 선택안함");
					for(ProductVO pv: pArr){
						System.out.print("상품번호: "+pv.getProduct_id());
						System.out.print(" , 상품명: "+pv.getProduct_nm());
						System.out.println(" , 가격: "+pv.getProduct_price());						
					}
					System.out.print("상품번호를 선택하세요. >>");
				    product_id = Integer.parseInt(sc.nextLine());
				    if(product_id > 0) {
				    	System.out.print("수량을 입력하세요. >>");
				    	product_unit = Integer.parseInt(sc.nextLine());
				    }
				    OrderProductListVO opv1 = new OrderProductListVO();
				    if(product_unit > 0) {
				    	opv1.setProduct_id(product_id);
				    	opv1.setProduct_unit(product_unit);
				    	opvArr.add(opv1);
				    }
					break;
				case "3": case "사이드":
					pArr = oDAO.selectKind("사이드");
					System.out.println("상품번호: 0번 , 선택안함");
					for(ProductVO pv: pArr){
						System.out.print("상품번호: "+pv.getProduct_id());
						System.out.print(" , 상품명: "+pv.getProduct_nm());
						System.out.println(" , 가격: "+pv.getProduct_price());						
					}
					System.out.print("상품번호를 선택하세요. >>");
				    product_id = Integer.parseInt(sc.nextLine());
				    if(product_id > 0) {
				    	System.out.print("수량을 입력하세요. >>");
				    	product_unit = Integer.parseInt(sc.nextLine());
				    }
				    OrderProductListVO opv2 = new OrderProductListVO();
				    if(product_unit > 0) {
				    	opv2.setProduct_id(product_id);
				    	opv2.setProduct_unit(product_unit);
				    	opvArr.add(opv2);
				    }
					break;
				case "4": case "커피":
					pArr = oDAO.selectKind("커피");
					System.out.println("상품번호: 0번 , 선택안함");
					for(ProductVO pv: pArr){
						System.out.print("상품번호: "+pv.getProduct_id());
						System.out.print(" , 상품명: "+pv.getProduct_nm());
						System.out.println(" , 가격: "+pv.getProduct_price());						
					}
					System.out.print("상품번호를 선택하세요. >>");
				    product_id = Integer.parseInt(sc.nextLine());
				    if(product_id > 0) {
				    	System.out.print("수량을 입력하세요. >>");
				    	product_unit = Integer.parseInt(sc.nextLine());
				    }
				    OrderProductListVO opv3 = new OrderProductListVO();
				    if(product_unit > 0) {
				    	opv3.setProduct_id(product_id);
				    	opv3.setProduct_unit(product_unit);
				    	opvArr.add(opv3);
				    }
					break;
				case "5": case "음료":
					pArr = oDAO.selectKind("음료");
					System.out.println("상품번호: 0번 , 선택안함");
					for(ProductVO pv: pArr){
						System.out.print("상품번호: "+pv.getProduct_id());
						System.out.print(" , 상품명: "+pv.getProduct_nm());
						System.out.println(" , 가격: "+pv.getProduct_price());						
					}
					System.out.print("상품번호를 선택하세요. >>");
				    product_id = Integer.parseInt(sc.nextLine());
				    if(product_id > 0) {
				    	System.out.print("수량을 입력하세요. >>");
				    	product_unit = Integer.parseInt(sc.nextLine());
				    }
				    OrderProductListVO opv4 = new OrderProductListVO();
				    if(product_unit > 0) {
				    	opv4.setProduct_id(product_id);
				    	opv4.setProduct_unit(product_unit);
				    	opvArr.add(opv4);
				    }
					break;
				case "6": case "주문완료":
					if(opvArr.size()<=0)  {
						System.out.println("주문한 상품이 없습니다.");
						continue;
					}
					if(mv==null) {
						//비회원 주문시
						System.out.print("주문자: ");
						String member_nm = sc.nextLine();
						System.out.print("닉네임: ");
						String member_nick = sc.nextLine();
						System.out.print("연락처: ");
						String member_phone = sc.nextLine();	
						System.out.print("주소: ");
						String member_addr = sc.nextLine();
						System.out.print("요청사항: ");
						String order_msg = sc.nextLine();
						if(order_msg==null) order_msg ="";
						System.out.print("임시비밀번호: ");
						String member_id = sc.nextLine();	
						
						if(member_nm.equals("")||member_nick.equals("")||member_phone.equals("")||member_addr.equals("")||member_id.equals("")) {
							System.out.println("주문 정보가 잘못되었습니다. 다시 입력해주세요.");
							continue;
						}
					
						oDAO.insertOrder( opvArr, member_nm, member_nick, member_phone, member_addr, order_msg, member_id);
						System.out.println("주문을 완료합니다");
						System.exit(0);
					}else {
						//회원 주문시
						String member_id = mv.getMember_id();				
						System.out.println("아이디: "+member_id);
						String member_nm = mv.getMember_nm();
						System.out.println("주문자: "+member_nm);
						String member_nick = mv.getMember_nm();
						System.out.println("닉네임: "+member_nick);
						String member_phone = mv.getMember_phone();	
						System.out.println("연락처: "+member_phone);
						String member_addr = mv.getMember_addr();
						System.out.println("주소: "+member_addr);
						System.out.print("요청사항: ");
						String order_msg = sc.nextLine();
						if(order_msg==null) order_msg ="";
						oDAO.insertOrder( opvArr, member_nm, member_nick, member_phone, member_addr, order_msg, member_id);
						System.out.println("주문을 완료합니다");
						System.exit(0);
					}
					break;
				default: 
					System.out.println("주문을 종료합니다.");
					System.exit(0);
			}
		}
	}

}
