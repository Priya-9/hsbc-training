package day2HomeAssign.a9;

public class cpu {
	private int mrp, year;
	String processor;
	
	public cpu(int mrp, int year, String processor) {
		this.mrp = mrp;
		this.year = year;
		this.processor = processor;
	}
	
	public void show() {
		System.out.println("cpu : " + mrp + " " + year + " " + processor);
	}
}
