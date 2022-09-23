package handson;

import java.util.Scanner;

public class secureurl {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		System.out.println("Enter the start string");
		String start=sc.nextLine();
		
		if(str.startsWith(start))
		{
			System.out.println("\""+str+"\""+" starts with "+start);
		}
		else
		{
			System.out.println("\""+str+"\""+" does not start with "+start);
		}
	}

}
