package thread;

class HWThreadTest implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Started");
		for(int i=0;i<1000;i++){
			System.out.println(Thread.currentThread().getName()+"--"+i);
		}
		System.out.println("Ended");
		
	}
}

class HWThreadTest2 implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Started");
		for(int i=0;i<1000;i++){
			System.out.println(Thread.currentThread().getName()+"--"+i);
		}
		System.out.println("Ended");
		
	}
}

class HWThreadTest3 implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Started");
		for(int i=0;i<1000;i++){
			System.out.println(Thread.currentThread().getName()+"--"+i);
		}
		System.out.println("Ended");
		
	}
}

public class Join_HeavyWeightThread {

	public static void main(String[] args) {
		Thread t= new Thread(new HWThreadTest2());
		Thread t1= new Thread(new HWThreadTest2());
		Thread t2= new Thread(new HWThreadTest3());
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
	}

}
