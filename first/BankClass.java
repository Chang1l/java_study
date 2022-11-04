package first;

class Bank{//클래스 생성
	private String bankname;//은행이름 변수
	private String account;//계좌번호 변수
	private int money;//돈
	
	public String getBankname() {//getter setter
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int add(int m) {//입금 메소드
		
		money=money+m;
		System.out.println("입금\t"+m+"\t"+ money);
		return money;
	}
	public int sub(int m) {//출금메소드
		int sub=m+500;
		money=money-(sub);
		System.out.println("출금\t"+"-"+sub+"\t"+ money);
		return money;
	}
	public Bank(String bank, String acc, int m) {//생성자
		this.bankname = bank;
		this.account = acc;
		this.money = m;
		System.out.println(bank+"은행 계좌번호 "+account);
	    System.out.println("내역\t 입출금\t 잔액"+"  \n------------------------" );
	}
	
	
}



public class BankClass {

	public static void main(String[] args) {
		//은행명과 잔액을 배열로 하고 for로 돌릴 수도 있었음
		
		System.out.println("[길동이의 은행별 거래현황]\n");
		int a ;//넣고뺄 돈 변수
		Bank b1=new Bank("우리","1002-102-102102",15000); //객체 초기화
		System.out.println("잔액\t\t"+b1.getMoney());
		b1.add(a=80000);
		b1.sub(a=30000);
		System.out.println("\n총 잔액은 "+b1.getMoney()+"입니다\n");
		
		Bank b2=new Bank("기업","011-0123456-78",10200);
		System.out.println("잔액\t\t"+b2.getMoney());
		b2.add(a=30000);
		System.out.println("\n총 잔액은 "+b2.getMoney()+"입니다\n");
		
		
	}

}
