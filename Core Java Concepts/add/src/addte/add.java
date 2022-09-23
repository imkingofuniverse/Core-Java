package addte;

import java.util.*;

public class add {
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println(a + 10);
		String str = Integer.toString(a);
		StringBuilder sb = new StringBuilder(str);
		StringBuilder sb2 = new StringBuilder(str);
		sb.reverse();
		System.out.println(sb+" "+sb2);
		if(sb.equals(sb2)) {
			System.out.println(sb+" is a palindrome");
		}
		else {
			System.out.println(sb+" is not a palindrome");
		}
		
		int len=str.length();
		int arr[] = new int[len];
		
		for(int i=0;i<len;i++)
		{
			int n=Character.getNumericValue(str.charAt(i));
			arr[i]=n;
		}
		for(int i=0;i<len;i++)
		{
			System.out.println(arr[i]);
		}

		Arrays.sort(arr);
		
	
	for(int i=0;i<len;i++)
	{
		System.out.println(arr[i]);
	}
	System.out.println(arr.length);
	
	

}
}
