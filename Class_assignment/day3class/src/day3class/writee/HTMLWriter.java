package day3class.writee;

public class HTMLWriter implements Writer{

	public HTMLWriter() {}
	@Override
	public String write(String msg) {
		return ("HTML " + msg );
	}
	
}
