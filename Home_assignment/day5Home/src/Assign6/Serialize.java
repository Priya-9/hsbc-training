package Assign6;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialize {

	public static void main(String[] args) throws Exception {
			
			FileOutputStream fos=new FileOutputStream("emp.ser");
			ObjectOutputStream objOut=new ObjectOutputStream(fos);
			
			for(int i=1;i<11;i++) {
				Customer c= new Customer(1+i, "Customer"+i, "City"+i);
			
			objOut.writeObject(c);
			}
			objOut.close();
			
			System.out.println("Emp Serialized..");

		}

}

