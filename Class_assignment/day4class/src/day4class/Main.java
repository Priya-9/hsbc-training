package day4class;

public class Main {
	public static void main(String args[]) {
	App1 obj = new App1();
	try {
		int x = obj.calculate(3, 0);
	}
	catch(ArithmeticException e) {
		e.printStackTrace();
	}
	
	System.out.println("Done");
	}
}
