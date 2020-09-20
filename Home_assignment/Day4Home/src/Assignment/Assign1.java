package Assignment;

public class Assign1 {
	public static void main(String args[]) throws ArithmeticException {
		//try {
			int x=4, y=0;
			int ans = x/y;
			System.out.println(ans);
		//}
		/*catch(ArithmeticException e) {
			System.out.println("Divided by zero");
		}
		finally {
			System.out.println("Done");
		}*/
		System.out.println("After try catch block");
	}

}
/*
Instructions :
no space or symbols in name of package, class

name should match with keyword

Without catch statement try will give error.
At least finally statement required to remove the error.

throw and throws used to throw it to the function that called it.
After exception goes in catch block. then only after code   normal flow starts.

If function is throwing an exception. Then dont return a datatype. Instead print it in the function
*/

