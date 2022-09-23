package handson;

import java.util.Scanner;

public class comparetwointegers {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		int n1=sc.nextInt();
		System.out.println("Enter the second number");
		int n2=sc.nextInt();
		
		if(n1>n2)
		{
			System.out.println(n1+" is greater than "+n2);
		}
		else if(n1<n2)
		{
			System.out.println(n1+" is less than "+n2);
		}
		else if(n1==n2)
		{
			System.out.println(n1+" is equal to "+n2);
		}
		
	}

}
