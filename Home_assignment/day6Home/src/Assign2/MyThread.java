package Assign2;

public class MyThread implements Runnable{
	private int x;
	public MyThread(int x) {
		this.x = x;
	}
	public void run() {
			for(int i=0; i<10; i++) {
				System.out.println("Thread no. " + x + "  : " + i);
			}
	}
}
