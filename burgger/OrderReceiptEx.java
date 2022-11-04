package burgger;

import java.util.ArrayList;

public class OrderReceiptEx {
	public static void main(String[] args) {
		String order_id ="202208030010";
		System.out.println("주문서");
		OrderDAO oDAO = new OrderDAO();
		OrderListVO ol = oDAO.orderListSelectList(order_id);
		System.out.println("지점명: "+ol.getOrder_store());
		System.out.println("주문일자: "+ol.getOrder_date());
		
		System.out.println("\n담당자명: "+ol.getOrder_manager_nm()+"\n");
		String nic=ol.getMember_nick();
		System.out.println("주문자: "+ol.getMember_nick());
		
		System.out.println("연락처: "+ol.getMember_phone());
		System.out.println("주소: "+ol.getMember_addr());
		
		System.out.println("주문내용:");
		ArrayList<OrderProductListVO> olArr = oDAO.orderListSelectListDetail(order_id);
		int i = 0;
		int sum = 0;
		for(OrderProductListVO ov :olArr) {
			i++;
			if(i ==2 )System.out.printf("%s %d개 \t\t%,d원\n",ov.getProduct_nm(),ov.getProduct_unit(),(ov.getProduct_unit()*ov.getProduct_price()));
			else System.out.printf("%s %d개 \t%,d원\n",ov.getProduct_nm(),ov.getProduct_unit(),(ov.getProduct_unit()*ov.getProduct_price()));
			
			sum += (ov.getProduct_unit()*ov.getProduct_price());
			double point =sum*0.01;
			if(nic.equals("회원")) {
				//pstmt sql point 
				System.out.println("포인트"+point);
			}
			
		}
		System.out.printf("\n총 금액: %,d원\n",sum);
		System.out.println("---------------------------------------");
		System.out.printf("고객요청사항: %s\n",ol.getOrder_msg());
		System.out.println("---------------------------------------");
		System.out.println("칼로리정보");
		
		ProductDAO pDAO = new ProductDAO();
		for(OrderProductListVO ov :olArr) {
			ProductVO p = pDAO.selectOne(ov.getProduct_id());
			if(p.getProduct_kind().equals("음료") || p.getProduct_kind().equals("커피")) {
				System.out.println(p.getProduct_nm());
				System.out.printf("- 중량: %.0fml\n",p.getProduct_w_ml());
				System.out.printf("- 열량: %.0fkcal\n",p.getProduct_kcal());
				System.out.printf("- 당: %.0fg\n",p.getProduct_sugar());
				System.out.printf("- 단백질: %.0fg\n",p.getProduct_protein());
				System.out.printf("- 포화지방: %.1fg\n",p.getProduct_fat());
				System.out.printf("- 나트륨: %.0fmg\n",p.getProduct_solt());
				System.out.printf("- 카페인: %.0fmg\n",p.getProduct_caffein());
				System.out.println();
			}else if(p.getProduct_kind().equals("세트")) {
				System.out.println(p.getProduct_nm());
				System.out.println("- 열량: "+p.getProduct_kcal()+"~"+p.getProduct_kcal_max()+"kcal\n");
			}else {
				System.out.println(p.getProduct_nm());
				System.out.printf("- 중량: %.0fg\n",p.getProduct_w_g());
				System.out.printf("- 열량: %.0fkcal\n",p.getProduct_kcal());
				System.out.printf("- 당: %.0fg\n",p.getProduct_sugar());
				System.out.printf("- 단백질: %.0fg\n",p.getProduct_protein());
				System.out.printf("- 포화지방: %.1fg\n",p.getProduct_fat());
				System.out.printf("- 나트륨: %.0fmg\n",p.getProduct_solt());
				System.out.println();
			}

		}
		
	}

}
