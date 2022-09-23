//create a custom exception invalid mobile exception, take the mobile number as input from the user and then check if it falls under a valid mobile number criteria 1)it should be of ten digits 2)there should only be digits 3)the mobile number should start with either (6,7,8,9)

package exceptionhandl;

import java.util.Scanner;
import java.util.regex.*;

public class mobilenoregexexp {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mobile number: ");
		String inp=sc.nextLine();
		String mobile=new String(inp);
		System.out.println(mobile);
		
		try {
			
			if(mobile.matches("[6-9][0-9]{9}"))
				System.out.println("it is a valid mobile number");
			else
			{
				throw new mobilenoexpreg();
			}
			
		}
		catch(mobilenoexpreg e){
			
			System.out.println("invalid mobile number");
			
		}
		
		
	}

}
