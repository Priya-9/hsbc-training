package day2HomeAssign.a9;

public class mouse {
	private int mrp, year, button;
	
	public mouse(int mrp, int year, int button) {
		this.mrp = mrp;
		this.year = year;
		this.button = button;
	}
	
	public void show() {
		System.out.println("Mouse : " + mrp + " " + year + " " + button);
	}
}
