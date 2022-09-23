//create a program to findout to find out division of two values,take both the values as input from the user and print the output; input provided by user = a=20,b=10. ; a=30,b=0

package exceptionhandl;

import java.util.Scanner;

public class expdiv {
	
	public static void main(String[] args) {
	
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		try 
		{
			c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) 
		{
			System.out.println("not defined");
		}
		
		
		
	}

}
