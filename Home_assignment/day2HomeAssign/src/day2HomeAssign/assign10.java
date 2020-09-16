package day2HomeAssign;

public class assign10 {
	public void getCityByCode(int x) {
		switch(x) {
		case 1: System.out.println("Delhi"); break;
		case 2: System.out.println("Noida"); break;
		case 3: System.out.println("Gurgoan"); break;
		case 4: System.out.println("Banglore"); break;
		default: System.out.println("Invalid Code"); break;
		}
	}
	
	public static void main(String args[]) {
		assign10 obj = new assign10();
		obj.getCityByCode(3);
		obj.getCityByCode(14);
	}
}
