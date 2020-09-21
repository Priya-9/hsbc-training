package day5Home;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Assign5 {
	public static void main(String args[]) {
		FileReader firead = null;
		BufferedReader bread = null;
		
		try {
			firead = new FileReader("Random.txt");
			bread = new BufferedReader(firead);
			String line = "";
			int lines=0, words=0;
			
			while((line = bread.readLine()) != null) {
				for(int i=0; i<line.length(); i++) {
					if(line.charAt(i) == ' ')	words++;
					if(line.charAt(i) == '.') {
						lines++;
						words++;
						if(line.charAt(i) == ' ')	i++;
					}
				}
			}
			
			System.out.println(words + "  " + lines);
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
