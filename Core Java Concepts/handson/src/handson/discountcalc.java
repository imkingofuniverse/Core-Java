package handson;

import java.util.Scanner;

public class discountcalc {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Price of item 1");
		float itm1=sc.nextFloat();
		System.out.println("Price of item 2");
		float itm2=sc.nextFloat();
		System.out.println("Discount in percentage");
		int dis=sc.nextInt();
		float total=itm1+itm2;
		System.out.print("Total amount : $");
		System.out.println(String.format("%.2f",total));
		
		float savedamt = (total*dis)/100;
		float disamt=total-savedamt;
		
		System.out.print("Discounted amount : $");
		System.out.println(String.format("%.2f",disamt));
		
		System.out.print("Saved amount : $");
		System.out.println(String.format("%.2f",savedamt));
		
				
	}

}
