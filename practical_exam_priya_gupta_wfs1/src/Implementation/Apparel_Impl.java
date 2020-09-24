package Implementation;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import dao.Dao;
import entity.Apparel;

public class Apparel_Impl implements Dao{
	static List<Apparel> Db = new LinkedList<Apparel>();

	public Apparel_Impl() {
		Db.add(new Apparel(11, "Tshirt", 250, "Large", "Cotton", 30));
		Db.add(new Apparel(12, "Sweater", 300, "Medium", "Woolen", 50));
		Db.add(new Apparel(13, "Saree", 10000, "Small", "Silk", 80));
		Db.add(new Apparel(14, "Socks", 25, "Large", "nylon", 90));
		Db.add(new Apparel(15, "shirt", 500, "Medium", "Cotton", 10));
	}

	@Override
	public void additem() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listAll() {
		Collections.sort(Db, new ApparelSorter());
		int co=0;
		for(Apparel f : Db) {
			System.out.println(f.getItem_Code()+ "  " + f.getItem_Name() + "  " + f.getQuantity() + "  " + f.getSize()+ "   " + f.getMaterial());
			co++;
			if(co == 3)
				break;
		}
	}
	
	
}

class ApparelSorter implements Comparator<Apparel>{
	public int compare(Apparel f1, Apparel f2) {
		return (f2.getQuantity()-f1.getQuantity());
	}
}

