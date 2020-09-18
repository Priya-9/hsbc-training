package day3class.writee;

public class PlainTextWriter implements Writer{

	public PlainTextWriter() {}
	@Override
	public String write(String msg) {
		return ("Plain " + msg);
	}

}
