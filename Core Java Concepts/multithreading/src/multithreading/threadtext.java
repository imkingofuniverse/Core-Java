//create the thread as hello thread ;start this thread execution and after starting ,the thread should print a message "hello welcome to capgemini" with runnable

package multithreading;


class helothread implements Runnable {
	 @Override
	 public void run() {
		 
		 System.out.println("Welcome to capgemini Implementation");
	 
	 }
}



public class threadtext {
	
	public static void main(String[] args) {
		 
		Thread t = new Thread(new helothread());
		 t.start();
		 
	}

}
