package thread;

public class Join_LightWeightThread implements Runnable{
	
	@Override
	public void run() {
		System.out.println("Started");
		for(int i=0;i<1000;i++){
			System.out.println(Thread.currentThread().getName()+"--"+i);
		}
		System.out.println("Ended");
		
	}
	
	public static void main(String[] args) {
		Join_LightWeightThread j= new Join_LightWeightThread();
		Join_LightWeightThread j1= new Join_LightWeightThread();
		Join_LightWeightThread j2= new Join_LightWeightThread();
		Thread t=new Thread(j);
		Thread t1=new Thread(j1);
		Thread t2=new Thread(j2);
		t1.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t.start();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
	}

}
