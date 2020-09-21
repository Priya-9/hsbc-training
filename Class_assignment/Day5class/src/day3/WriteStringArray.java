package day3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteStringArray {
	public static void main(String args[]) {
		FileWriter fos = null;
		BufferedWriter bos = null;
		
		try {
		
			File file = new File("A:\\demo.txt");
			fos = new FileWriter(file, true);
			bos = new BufferedWriter(fos);
			String arr[] = {"abc", "xyz", "fgh", "klmn", "hello" , "World" , "fwew"	, "efg", "uvw", "igh"};
			for(int i=0; i<10; i++) {
				bos.write(arr[i] + '\n');
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found ");
		}
		catch(IOException e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally");
			try {
				if(bos != null) {
					bos.close();
				}
			}
			catch(IOException e) {
				System.out.println(e);
			}
		}
		System.out.println("End");
	}
}
