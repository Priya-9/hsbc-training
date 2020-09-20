package Assignment.Assign4;

public class app2 {
	public static void main(String args[]) {
		try {
			 app1 obj = new app1();
			 obj.fun();
		}
		catch(ArithmeticException e) {
			System.out.println("Successfully catched");
		}
	}
}

//Even if u dont throw exception, it will be thrown.