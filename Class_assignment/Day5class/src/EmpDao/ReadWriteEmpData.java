package EmpDao;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadWriteEmpData {
	public static void main(String args[]) {
		FileReader firead = null;
		BufferedReader bread = null;
		
		try {
			firead = new FileReader("A:\\demo.txt");
			bread = new BufferedReader(firead);
			String line = "";
			while((line = bread.readLine()) != null) {
				System.out.println(line);
				String[] cols = line.split(",");
				int id = Integer.parseInt(cols[0]);
				int salary = Integer.parseInt(cols[3]);
				
				for(int i=0; i<cols.length; i++) {
					System.out.print(cols[i] + " ");
				}
				System.out.println();
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
				if(bread != null) {
					bread.close();
				}
			}
			catch(IOException e) {
				System.out.println(e);
			}
		}
	}
}
