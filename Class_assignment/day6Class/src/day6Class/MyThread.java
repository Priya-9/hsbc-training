package day6Class;

public class MyThread extends Thread{
	
	public void run(){
		try {
			for(int i=0; i<10; i++) {
				System.out.println("Iteration no : " + i);
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
