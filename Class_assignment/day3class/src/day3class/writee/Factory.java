package day3class.writee;

public class Factory {
	public static Writer getWriter(String type) {
		if(type.equals("Decorated")) {
			return new DecoratedWriter();
		}
		else if(type.equals("Plain"))	{
			return new PlainTextWriter();
		}
		else if(type.equals("HTML"))	{
			return new HTMLWriter();
		}
		else {
			return null;
		}
	}
}
