package thread;

class WaitnotifyTest{

	
	synchronized void methodOne()
    {
        System.out.println(Thread.currentThread().getName()+" is relasing the lock and going to wait");
        try{
            wait();        //releases the lock of this object and waits
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" got the object lock back and can continue with it's execution");
    }
 
    synchronized void methodTwo(){
        try{
            Thread.sleep(10000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
        notify();     //wakes up one thread randomly which is waiting for lock of this object
        System.out.println("A thread which is waiting for lock of this object is notified by "+Thread.currentThread().getName());
    }
	
}
public class WaitNotify {

	public static void main(String[] args) {
		WaitnotifyTest w = new WaitnotifyTest();
		Thread t= new Thread(){
			public void run(){
				w.methodOne();
			}
		};
		Thread t1= new Thread(){
			public void run(){
				w.methodTwo();
			}
		};
		t.start();
		t1.start();
		
	}

}
