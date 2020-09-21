package day3.DOS;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class WriteDatatofile {
	public static void main(String args[]) throws Exception{
		FileOutputStream fout = new FileOutputStream("A:\\mydat.dat", true);
		BufferedOutputStream bos = new BufferedOutputStream(fout);
		DataOutputStream dos = new DataOutputStream(bos);
		
		dos.write(100);
		dos.writeUTF("Priya");
		dos.writeUTF("Pune");
		dos.writeDouble(443.0);
		
		dos.close();
	}
}
