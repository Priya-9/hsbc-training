package day2HomeAssign;

public class assign5_personalLoan {
	private static int interest=4;
	private int principal, year;
	private double loan;
	String name;
	
	public assign5_personalLoan(String name, int principal, int year) {
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
