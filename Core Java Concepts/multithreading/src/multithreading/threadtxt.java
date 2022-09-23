//create the thread as hello thread ;start this thread execution and after starting ,the thread should print a message "hello welcome to capgemini"

package multithreading;

class hellothread extends Thread{
	
	public void run() {
		System.out.println("Welcome to Capgemini");
		}

}






public class threadtxt {
	
	public static void main(String[] args) {
		 hellothread hello = new hellothread();
		 hello.start();
		 
	}
	
	
}