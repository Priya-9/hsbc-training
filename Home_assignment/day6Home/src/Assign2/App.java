package Assign2;

public class App {
	public static void main(String args[]) {
		Thread t1 = new Thread(new MyThread(1));
		Thread t2 = new Thread(new MyThread(2));
		Thread t3 = new Thread(new MyThread(3));
		
		t1.start();
		t2.start();
		t3.start();
		
		/*try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/

	}
}
