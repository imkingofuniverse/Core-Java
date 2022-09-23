package multithreading;

public class threadpriority {
	
	public static void main(String[] args) {
		
		 Thread_prior t1 = new Thread_prior();
		 Thread_prior t2 = new Thread_prior();
		 t1.setPriority(1);
		 t2.setPriority(10);
		 t1.start();
		 t2.start();
		 
	}

}

	 
class Thread_prior extends Thread {
	 @Override
	 public void run() {
		 
		 System.out.println("Current Executing: " + Thread.currentThread().getName() + " -- Priority: "
				 + Thread.currentThread().getPriority());
		 
	 }
}