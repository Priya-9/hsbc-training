package Assignment.Assign6;

public class App {
	public static void main(String args[]) {
		String str = null;
		try {
			if(str == null) {
				throw new MyException();
			}
		}
		catch(MyException e) {
				System.out.println(e);
			}
	}
}
