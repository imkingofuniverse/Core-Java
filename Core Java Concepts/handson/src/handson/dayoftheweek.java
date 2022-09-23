package handson;

import java.util.Scanner;

public class dayoftheweek {
		
		public static void main(String[] args) {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter day number");
			int num=sc.nextInt();
			String day[]= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
			
			int da=0;
			for(int d=1;d<=7;d++)
			{
				for(int i=d;i<=num;i=i+7)
				{
					if(num==i)
					{
						System.out.println(day[da]);
						break;
					}
					
				}
				da=da+1;
				
			}
			
			
		}

	}
