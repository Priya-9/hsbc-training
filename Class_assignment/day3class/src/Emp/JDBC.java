package Emp;

public class JDBC implements EmpDao {

	public JDBC() {
		
	}
	
	public emp findById(int id) {
		emp obj = new emp(1, "abc");
		return obj;
	}

	
	public String save(emp e) {
		
		return "SAved in JDBC";
	}

	
	public void listAllEmp() {
		System.out.println("Listed all employees in JDBC");
	}
	
}
