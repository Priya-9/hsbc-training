package Implementation;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import dao.Dao;
import entity.Electronics;

public class ElectronicsImpl implements Dao{
	static List<Electronics> Db = new LinkedList<Electronics>();

	public ElectronicsImpl() {
		Db.add(new Electronics(1, "Watch" , 350, 24, 100));
		Db.add(new Electronics(2, "Remote" , 25, 18, 30));
		Db.add(new Electronics(3, "Microwave" , 5000, 12, 40));
		Db.add(new Electronics(4, "TV" , 3500, 18, 50));
		Db.add(new Electronics(5, "Charger" , 40000, 24, 10));
	}

	@Override
	public void additem() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listAll() {
		Collections.sort(Db, new ElectronicsSorter());
		int co=0;
		for(Electronics f : Db) {
			System.out.println(f.getItem_Code()+ "  " + f.getItem_Name() + "  " + f.getQuantity() + "  " + f.getWarranty());
			co++;
			if(co == 3)
				break;
		}
	}
	
	
}

class ElectronicsSorter implements Comparator<Electronics>{
	public int compare(Electronics f1, Electronics f2) {
		return (f2.getQuantity()-f1.getQuantity());
	}
}

