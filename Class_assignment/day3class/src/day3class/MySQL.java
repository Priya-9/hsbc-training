package day3class;

public class MySQL implements MyConnection {

	@Override
	public String getConnectionInfo() {
		return "Connection established successfully";
	}

	@Override
	public String getDbDetails() {
		return "MySQL DB 8.3";
	}
	
}
