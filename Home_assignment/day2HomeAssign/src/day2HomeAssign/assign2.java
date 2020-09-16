package day2HomeAssign;

import java.util.Scanner;

public class assign2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int ans = 1;
		for(int i=x; i>=1; i--)
			ans = ans*i;
		System.out.println(ans);
	}
}
