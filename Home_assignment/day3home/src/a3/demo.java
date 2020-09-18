package a3;

public class demo implements B{

	@Override
	public int multiply(int a, int b) {
		return (a*b);
	}

	@Override
	public int add(int a, int b) {
		return (a+b);
	}
	
	public static void main(String args[]) {
		int a = 3;
		int b = 5;
		demo d = new demo();
		
		System.out.println(d.multiply(a, b));
		System.out.println(d.add(a,  b));
	}

}
