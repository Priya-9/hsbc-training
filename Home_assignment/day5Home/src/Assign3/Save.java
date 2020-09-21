package Assign3;

import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Save {
	
	public void save(Student stu) {
		FileWriter fiwrite = null;
		BufferedWriter bwrite = null;
		
		try {
			
				fiwrite = new FileWriter("save.txt", true);
				bwrite = new BufferedWriter(fiwrite);
				String str = stu.getId() + "," + stu.getName() + "," + stu.getLocation() + "\n";
				
				bwrite.write(str);
			
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
