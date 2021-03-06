package day2ClassAssign;

public class BoxDemo {
	public static void main(String args[]) {
		Box b1 = new Box(10, 20, 30);
		System.out.println(b1.getVolume());
		System.out.println(b1.getColour());
		
		Box b2 = new Box(10, 20, 30, "Blue");
		System.out.println(b2.getVolume());
		System.out.println(b2.getColour());

		Box b3 = new Box(10, 20, 30, "Blue", 9.6);
		System.out.println(b3.getVolume());
		System.out.println(b3.getColour());
		System.out.println(b3.getWeight());

	}
}
