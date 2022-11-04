package burgger;

public class OrderProductListVO {

	private String order_product_id;
	private String order_id;
	private int product_id;
	private int product_unit;
	private int product_price;
	private String product_nm;
	
	
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	public String getProduct_nm() {
		return product_nm;
	}
	public void setProduct_nm(String product_nm) {
		this.product_nm = product_nm;
	}
	public String getOrder_product_id() {
		return order_product_id;
	}
	public void setOrder_product_id(String order_product_id) {
		this.order_product_id = order_product_id;
	}
	public String getOrder_id() {
		return order_id;
	}
	public void setOrder_id(String order_id) {
		this.order_id = order_id;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public int getProduct_unit() {
		return product_unit;
	}
	public void setProduct_unit(int product_unit) {
		this.product_unit = product_unit;
	}
	
}
