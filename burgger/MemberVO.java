package burgger;

public class MemberVO {
	private String member_id;
	private String member_pw;
	private String member_nm;
	private String member_nick;
	private String member_phone;
	private String member_addr;
	private String member_birth;
	private String member_email;
	private int member_point;
	
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_pw() {
		return member_pw;
	}
	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}
	public String getMember_nm() {
		return member_nm;
	}
	public void setMember_nm(String member_nm) {
		this.member_nm = member_nm;
	}
	public String getMember_nick() {
		return member_nick;
	}
	public void setMember_nick(String member_nick) {
		this.member_nick = member_nick;
	}
	public String getMember_phone() {
		return member_phone;
	}
	public void setMember_phone(String member_phone) {
		this.member_phone = member_phone;
	}
	public String getMember_addr() {
		return member_addr;
	}
	public void setMember_addr(String member_addr) {
		this.member_addr = member_addr;
	}
	public String getMember_birth() {
		return member_birth;
	}
	public void setMember_birth(String member_birth) {
		this.member_birth = member_birth;
	}
	public String getMember_email() {
		return member_email;
	}
	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}
	public int getMember_point() {
		return member_point;
	}
	public void setMember_point(int member_point) {
		this.member_point = member_point;
	}
	
	@Override
	public String toString() {
		return "회원정보 [member_id=" + member_id + ", member_pw=" + member_pw + ", member_nm=" + member_nm
				+ ", member_nick=" + member_nick + ", member_phone=" + member_phone + ", member_addr=" + member_addr
				+ ", member_birth=" + member_birth + ", member_email=" + member_email + "]";
	}
	

	
	
}
