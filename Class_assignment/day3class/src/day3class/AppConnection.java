package day3class;

public class AppConnection {
	public static void main(String args[]) {
	MyConnection con = new MySQL();
	
	System.out.println(MyConnection.releaseVer);
	System.out.println(con.getConnectionInfo());
	System.out.println(con.getDbDetails());
	}
}
