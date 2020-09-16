package day2HomeAssign.a9;

public class monitor {
	private int mrp, year;
	private double quality;
	
	public monitor(int mrp, int year, double quality) {
		this.mrp = mrp;
		this.year = year;
		this.quality = quality;
	}
	
	public void show() {
		System.out.println("Monitor : " + mrp + " " + year + " " + quality);
	}
}
