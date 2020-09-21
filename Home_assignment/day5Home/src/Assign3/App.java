package Assign3;

public class App {
	public static void main(String args[]) {
		Student s1 = new Student(100, "priya", "pune");
		Student s2 = new Student(200, "abc", "delhi");
		Student s3 = new Student(300, "xyz", "noida");
		
		Save obj = new Save();
		obj.save(s1);
		obj.save(s2);
		obj.save(s3);
	}
}
