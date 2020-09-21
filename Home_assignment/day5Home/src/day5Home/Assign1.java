package day5Home;

import java.io.File;

public class Assign1 {
	public static void main(String args[]) {
		File f = new File("A:\\save.txt");
		System.out.println("File Name " + f.getName());
		System.out.println("Path " + f.getPath());
		System.out.println("Abs Path " + f.getAbsolutePath());
		System.out.println("PArent " + f.getParent());
		System.out.println("File exists " + f.exists());
		System.out.println("file is writable " + f.canWrite());
		System.out.println("file is Readable " + f.canRead());
		System.out.println("file is directory " + f.isDirectory());
		System.out.println("Last modified " + f.lastModified());
		System.out.println("Size : " + f.length() + "Bytes");
	}
}
