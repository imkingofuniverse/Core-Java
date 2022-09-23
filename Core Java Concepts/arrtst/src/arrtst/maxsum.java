package arrtst;

import java.util.Scanner;

public class maxsum {

public static void main(String[] args) {
	
	Scanner in= new Scanner(System.in);
	int a=in.nextInt();
	int arr[]=new int[a];
	System.out.println("enter elements");
	Scanner inp= new Scanner(System.in);
	int i,sum = 0;
	for(i=0;i<a;i++)
	{
		arr[i]=inp.nextInt();
	}
	for(i=0;i<a;i++)
	{
		sum+=arr[i];
	}
	System.out.println(sum);
}
	
}
