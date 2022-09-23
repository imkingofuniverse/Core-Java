package revstr;

import java.util.Scanner;

public class rev {
	
	public static void main(String[] args) {
		
		String str1;
		int n,i;
		System.out.println("enter a string");
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(str);
		n=str.length();
		String str11= new String();
		for(i=n-1;i>=0;i--)
		{
			str11=str11+str.charAt(i);
		}
		System.out.println(str11);
	}

}
//take the input string from the user and then print reversed string as an output