package exceptionhandl;

import java.util.Scanner;
import java.util.regex.*;

public class emailvalidregexexp {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter email id: ");
		String inp=sc.nextLine();
		String email=new String(inp);
		System.out.println("your email id: "+email);
		
		try {
			
			if(email.matches("[a-z0-9]*(@)[a-z]*(.com)"))
				System.out.println("it is a valid email id");
			else
			{
				throw new emailvalidexp();
			}
			
		}
		catch(emailvalidexp e) {
			
			System.out.println("invalid email id");
			
		}
		
	}

}
