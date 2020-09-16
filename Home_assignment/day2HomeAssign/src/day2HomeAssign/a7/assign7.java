package day2HomeAssign.a7;

public class assign7 {
	public void hello(byte x) {
		System.out.println("Byte " + x);
	}
	
	public void hello(int x) {
		System.out.println("Int " + x);
	}
	
	public void hello(short x) {
		System.out.println("short " + x);
	}
	
	public void hello(long x) {
		System.out.println("long " + x);
	}
	
	public static void main() {
		assign7 obj = new assign7();
		obj.hello(5);
	}
}
