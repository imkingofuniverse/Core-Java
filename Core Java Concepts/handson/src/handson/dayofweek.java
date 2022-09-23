package handson;

import java.util.Scanner;


public class dayofweek {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day number");
		int num=sc.nextInt();
		String day[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		
		for(int i=1;i<=num;i=i+7)
		{
			if(num==i)
				System.out.println(day[0]);
		}
		for(int i=2;i<=num;i=i+7)
		{
			if(num==i)
				System.out.println(day[1]);
		}
		for(int i=3;i<=num;i=i+7)
		{
			if(num==i)
				System.out.println(day[2]);
		}
		for(int i=4;i<=num;i=i+7)
		{
			if(num==i)
				System.out.println(day[3]);
		}
		for(int i=5;i<=num;i=i+7)
		{
			if(num==i)
				System.out.println(day[4]);
		}
		for(int i=6;i<=num;i=i+7)
		{
			if(num==i)
				System.out.println(day[5]);
		}
		for(int i=7;i<=num;i=i+7)
		{
			if(num==i)
				System.out.println(day[6]);
		}
		
	}

}
