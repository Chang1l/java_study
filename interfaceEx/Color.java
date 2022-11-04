package interfaceEx;

public interface Color {
	int RED = 1; 
	// public static final 생략된 것이므로 상수
	int GREEN = 2;
	int BLUE = 3;

	void setColor(int c); 
	// public abstract 생략된 것이므로 추상메서드
	int getColor(); 
}