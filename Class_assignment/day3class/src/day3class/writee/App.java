package day3class.writee;

public class App {
	public static void main(String args[]) {
		String s1 = "Decorated";
		String s2 = "Plain";
		String s3 = "HTML";
		
		Writer obj1 = Factory.getWriter(s1);
		System.out.println(obj1.write("I am writen using Decorated Text Writer"));
		
		Writer obj2 = Factory.getWriter(s2);
		System.out.println(obj2.write("I am writen using Plain Text Writer"));
		
		Writer obj3 = Factory.getWriter(s3);
		System.out.println(obj3.write("I am writen using HTML Text Writer"));
	}
}
