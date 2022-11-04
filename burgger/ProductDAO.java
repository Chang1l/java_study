package burgger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductDAO {
	String sql = null;
	Connection conn = DBConnection.getConnection();
	PreparedStatement ps = null;

	// 상품 등록
	
	public void insertProduct(String product_nm, String product_kind,int product_price,
			String product_des,double product_w_g,double product_w_ml, double product_kcal, 
			double product_kcal_max, double product_sugar, double product_protein, 
			double product_fat,	double product_solt,double product_caffein) {

		sql = "INSERT INTO BUGGER_PRODUCT (PRODUCT_ID, PRODUCT_NM, PRODUCT_KIND,PRODUCT_PRICE,"
				+ "	PRODUCT_DES, PRODUCT_W_G, PRODUCT_W_ML, PRODUCT_KCAL, PRODUCT_KCAL_MAX,"
				+ "	PRODUCT_SUGAR, PRODUCT_PROTEIN, PRODUCT_FAT, PRODUCT_SOLT, PRODUCT_CAFFEIN) VALUES "
				+ "( BUGGER_PRODUCT_ID_SEQ.NEXTVAL , ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, product_nm);
			ps.setString(2, product_kind);
			ps.setDouble(3, product_price);
			ps.setString(4, product_des);
			ps.setDouble(5, product_w_g);
			ps.setDouble(6, product_w_ml);
			ps.setDouble(7, product_kcal);
			ps.setDouble(8, product_kcal_max);
			ps.setDouble(9, product_sugar);
			ps.setDouble(10, product_protein);
			ps.setDouble(11, product_fat);
			ps.setDouble(12, product_solt);
			ps.setDouble(13, product_caffein);
			ps.executeUpdate();

			System.out.println(product_nm + "상품이 등록되었습니다.");
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 회원 수정
	public void updateProduct(int product_id, String product_nm, String product_kind,
			int product_price, String product_des, double product_w_g, double product_w_ml,
			double product_kcal, double product_kcal_max, double product_sugar,
			double product_protein, double product_fat, double product_solt, double product_caffein) {
		sql = "UPDATE BUGGER_PRODUCT SET PRODUCT_NM = ?, PRODUCT_KIND = ?,PRODUCT_PRICE = ?, "
				+ "PRODUCT_DES = ? , PRODUCT_W_G = ?, PRODUCT_W_ML = ?, PRODUCT_KCAL = ?, "
				+ "PRODUCT_KCAL_MAX = ?,PRODUCT_SUGAR = ?,  PRODUCT_PROTEIN = ?, PRODUCT_FAT = ?,"
				+ "PRODUCT_SOLT = ?, PRODUCT_CAFFEIN = ? WHERE PRODUCT_ID = ? ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, product_nm);
			ps.setString(2, product_kind);
			ps.setDouble(3, product_price);
			ps.setString(4, product_des);
			ps.setDouble(5, product_w_g);
			ps.setDouble(6, product_w_ml);
			ps.setDouble(7, product_kcal);
			ps.setDouble(8, product_kcal_max);
			ps.setDouble(9, product_sugar);
			ps.setDouble(10, product_protein);
			ps.setDouble(11, product_fat);
			ps.setDouble(12, product_solt);
			ps.setDouble(13, product_caffein);
			ps.setInt(14, product_id);
			ps.executeUpdate();
			System.out.println(product_nm + "상품의 정보가 수정되었습니다.");
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 회원 탈퇴
	public void deleteProduct(int product_id) {
		sql = "DELETE FROM BUGGER_PRODUCT WHERE PRODUCT_ID = ? ";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, product_id);
			ps.executeUpdate();
			System.out.println(product_id + "번 상품의 정보가 삭제되었습니다.");
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 회원목록조회
	public ArrayList<ProductVO> selectList() {
		ArrayList<ProductVO> pArr = new ArrayList<ProductVO>();
		Statement st = null;
		ResultSet rs = null;
		sql = "SELECT * FROM BUGGER_PRODUCT";
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			while (rs.next()) {
				ProductVO p = new ProductVO();
				p.setProduct_id(rs.getInt("product_id"));
				p.setProduct_nm(rs.getString("product_nm"));
				p.setProduct_kind(rs.getString("product_kind"));
				p.setProduct_price(rs.getInt("product_price"));
				p.setProduct_des(rs.getString("product_des"));
				p.setProduct_w_g(rs.getDouble("product_w_g"));
				p.setProduct_w_ml(rs.getDouble("product_w_ml"));
				p.setProduct_kcal(rs.getDouble("product_kcal"));
				p.setProduct_kcal_max(rs.getDouble("product_kcal_max"));
				p.setProduct_sugar(rs.getDouble("product_sugar"));
				p.setProduct_protein(rs.getDouble("product_protein"));
				p.setProduct_fat(rs.getDouble("product_fat"));
				p.setProduct_solt(rs.getDouble("product_solt"));
				p.setProduct_caffein(rs.getDouble("product_caffein"));	
				
				pArr.add(p);
			}
			rs.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pArr;
	}
	
	
	//상품1개 선택
	public ProductVO selectOne(int product_id) {
		ProductVO pv = new ProductVO();		
		ResultSet rs = null;
		sql = "SELECT * FROM BUGGER_PRODUCT WHERE PRODUCT_ID = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, product_id);
			rs = ps.executeQuery();
			while(rs.next()) {
				pv.setProduct_nm(rs.getString("product_nm"));
				pv.setProduct_kind(rs.getString("product_kind"));
				pv.setProduct_w_g(rs.getDouble("product_w_g"));
				pv.setProduct_w_ml(rs.getDouble("product_w_ml"));
				pv.setProduct_kcal(rs.getDouble("product_kcal"));
				pv.setProduct_kcal_max(rs.getDouble("product_kcal_max"));
				pv.setProduct_sugar(rs.getDouble("product_sugar"));
				pv.setProduct_protein(rs.getDouble("product_protein"));
				pv.setProduct_fat(rs.getDouble("product_fat"));
				pv.setProduct_solt(rs.getDouble("product_solt"));
				pv.setProduct_caffein(rs.getDouble("product_caffein"));
			}		
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pv;
	}
}
