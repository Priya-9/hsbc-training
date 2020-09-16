package day2HomeAssign.a9;

public class Keyboard {
	private int mrp, year, noofkeys;
		
	public Keyboard(int mrp, int year, int noofkeys) {
		this.mrp = mrp;
		this.year = year;
		this.noofkeys = noofkeys;
	}
	
	public void show() {
		System.out.println("Keyboard : " + mrp + " " + year + " " + noofkeys);
	}
}
