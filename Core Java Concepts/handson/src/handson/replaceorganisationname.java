package handson;

import java.util.Scanner;

public class replaceorganisationname {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the name of the company");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		System.out.println("Enter old name of the company");
		String strold=sc.nextLine();
		
		System.out.println("Enter new name of the company");
		String strnew=sc.nextLine();
		
		System.out.println(str.replaceAll(strold, strnew));
		
	}

}
