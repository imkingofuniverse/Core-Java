package addte;

import java.util.Scanner;

public class checkifprime {

	public static void main(String[] args) {
		
		int a, b,i, c = 2, d = 2;
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		for(i=2;i<a;i++)
		{
			if(a%i==0)
			{
				c=1;
			}
		}
		for(i=2;i<b;i++)
		{
			if(b%i==0)
			{
				d=1;
			}
		}
		if(a==b)
			System.out.println("o");
		else if(c==2 && d==2)
		{
			if(a>b)
				System.out.println(a);
			else
				System.out.println(b);
		}
                     
		else if(c==1 || d==1)
		{
			if(a<b)
				System.out.println(a);
			else
				System.out.println(b);
		}
}
}
