package day6Class;

public class ThreadMain {
	public static void main(String args[]) {
		System.out.println("MAin thread starts");
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.start();
		t2.start();
		
		
		
		System.out.println("MAin thread exists");
	}
}
