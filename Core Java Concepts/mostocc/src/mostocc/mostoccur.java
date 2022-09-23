//find maximum occuring character in a string

package mostocc;

import java.util.Scanner;

public class mostoccur {
	
	public static void main(String[] args) {
		
		int count=0,i,j,n;
		char ch = 0;
		
		System.out.println("Enter the string");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		n=str.length();
		String str1=new String();
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
				if(str.charAt(i)==str.charAt(j))
				{
					ch=str.charAt(i);
					count++;
				}
		}
		System.out.println(ch);
		System.out.println("The most occuring character is "+ch);
		
	}

}
