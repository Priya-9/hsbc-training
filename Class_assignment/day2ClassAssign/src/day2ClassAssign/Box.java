package day2ClassAssign;

public class Box {
	private int length, breadth, height;
	private String colour = "Not Set";
	private double weight = 0.0;
	
	public Box(int length, int breadth, int height)
	{	this.length = length;
		this.breadth = breadth;
		this.height = height;
	}
	
	public Box(int length, int breadth, int height, String colour)
	{	this(length, breadth, height);
		this.colour = colour;
	}
	
	public Box(int length, int breadth, int height, String colour, double weight)
	{	this(length, breadth, height, colour);
		this.weight = weight;
	}
	
	public double getVolume() {
		return length*breadth*height;
	}
	
	public String getColour() {
		return colour;
	}
	
	public double getWeight() {
		return weight;
	}
}
