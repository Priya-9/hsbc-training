package Emp;

public interface EmpDao {
	public emp findById(int id);
	public String save(emp e);
	public void listAllEmp();
}
