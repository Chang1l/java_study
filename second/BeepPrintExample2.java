package thread01;

//import java.awt.Toolkit;

public class BeepPrintExample2 {
	public static void main(String[] args) {
//		Runnable객체를 직접 생성하여 스레드생성자의 매개인자로 보내어 스레드 객체 생성
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
//		Toolkit toolkit = Toolkit.getDefaultToolkit();	
		
//		Runnable객체를 익명클래스로 생성하여 스레드생성자의 매개인자로 보내어 스레드 객체 생성
//		Thread thread = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				Toolkit toolkit = Toolkit.getDefaultToolkit();	
//				for(int i=0; i<5; i++) {		
//					toolkit.beep();
//					System.out.println("띵");
//					try { Thread.sleep(500); } catch(Exception e) {}
//				}
//			}
//		});
		
//		Runnable객체를 람다식으로 생성하여 스레드생성자의 매개인자로 보내어 스레드 객체 생성
//		Thread thread = new Thread(() -> {
//			Toolkit toolkit = Toolkit.getDefaultToolkit();	
//			for(int i=0; i<5; i++) {		
//				toolkit.beep();
//				System.out.println("띵");
//				try { Thread.sleep(500); } catch(Exception e) {}
//			}
//		});
		
		thread.start();
		
		for(int i=0; i<5; i++) {
//			toolkit.beep();
			System.out.println("띵");
			try { Thread.sleep(500); } catch(Exception e) {}
		}
	}
}


