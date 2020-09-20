package Assignment.Assign5;

public class Assin5 {
	
	private int arr[];
	public Assin5() {
		arr = new int[4];
		try {
			System.out.println("In try block");
			arr[4] = 5;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception Catched");
		}
	}
	
	public static void main(String args[]) {
		Assin5 obj = new Assin5();
	}
}
