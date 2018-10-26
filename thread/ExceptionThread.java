package thread;

import java.lang.Thread.UncaughtExceptionHandler;
import java.sql.SQLException;

class ExceptionHandler implements UncaughtExceptionHandler
{
   public void uncaughtException(Thread t, Throwable e)
   {
      new Thread(new ExceptionThread()).start();
   }
}
public class ExceptionThread implements Runnable{

	@Override
	public void run() {  // throws Exception  - Error will throw
	/*	try {
			Class.forName("asas");
		} catch (ClassNotFoundException e) {
			System.out.println("No class found");
		}*/
		/*Thread.currentThread().setUncaughtExceptionHandler(new ExceptionHandler());
		System.out.println(111);
		System.out.println(222);
		System.out.println(333);
		System.out.println(2/0);
		System.out.println(444);
		System.out.println(555);
		System.out.println(666);*/
		
		try {
			Class.forName("asas");
			throw new SQLException();
		} catch (Exception e) {
			System.out.println("No class found");
		}
	}
	public static void main(String[] args) {
		ExceptionThread e= new ExceptionThread();
		Thread t= new Thread(e);
		t.start();
		
	}


}
