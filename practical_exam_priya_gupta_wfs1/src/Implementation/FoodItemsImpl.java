package Implementation;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import dao.Dao;
import entity.FoodItems;

public class FoodItemsImpl implements Dao{
	static List<FoodItems> Db = new LinkedList<FoodItems>();

	public FoodItemsImpl() {
		Db.add(new FoodItems(101, "Milk", 20, "04-03-2020", "05-07-2020", "Yes", 10));
		Db.add(new FoodItems(102, "Yogurt", 355, "04-01-2020", "05-03-2020", "Yes", 5));
		Db.add(new FoodItems(103, "Bread", 87, "01-06-2020", "05-09-2020", "Yes", 100));
		Db.add(new FoodItems(104, "Butter", 30, "04-08-2010", "05-07-2020", "Yes", 56));
		Db.add(new FoodItems(105, "Cake", 250, "01-02-2020", "23-05-2020", "No", 87));
	}

	@Override
	public void additem() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listAll() {
		Collections.sort(Db, new ListSorter());
		int co=0;
		for(FoodItems f : Db) {
			System.out.println(f.getItem_Code()+ "  " + f.getItem_Name() + "  " + f.getQuantity() + "  " + f.getVegetarian());
			co++;
			if(co == 3)
				break;
		}
	}
	
	
}

class ListSorter implements Comparator<FoodItems>{
	public int compare(FoodItems f1, FoodItems f2) {
		return (f2.getQuantity()-f1.getQuantity());
	}
}
