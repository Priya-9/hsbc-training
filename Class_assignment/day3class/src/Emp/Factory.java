package Emp;

public class Factory {
	public EmpDao generateEmpdao(String type) {
		if(type == "Hibernate") {
			return new Hibernate();
		}
		else if(type == "JDBC") {
			return (new JDBC());
		}
		return null;
	}
}
