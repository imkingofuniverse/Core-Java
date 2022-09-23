package exceptionhandl;

public class democlass1 {
	
	public static void main(String[] args) {
		
		try {
			democlass d =new democlass();
			d.demethod();
		}
		catch (ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occured");
		}
		
		
		
	}

}
