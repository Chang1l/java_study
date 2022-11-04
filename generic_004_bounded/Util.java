package generic_004_bounded;

public class Util {
	public static <T extends Ancestor> void boundType(T t1) {
		t1.ancestor();
	}	
}
