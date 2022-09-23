package exceptionhandl;

import java.io.FileNotFoundException;

public class democls1 {
	
	public static void main(String[] args) {
		
		try{
			democls2 d=new democls2();
			d.method2();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmatic Exception occured");
		}
		
	}

}
