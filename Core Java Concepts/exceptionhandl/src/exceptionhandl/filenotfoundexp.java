//write a program to mannually throw filenotfound exception and then handle it in same class

package exceptionhandl;

import java.io.FileNotFoundException;

public class filenotfoundexp {
	
	public static void main(String[] args) {
		
		try {
			
			throw new FileNotFoundException();
			
		}
		catch(FileNotFoundException e){
			
			System.out.println("file is not found with given name");
			
		}
		
		
	}

}
