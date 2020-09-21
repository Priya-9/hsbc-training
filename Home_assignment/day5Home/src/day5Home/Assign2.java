package day5Home;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Assign2 {
	public static void main(String args[]) {
		String from = args[0];
		String to = args[1];
		
		FileReader fread = null;
		FileWriter fwrite = null;
		BufferedReader bread = null;
		BufferedWriter bwrite = null;
		
		try {
			fread = new FileReader(from);
			bread = new BufferedReader(fread);
			fwrite = new FileWriter(to);
			bwrite = new BufferedWriter(fwrite);
			
			String line;
			while((line = bread.readLine()) != null )  {
				bwrite.write(line);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
		catch(EOFException e) {
			System.out.println("Done Reading");
		}
		catch(IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				if(bread != null)
					bread.close();
				
				if(bwrite != null)
					bwrite.close();
			}
			catch(IOException e) {
				System.out.println(e);
			}
		}
	}
}
