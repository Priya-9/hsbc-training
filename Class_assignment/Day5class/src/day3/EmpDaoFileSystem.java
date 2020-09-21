package day3;

import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import EmpDao.Emp;

public class EmpDaoFileSystem implements EmpDao {

	@Override
	public void save(Emp emp) {
		FileWriter fiwrite = null;
		BufferedWriter bwrite = null;
		
		try {
			Check obj = new Check();
			boolean c = obj.check(emp);
			if(c == false) {
				fiwrite = new FileWriter("A:\\save.txt", true);
				bwrite = new BufferedWriter(fiwrite);
				String str = emp.getId() + "," + emp.getName() + "," + emp.getLocation() + "," + emp.getSalary() + "\n";
				
				bwrite.write(str);
			}
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
				if(bwrite != null) {
					bwrite.close();
				}
			}
			catch(IOException e) {
				System.out.println(e);
			}
		}
	}
}
