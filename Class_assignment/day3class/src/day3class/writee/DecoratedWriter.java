package day3class.writee;

public class DecoratedWriter implements Writer {

	public DecoratedWriter() {	}
	@Override
	public String write(String msg) {
		return ("Decorated " + msg);
	}

}
