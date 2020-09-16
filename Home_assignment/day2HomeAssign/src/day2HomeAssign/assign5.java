package day2HomeAssign;

public class assign5 {
	public static void main(String args[]) {
		assign5_homeLoan obj1 = new assign5_homeLoan("abc", 10000, 5);
		assign5_homeLoan obj2 = new assign5_homeLoan("xyz", 5000, 3);
		
		System.out.println(obj1.getloan());
		System.out.println(obj2.getloan());
		
		System.out.println(obj1.getloan(400, 3));
		System.out.println(obj2.getloan(200, 5));
		
	}
}
