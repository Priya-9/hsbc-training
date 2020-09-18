package FilePackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo {
	public static void main(String args[]) throws Exception {
		
		FileInputStream fis = null;
		FileOutputStream fout = null;
		try {
		File file = new File("a:\\demo.text");
		fis = new FileInputStream(file);
		fout = new FileOutputStream("a:\\demo1.text");
		
		int data = 0;
		
			while ((data = fis.read()) != -1) {
				System.out.print((char)data);
				fout.write(data);
			}
		}
		catch(Throwable e) {
			System.out.println("Exception");
		}
		finally {
			fis.close();
			fout.close();
		}
		
	}
}
