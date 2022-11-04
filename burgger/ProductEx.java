package burgger;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductEx {

	public static void main(String[] args) {
		ProductDAO pDAO = new ProductDAO();
		String product_nm = null, product_kind = null, product_des = null;
		int product_id=0, product_price = 0; 
		double product_w_g = 0, product_w_ml = 0, product_kcal = 0;
		double product_kcal_max = 0, product_sugar = 0, product_protein = 0, product_fat = 0;
		double product_solt = 0, product_caffein = 0;
		String str = "";
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("메뉴를 고르세요.");
			System.out.println("1.상품등록, 2.상품정보수정, 3.상품삭제, 4.상품목록조회, 5.종료");
			switch(sc.nextLine()) {
				case "1": case "상품등록":
					System.out.print("상품명>> ");
					product_nm = sc.nextLine();
					System.out.print("상품종류>> ");
					product_kind = sc.nextLine();
					System.out.print("상품가격>> ");
					product_price = Integer.parseInt(sc.nextLine());
					System.out.print("상품설명>> ");
					product_des = sc.nextLine();
					System.out.print("중량(g)>> ");
					product_w_g = Double.parseDouble(sc.nextLine());
					System.out.print("중량(ml)>> ");
					product_w_ml = Double.parseDouble(sc.nextLine());
					System.out.print("열량(kcal)>> ");
					product_kcal = Double.parseDouble(sc.nextLine());
					System.out.print("최대열량(kcal)>> ");
					product_kcal_max = Double.parseDouble(sc.nextLine());
					System.out.print("당(g)>> ");
					product_sugar = Double.parseDouble(sc.nextLine());
					System.out.print("단백질(g)>> ");
					product_protein = Double.parseDouble(sc.nextLine());
					System.out.print("포화지방(g)>> ");
					product_fat = Double.parseDouble(sc.nextLine());
					System.out.print("나트륨(mg)>> ");
					product_solt = Double.parseDouble(sc.nextLine());
					System.out.print("카페인(mg)>> ");
					product_caffein = Double.parseDouble(sc.nextLine());
					pDAO.insertProduct(product_nm, product_kind,product_price,
							product_des, product_w_g, product_w_ml, product_kcal, 
							product_kcal_max, product_sugar, product_protein, 
							product_fat,	product_solt, product_caffein);
					break;
				case "2": case "상품정보수정":
					System.out.print("상품번호>> ");
					product_id = Integer.parseInt(sc.nextLine());
					System.out.print("상품명>> ");
					product_nm = sc.nextLine();
					System.out.print("상품종류>> ");
					product_kind = sc.nextLine();
					System.out.print("상품가격>> ");
					product_price = Integer.parseInt(sc.nextLine());
					System.out.print("상품설명>> ");
					product_des = sc.nextLine();
					System.out.print("중량(g)>> ");
					product_w_g = Double.parseDouble(sc.nextLine());
					System.out.print("중량(ml)>> ");
					product_w_ml = Double.parseDouble(sc.nextLine());
					System.out.print("열량(kcal)>> ");
					product_kcal = Double.parseDouble(sc.nextLine());
					System.out.print("최대열량(kcal)>> ");
					product_kcal_max = Double.parseDouble(sc.nextLine());
					System.out.print("당(g)>> ");
					product_sugar = Double.parseDouble(sc.nextLine());
					System.out.print("단백질(g)>> ");
					product_protein = Double.parseDouble(sc.nextLine());
					System.out.print("포화지방(g)>> ");
					product_fat = Double.parseDouble(sc.nextLine());
					System.out.print("나트륨(mg)>> ");
					product_solt = Double.parseDouble(sc.nextLine());
					System.out.print("카페인(mg)>> ");
					product_caffein = Double.parseDouble(sc.nextLine());
					pDAO.updateProduct(product_id, product_nm, product_kind, product_price,
							product_des, product_w_g, product_w_ml, product_kcal, product_kcal_max,
							product_sugar, product_protein, product_fat, product_solt, product_caffein);
					break;
				case "3": case "상품삭제":
					System.out.print("상품번호 입력>> ");
					product_id = Integer.parseInt(sc.nextLine());
					pDAO.deleteProduct(product_id);
					break;
				case "4": case "회원목록조회":					
					ArrayList<ProductVO> pvArr = pDAO.selectList();
					for(ProductVO p: pvArr) {
						System.out.println(p);
					}
					break;
				default: 
					str = "종료";
					DBConnection.getClose();
			}
			
			if(str.equals("종료")) break;
		}
		System.out.println("종료되었습니다.");
	}

}
