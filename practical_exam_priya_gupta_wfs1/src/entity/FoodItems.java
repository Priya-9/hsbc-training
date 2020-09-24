package entity;

public class FoodItems {
	private int Item_Code, Price, Quantity;
	private String Item_Name, Date_Manufacture, Date_Expiry, Vegetarian;
	
	public FoodItems(int Item_Code, String Item_Name, int Price, String Date_Manufacture, String Date_Expiry, String Vegetarian, int Quantity) {
		this.Item_Code = Item_Code;
		this.Item_Name = Item_Name;
		this.Price = Price;
		this.Date_Manufacture = Date_Manufacture;
		this.Date_Expiry = Date_Expiry;
		this.Vegetarian = Vegetarian;
		this.Quantity = Quantity;
	}

	public int getItem_Code() {
		return Item_Code;
	}

	public void setItem_Code(int item_Code) {
		Item_Code = item_Code;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}

	public String getItem_Name() {
		return Item_Name;
	}

	public void setItem_Name(String item_Name) {
		Item_Name = item_Name;
	}

	public String getDate_Manufacture() {
		return Date_Manufacture;
	}

	public void setDate_Manufacture(String date_Manufacture) {
		Date_Manufacture = date_Manufacture;
	}

	public String getDate_Expiry() {
		return Date_Expiry;
	}

	public void setDate_Expiry(String date_Expiry) {
		Date_Expiry = date_Expiry;
	}

	public String getVegetarian() {
		return Vegetarian;
	}

	public void setVegetarian(String vegetarian) {
		Vegetarian = vegetarian;
	}
	
}
