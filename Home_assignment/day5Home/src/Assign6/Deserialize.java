package Assign6;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialize {
	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("emp2.ser");
		ObjectInputStream objIn = new ObjectInputStream(fis);

		try {
			while (true) {
				Customer c = (Customer) objIn.readObject();
				System.out.println(c.getId() + " " + c.getName() + " " + c.getAddress());
			}
		} catch (EOFException e) {
			e.printStackTrace();
			//System.out.println("Done....");
		}
		objIn.close();

	}
}
