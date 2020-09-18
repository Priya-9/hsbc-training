package Emp;

public class emp {
	private int id;
	private String name;
	
	public emp(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public String show() {
		return (id + "  " + name);
	}
}
