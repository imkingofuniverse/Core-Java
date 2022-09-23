//WAP to create a custom exception InvalidUserException which will take username and password as input. If username has "capgemini" in the inputted username and has "1" in the password then show the output as "Valid User", else throw the exception with the message "Invalid credentials for username and password"

package exceptionhandl;

import java.util.Scanner;

public class userexp1 {

	public static void main(String[] args) {
		
		System.out.println("enter userid: ");
		Scanner sc2=new Scanner(System.in);
		String str=sc2.nextLine();
		System.out.println("enter password: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		userexp a = new userexp();
		
		a.userexp(str,n);
		
	}
	
}
