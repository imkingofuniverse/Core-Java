package addte;

import java.util.Scanner;

public class busseats {
	public static void main(String[] args) {
		
	
	
	int arr[]={3,4,8,7,11,12,16,15,19,20,24,23,27,28,32,31,35,36};
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int len=arr.length;
	if(n>37)
	{
		System.out.println("Seat does not exist");
	}
	for(int i=0;i<len;i++)
	{
		if(n==arr[i])
			System.out.println("Aisle");
			break;
		
	}
	for(int i=0;i<len;i++)
	{
		if(n!=arr[i] && n<38)
		System.out.println("Window");
		break;
	}
	
	}

}
