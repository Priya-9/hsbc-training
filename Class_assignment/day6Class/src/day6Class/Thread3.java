package day6Class;

public class Thread3 {
	public static void main(String args[]) throws Exception{
		
		MessagePrinter printer = new MessagePrinter();
		Thread t1 = new Thread(new PrintWorker(printer, "Hello"));
		Thread t2 = new Thread(new PrintWorker(printer, "Good"));
		Thread t3 = new Thread(new PrintWorker(printer, "Day"));
		try {
			t1.start();
			t2.start();
			t3.start();
			
			t1.join();
			t2.join();
			t3.join();
		}
		catch(InterruptedException e) {
			System.out.println(e);
		}
	}
}
