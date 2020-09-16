package day2HomeAssign.a9;

public class computer {
	private Keyboard k;
	private mouse m;
	private monitor mn;
	private cpu c;
	
	public computer() {
		k = new Keyboard(20000, 2006, 34);
		m = new mouse(12342, 2004, 2);
		mn = new monitor(30000, 2001, 0.8);
		c = new cpu(40000, 2008, "i7");
	}
	
	public void show() {
		k.show();
		m.show();
		mn.show();
		c.show();
	}
	
	public static void main() {
		computer obj = new computer();
		obj.show();
	}
}
