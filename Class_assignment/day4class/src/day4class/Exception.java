package day4class;

public class Exception {
	public static void main(String args[]) {
		int nums[] = new int[4];
		nums[0] = 1;	
		nums[1] = 2;
		nums[3] = 3;
		nums[2] = 4;
		
		try {
			System.out.println(nums[4]);
		}
		catch(Throwable e) {
			e.printStackTrace();
			System.out.println("Exception");
		}
		System.out.println("Done");
	}
}
