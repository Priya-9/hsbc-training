/**
 * @author Priya Gupta
 */

package day1;

public class Emp {
	
	private int empID;
	private String empName, city;
	private double salary;
	
	/**
	 * 
	 * @param empID
	 * @param empName
	 * @param city
	 * @param salary
	 */
	
	public Emp(int empID, String empName, String city, double salary)
	{	this.empID = empID;
		this.empName = empName;
		this.city = city;
		this.salary = salary;
	}
	
	
	public String getEmpDetails()
	{	return (empID + " " + empName + " " + city + " " + salary);
	}
	
	public void setEmpName(String empName)
	{	this.empName = empName;
	}
}
