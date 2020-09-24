package entity;

public class Electronics {
	private int Item_Code, Price, warranty, Quantity;
	private String Item_Name;
	
	public Electronics(int Item_Code, String Item_Name, int Price, int warranty, int Quantity) {
		this.Item_Code = Item_Code;
		this.Item_Name = Item_Name;
		this.Price = Price;
		this.warranty = warranty;
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

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
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

}
