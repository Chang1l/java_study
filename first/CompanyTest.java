package first;

public class CompanyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company myCompany1=Company.getinstance();
		Company myCompany2=Company.getinstance();
		System.out.println(myCompany1==myCompany2);
	}

}
