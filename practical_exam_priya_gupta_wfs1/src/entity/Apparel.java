package entity;

public class Apparel {
	private int Item_Code, Price, Quantity;
	private String Item_Name, Size, Material;
	
	public Apparel(int Item_Code, String Item_Name, int Price, String Size, String Material, int Quantity) {
		this.Item_Code = Item_Code;
		this.Item_Name = Item_Name;
		this.Price = Price;
		this.Size = Size;
		this.Material = Material;
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

	public String getSize() {
		return Size;
	}

	public void setSize(String size) {
		Size = size;
	}

	public String getMaterial() {
		return Material;
	}

	public void setMaterial(String material) {
		Material = material;
	}
	
	
}
