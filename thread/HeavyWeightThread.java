package thread;
 class HWThread1 implements Runnable{

	 @Override
		public void run() {
			System.out.println("HWThread1 Started");
			for(int i=0;i<500;i++){
				System.out.println(Thread.currentThread().getName()+"--"+i);
			}
			System.out.println("HWThread1 Ended");
			
		}
 }
 
 class HWThread2 implements Runnable{

	 @Override
		public void run() {
			System.out.println("HWThread2 Started");
			for(int i=0;i<500;i++){
				System.out.println(Thread.currentThread().getName()+"--"+i);
			}
			System.out.println("HWThread2 Ended");
			
		}
 }
public class HeavyWeightThread {

	public static void main(String[] args) {
		Thread t1 = new Thread(new HWThread1(),"Thread-1");
		Thread t2 = new Thread(new HWThread2(),"Thread-2");
		t1.start();
		t2.start();

	}

}
