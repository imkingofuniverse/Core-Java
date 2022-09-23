package addte;

import java.util.Scanner;

public class scanner {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		String str;
		str=sc.nextLine();
		int i=0;
		int sum=0;
		int n;
		
		String s[]=str.split(" ");

		
		int len=s.length;
		for(i=0;i<len;i++)
		{
			n=Integer.parseInt(s[i]);
			sum=sum+n;
			System.out.println(s[i]);
		}
		System.out.println(sum);
	}

}
