package thread;

public class SetPriority implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() +"   "+ Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		Thread t1 = new Thread(new SetPriority() , "Thread -1"); 
		Thread t2 = new Thread(new SetPriority() , "Thread -2"); 
		Thread t3 = new Thread(new SetPriority() , "Thread -3"); 
		Thread t4 = new Thread(new SetPriority() , "Thread -4"); 
		Thread t5 = new Thread(new SetPriority() , "Thread -5"); 
		Thread t6 = new Thread(new SetPriority() , "Thread -6"); 
		
		t1.setPriority(1);
		t2.setPriority(2);
		t3.setPriority(3);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		
		t1.setPriority(5);
		t2.setPriority(6);
		t3.setPriority(7);

	}


}
