package first;

public class Point2{//default 같은패키지 내에서만 접근
	private int x;//해당 클래스내에서만 접근가능
	private int y;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
}
