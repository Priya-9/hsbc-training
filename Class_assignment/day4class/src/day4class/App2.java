package day4class;

public class App2 {
	public int divide(int a, int b) {
		try {
			return(a/b);
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			return -1;
		}
	}
}
