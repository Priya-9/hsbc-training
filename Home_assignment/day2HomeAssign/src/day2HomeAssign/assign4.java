package day2HomeAssign;

public class assign4 {
	private static int x;
	private int z;

	public assign4() {
		z =5;
	}
	void fun() {
		System.out.println(assign4.x + "  " + z); 
	}
	public static void main(String args[]) {
		assign4 obj = new assign4();
		obj.fun();
	}
}
