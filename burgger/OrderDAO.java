package burgger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class OrderDAO {
	String sql = null;
	Connection conn = DBConnection.getConnection();
	PreparedStatement ps = null;

	// 주문 등록
	public void insertOrder(ArrayList<OrderProductListVO> opvArr, String member_nm, String member_nick,
			String member_phone, String member_addr, String order_msg, String member_id) {
		sql = "select TO_CHAR(SYSDATE,'YYYYMMDD')||LPAD(ORDER_ID_SEQ.NEXTVAL, 4, '0') as order_id  from dual";
		Statement st = null;
		ResultSet rs = null;
		boolean isOrderSuccess = false;
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			String order_id = null;
			if (rs.next()) {
				order_id = rs.getString("order_id");
			}
			sql = "insert into ORDER_LIST (ORDER_ID, ORDER_DATE,MEMBER_NM, MEMBER_NICK, "
					+ "MEMBER_PHONE, MEMBER_ADDR, ORDER_MSG, ORDER_MANAGER_NM, ORDER_STORE, "
					+ "MEMBER_ID) values (?, SYSTIMESTAMP, ?, ?, ?, ?, ?, ?, ?, ?)";
			ps = conn.prepareStatement(sql);
			ps.setString(1, order_id);
			ps.setString(2, member_nm);
			ps.setString(3, member_nick);
			ps.setString(4, member_phone);
			ps.setString(5, member_addr);
			ps.setString(6, order_msg);
			ps.setString(7, "홍길동");
			ps.setString(8, "맥도날드 안양점");
			ps.setString(9, member_id);
			ps.executeUpdate();

			for (OrderProductListVO op : opvArr) {
				sql = "INSERT INTO ORDER_PRODUCT_LIST"
						+ "(ORDER_PRODUCT_ID , ORDER_ID ,PRODUCT_ID ,PRODUCT_UNIT) VALUES "
						+ "( (SELECT NVL(MAX(ORDER_PRODUCT_ID),0)+1 FROM ORDER_PRODUCT_LIST) , " + "? , ? , ?)";
				ps = conn.prepareStatement(sql);
				ps.setString(1, order_id);
				ps.setInt(2, op.getProduct_id());
				ps.setInt(3, op.getProduct_unit());
				ps.executeUpdate();
			}
			isOrderSuccess = true;

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (isOrderSuccess) {
				try {
					conn.commit();
					rs.close();
					st.close();
					ps.close();					
				} catch (Exception e) {
					e.printStackTrace();
				}
			} else {
				try {
					conn.rollback();
					rs.close();
					st.close();
					ps.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

	}

	// 상품종류별 조회
	public ArrayList<ProductVO> selectKind(String product_kind) {
		ArrayList<ProductVO> pArr = new ArrayList<ProductVO>();
		sql = "select * from bugger_product where product_kind = ?";
		ResultSet rs = null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, product_kind);
			rs = ps.executeQuery();
			while (rs.next()) {
				ProductVO pv = new ProductVO();
				pv.setProduct_id(rs.getInt("product_id"));
				pv.setProduct_nm(rs.getString("product_nm"));
				pv.setProduct_price(rs.getInt("product_price"));
				pArr.add(pv);
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return pArr;
	}

	// 주문 목록조회
	public OrderListVO orderListSelectList(String order_id) {
		OrderListVO ol = new OrderListVO();
		ResultSet rs = null;
		sql = "SELECT order_id, to_char(order_date,'YYYY-MM-DD HH24:MI:SS') order_date,member_id,member_nm,member_nick,member_phone,member_addr,order_msg,order_manager_nm,order_store FROM ORDER_LIST WHERE order_id = ?";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, order_id);
			rs = ps.executeQuery();
			while (rs.next()) {
				ol.setOrder_id(rs.getString("order_id"));
				ol.setOrder_date(rs.getString("order_date"));
				ol.setMember_id(rs.getString("member_id"));
				ol.setMember_nm(rs.getString("member_nm"));
				ol.setMember_nick(rs.getString("member_nick"));
				ol.setMember_phone(rs.getString("member_phone"));
				ol.setMember_addr(rs.getString("member_addr"));
				ol.setOrder_msg(rs.getString("order_msg"));
				ol.setOrder_manager_nm(rs.getString("order_manager_nm"));
				ol.setOrder_store(rs.getString("order_store"));
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return ol;
	}

	// 주문상품 세부 목록조회
	public ArrayList<OrderProductListVO> orderListSelectListDetail(String order_id) {
		ArrayList<OrderProductListVO> olArr = new ArrayList<OrderProductListVO>();
		ResultSet rs = null;
		sql = "SELECT OP.ORDER_PRODUCT_ID, OP.ORDER_ID, OP.PRODUCT_ID, OP.PRODUCT_UNIT , P.PRODUCT_NM, P.PRODUCT_PRICE FROM ORDER_PRODUCT_LIST OP, BUGGER_PRODUCT P WHERE OP.PRODUCT_ID= P.PRODUCT_ID AND OP.order_id  = ? ORDER BY OP.ORDER_PRODUCT_ID";
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, order_id);
			rs = ps.executeQuery();
			while (rs.next()) {
				OrderProductListVO ol = new OrderProductListVO();
				ol.setOrder_id(rs.getString("order_id"));
				ol.setProduct_id(rs.getInt("product_id"));
				ol.setProduct_unit(rs.getInt("product_unit"));
				ol.setProduct_price(rs.getInt("product_price"));
				ol.setProduct_nm(rs.getString("product_nm"));
				olArr.add(ol);
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return olArr;
	}
}
