package day3class;

public class Employee extends Person {
	private Double salary;
	
	public Employee(int id, String name, double salary) {
		super(id, name);
		this.salary = salary;
	}
	
	public String getDetails() {
		return (super.getDetails() + " " + salary);
	}
	
	public String toString() {
		return "This is  " + this.getClass().getSimpleName();
	}
}
