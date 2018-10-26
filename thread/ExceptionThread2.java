package thread;

class ExceptionThread2Test implements Runnable {
   String str;
   public void run() {
          str.equals("abc");
   }     
}
public class ExceptionThread2 {

	public static void main(String[] args) {
		Thread thread1 = new Thread(new ExceptionThread2Test(),"thread-1");
	     
	      Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(){
	          public void uncaughtException(Thread thread, Throwable throwable) {
	            System.out.println(thread.getName() + " has thrown " + throwable);
	          }
	      });
	      
	      thread1.start();
       }
}

