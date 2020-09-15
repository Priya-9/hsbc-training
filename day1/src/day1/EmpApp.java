/**
 * @author Priya Gupta
 */
package day1;

public class EmpApp {
	public static void main(String args[])
	{
		Emp e = new Emp(100, "Priya Gupta", "Hyderabad", 100000);
		String info = e.getEmpDetails();
		System.out.println(info);
	}
}
