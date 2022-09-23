//find out the duplicate characters in a string and count

package dubch;

import java.util.Scanner;

public class dublicatechar {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the string");
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		int i,j,n,count=0;
		n=str.length();
		for(i=0;i<n;i++)
		{
			for(j=i+1;j<n;j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					System.out.println(str.charAt(j));
					count++;
				}
		}
		
	}
		System.out.println(count);
}
}
