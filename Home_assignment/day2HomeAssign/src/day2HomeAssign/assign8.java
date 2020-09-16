package day2HomeAssign;

public class assign8 {
	private int id;
	private String name;
	
	public assign8() {
		id =0 ;
		name = "Nil";
	}
	
	public assign8(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public static void main(String args[]) {
		assign8 obj = new assign8();
		assign8 obj1 = new assign8(3, "abc");
	}
}
