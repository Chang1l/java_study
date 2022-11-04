package burgger;

public class ProductVO {

	private int product_id; //상품번호
	private String product_nm; //상품명
	private String product_kind; //상품종류
	private int product_price;  //상품가격
	private String product_des; //상품설명
	private Double product_w_g;  //중량(g)
	private Double product_w_ml; //중량(ml)
	private Double product_kcal; //열량
	private Double product_kcal_max; //최대열량
	private Double product_sugar; //당
	private Double product_protein; //단백질
	private Double product_fat; //포화지방
	private Double product_solt; //나트륨
	private Double product_caffein; //카페인	
	
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_nm() {
		return product_nm;
	}
	public void setProduct_nm(String product_nm) {
		this.product_nm = product_nm;
	}
	public String getProduct_kind() {
		return product_kind;
	}
	public void setProduct_kind(String product_kind) {
		this.product_kind = product_kind;
	}
	public int getProduct_price() {
		return product_price;
	}
	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}
	public String getProduct_des() {
		return product_des;
	}
	public void setProduct_des(String product_des) {
		this.product_des = product_des;
	}
	public Double getProduct_w_g() {
		return product_w_g;
	}
	public void setProduct_w_g(Double product_w_g) {
		this.product_w_g = product_w_g;
	}
	public Double getProduct_w_ml() {
		return product_w_ml;
	}
	public void setProduct_w_ml(Double product_w_ml) {
		this.product_w_ml = product_w_ml;
	}
	public Double getProduct_kcal() {
		return product_kcal;
	}
	public void setProduct_kcal(Double product_kcal) {
		this.product_kcal = product_kcal;
	}
	public Double getProduct_kcal_max() {
		return product_kcal_max;
	}
	public void setProduct_kcal_max(Double product_kcal_max) {
		this.product_kcal_max = product_kcal_max;
	}
	public Double getProduct_sugar() {
		return product_sugar;
	}
	public void setProduct_sugar(Double product_sugar) {
		this.product_sugar = product_sugar;
	}
	public Double getProduct_protein() {
		return product_protein;
	}
	public void setProduct_protein(Double product_protein) {
		this.product_protein = product_protein;
	}
	public Double getProduct_fat() {
		return product_fat;
	}
	public void setProduct_fat(Double product_fat) {
		this.product_fat = product_fat;
	}
	public Double getProduct_solt() {
		return product_solt;
	}
	public void setProduct_solt(Double product_solt) {
		this.product_solt = product_solt;
	}
	public Double getProduct_caffein() {
		return product_caffein;
	}
	public void setProduct_caffein(Double product_caffein) {
		this.product_caffein = product_caffein;
	}
	@Override
	public String toString() {
		return "상품정보 [product_id=" + product_id + ", product_nm=" + product_nm + ", product_kind=" + product_kind
				+ ", product_price=" + product_price + ", product_des=" + product_des + ", product_w_g=" + product_w_g
				+ ", product_w_ml=" + product_w_ml + ", product_kcal=" + product_kcal + ", product_kcal_max="
				+ product_kcal_max + ", product_sugar=" + product_sugar + ", product_protein=" + product_protein
				+ ", product_fat=" + product_fat + ", product_solt=" + product_solt + ", product_caffein="
				+ product_caffein + "]";
	}
	
	
}
