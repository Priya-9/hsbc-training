package day6Class;

public class PrintWorker implements Runnable{
	private MessagePrinter printer;
	private String msg;
	public PrintWorker(MessagePrinter printer, String msg) {
		this.printer = printer;
		this.msg = msg;
	}
	
	public void run() {
		printer.prin(msg);
	}
}
