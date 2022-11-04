
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b=0;
		
		for(int x=1; x<=10; x++) {
			
		
			a=4*x;
			for(int y=1; y<=10; y++) {
			
				b=5*y;
				if(a+b==60) {
				System.out.println("("+x+","+y+")");
				}
			}
		
		};
	}

}
