//write the string position, you need to print characters and corresponding occurance

package crwtoc;

import java.util.Scanner;

public class charwithoccu {
	
	public static void main(String[] args) {
		
		int n,i,j,count = 0;
		System.out.println("Enter the string");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		n=str.length();
		char string[]=str.toCharArray();
		for(i=0;i<n;i++)
		{
			
			count=0;
			for(j=i;j<n;j++)
			{
				if(string[i]==string[j])
					count++;
			}
			System.out.println(str.charAt(i)+"="+count+"count");
			System.out.println();
			
		}
		
		
	}

}
