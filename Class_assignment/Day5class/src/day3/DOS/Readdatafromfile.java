package day3.DOS;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;

public class Readdatafromfile {
	FileInputStream fis = null;
	BufferedInputStream bis = null;
	DataInputStream dis = null;
	
	try {
		fis = new FileInputStream("A:\\mydat.txt");
		bis = new BufferedInputStream(fis);
		dis = new DataInputStream(bis);
		
		while(true)
		
	}
}
