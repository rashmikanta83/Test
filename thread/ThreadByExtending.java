package thread;

public class ThreadByExtending extends Thread{

	public static void main(String[] args){
		ThreadByExtending t = new ThreadByExtending();
		System.out.println("---Started---");
		t.start();
	}

}
