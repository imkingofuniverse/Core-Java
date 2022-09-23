//write a program to divide a string in n equal parts aaaabbbbcccc

package divstr;

import java.util.Scanner;

public class dividestr {
	
	public static void main(String[] args) {
		
		int len,n,i,div,count=0;
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=sc.nextLine();
		len=str.length();
		System.out.println("Enter no.of parts n");
		n=sc.nextInt();
		if(len%n!=0)
		{
			System.out.println("cannot divide into parts");
		}
		div=len/n;
		
	/*	for(i=0;i<len;i++)
		{
			if(count!=div)
			{
				System.out.print(str.charAt(i));
				count++;
			}
			else	
			{
				System.out.println();
				count=0;
			} */
		for(i=0;i<len;i++)
		{
			if(i%div==0)
				System.out.println();
			System.out.print(str.charAt(i));
		
		}
		
		
		
	}

}
