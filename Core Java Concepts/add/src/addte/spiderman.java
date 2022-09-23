package addte;

import java.util.Scanner;

public class spiderman {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str;
		str=sc.nextLine();
		int i=0;
		int sum=0;
		int n;
		
		String s[]=str.split(" ");

		
		int len=s.length;
		int web[]=new int[len];
		for(i=0;i<len;i++)
		{
			n=Integer.parseInt(s[i]);
			web[i]=n;
		}
		
		int prev=web[0];
		int add=1;
		
		for(i=0;i<len;i++)
		{
			if(prev==web[i] || prev>web[i])
			{
				sum=sum+1;
				prev=1;
			}
			else if(prev<web[i])
			{
				add=sum;
				sum=sum+prev+1;
				prev=sum-add;
				
			}
		}
		System.out.println(sum);
		
		
		
	}

}
