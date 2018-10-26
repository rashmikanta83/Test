package thread;

public class ThreadByImplement implements Runnable{
	@Override
	public void run() {
		System.out.println("Started");
		for(int i=0;i<500;i++){
			System.out.println(Thread.currentThread().getName()+"--"+i);
		}
		System.out.println("Ended");
		
	}
	public static void main(String[] args) {
		ThreadByImplement t= new ThreadByImplement();
		Thread th=new Thread(t);
		th.start();
		
		ThreadByImplement t1= new ThreadByImplement();
		Thread th2=new Thread(t1);
		th2.start();																																																
	}

	

}
