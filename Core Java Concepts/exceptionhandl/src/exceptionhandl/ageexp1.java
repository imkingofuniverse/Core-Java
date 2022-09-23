//WAP to create a customized exception (InvalidAgeException). Take the age input from user if age of the user is greater than 18, print the output as "You are allowed to vote". Else if age is lesser than 18 throw the custom exception with the message "17 is not the appropriate age to vote"

package exceptionhandl;

import java.util.Scanner;

public class ageexp1 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		ageexp a = new ageexp();
		
		a.ageexp(n);
		
		
	}

}
