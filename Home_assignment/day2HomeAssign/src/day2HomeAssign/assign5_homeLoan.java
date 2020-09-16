package day2HomeAssign;

public class assign5_homeLoan {
	private static int interest=5;
	private int principal, year;
	private double loan;
	String name;
	
	public assign5_homeLoan(String name, int principal, int year) {
		this.name = name;
		this.year = year;
		this.principal = principal;
		loan = principal*year*interest*0.01;
	}
	
	public double getloan() {
		return loan;
	}
	
	public double getloan(int principal, int year) {
		return (principal*year*interest*0.01);
	}
}
