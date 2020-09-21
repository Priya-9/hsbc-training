package day3;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import EmpDao.Emp;

public class Check {
	boolean check(Emp emp) {
		FileReader fread = null;
		BufferedReader bread = null;
		
		try {
			fread = new FileReader("A:\\save.txt");
			bread = new BufferedReader(fread);
			
			String line = "";
			while((line = bread.readLine()) != null) {
				String cols[] = line.split(",");
				int id = Integer.parseInt(cols[0]);
				//System.out.println(id);
				if(id == emp.getId())
					throw new EmployeeExist();
			}
		}
		catch(EmployeeExist e) {
			System.out.print(emp.getId() + " ");
			System.out.println( e);
			return true;
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found ");
		}
		catch(EOFException e) {
			System.out.println("Done Reading");
		}
		catch(IOException e) {
			System.out.println(e);
		}
		finally {
			
			try {
				if(bread != null) {
					bread.close();
				}
			}
			catch(IOException e) {
				System.out.println(e);
			}
		}
		
		return false;
	}
}
