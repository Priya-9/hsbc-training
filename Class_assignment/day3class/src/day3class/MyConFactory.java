package day3class;

public class MyConFactory {
	public static MyConnection getMyConnection(String dbname) {
		if(dbname.equals("Oracle")){
			return new Oracle();
		}
		else if(dbname.equals("mysql")) {
			return new MySQL();
		}
		else {
			return null;
		}
	}
}
