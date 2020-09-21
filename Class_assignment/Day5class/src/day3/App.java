package day3;

import EmpDao.Emp;

public class App {
	public static void main(String args[]) {
		Emp e1 = new Emp(100, "priya", "pune", 2000);
		Emp e2 = new Emp(200, "abc", "delhi", 3000);
		Emp e3 = new Emp(300, "xyz", "noida", 20);
		
		EmpDao obj = new EmpDaoFileSystem();
		obj.save(e1);
		obj.save(e2);
		obj.save(e3);
	}
}
