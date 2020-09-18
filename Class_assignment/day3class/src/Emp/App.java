package Emp;

public class App {
	public static void main(String args[]) {
		String s1 = "Hibernate";
		String s2 = "JDBC";
		
		Factory f = new Factory();
		EmpDao obj;
		obj = f.generateEmpdao("JDBC");
		emp e; 
		e = obj.findById(2);
		obj.listAllEmp();
		System.out.println(obj.save(e));
	}
}
