package day2HomeAssign;

public class assign6 {
	public int sum(int x) {
		return (x);
	}
	
	public int sum(int x, int y) {
		return (x+y);
	}
	
	public double sum(double x) {
		return (x);
	}
	
	public double sum(double x, double y) {
		return (x+y);
	}
	
	public String sum(String x) {
		return (x);
	}
	
	public String sum(String x, String y) {
		String ans = "";
		ans += x;
		ans += y;
		return (ans);
	}
	
	public static void main() {
		assign6 obj = new assign6();
		System.out.println(obj.sum(5));
		System.out.println(obj.sum(5, 6));
		System.out.println(obj.sum(5.0));
		System.out.println(obj.sum(5.0, 6.0));
		System.out.println(obj.sum("abc"));
		System.out.println(obj.sum("abc", "xyz"));
	}
}
