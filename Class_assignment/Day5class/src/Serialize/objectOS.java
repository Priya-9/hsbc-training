package Serialize;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import EmpDao.Emp;

public class objectOS {
	public static void main(String args[]) throws Exception{
		FileOutputStream fos = new FileOutputStream("emp.ser");
		ObjectOutputStream objOut = new ObjectOutputStream(fos);
		
		for(int i=1; i<11; i++) {
			Emp emp = new Emp(100+i, "priya"+i, "pune"+i, 30+i);
			objOut.writeObject(emp);
		}
		objOut.close();
		
		System.out.println("End");
	}
}
