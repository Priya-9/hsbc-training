package day3class;

public class Oracle implements MyConnection {

	@Override
	public String getConnectionInfo() {
		return "Connection Established";
	}

	@Override
	public String getDbDetails() {
		return "Oracle 4.3";
	}
	
}
