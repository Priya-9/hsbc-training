package Emp;

public class Hibernate implements EmpDao {

	public Hibernate() {
		
	}
	public emp findById(int id) {
		emp obj = new emp(3, "hibernate_emp");
		return obj;
	}

	public String save(emp e) {
		
		return "SAved in Hibernate";
	}

	
	public void listAllEmp() {
		System.out.println("Listed all employees in Hibernate");
	}
	
}
