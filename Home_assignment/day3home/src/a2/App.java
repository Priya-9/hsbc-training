package a2;

public class App {
	tvRemote remote;
	
	public App(tvRemote remote) {
		this.remote = remote;
	}
	
	public void show() {
		System.out.println(remote.status());
		System.out.println(remote.Remote());
	}
	
}
