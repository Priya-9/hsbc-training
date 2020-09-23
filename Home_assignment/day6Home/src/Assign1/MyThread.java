package Assign1;

public class MyThread extends Thread{
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
