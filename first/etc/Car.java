package first.etc;

 class Car {
	 private String color;
	 private int speed;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public Car(String color, int speed) {
		super();
		this.color = color;
		this.speed = speed;
	}
	 
}
