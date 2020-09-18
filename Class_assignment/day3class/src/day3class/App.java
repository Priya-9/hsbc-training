package day3class;

public class App {
	public static void main(String args[]) {
		Person p = new Person(100, "abc");
		Employee e = new Employee(200, "xyz", 40000);
		
		System.out.println(p.getDetails());
		System.out.println(e.getDetails());
	}
}
	