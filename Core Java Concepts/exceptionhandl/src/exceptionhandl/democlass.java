package exceptionhandl;

public class democlass {
	
	void demethod(){
	
		try {
			String str= null;
			str.length();
		}
		catch (NullPointerException e)
		{
			System.out.println("NullPointer Exception occured");
		}
		throw new ArithmeticException();
	}

}
