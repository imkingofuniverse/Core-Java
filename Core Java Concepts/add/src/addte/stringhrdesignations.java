package addte;

import java.util.Scanner;

public class stringhrdesignations {
	
	public static void main(String[] args) {
		
		int i,count=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] str = new String[n];
		Scanner st=new Scanner(System.in);
		for(i=0;i<n;i++)
		{
			if(st.hasNextLine()) 
			{
				str[i]=st.nextLine();
			}
		}
		for(i=0;i<n;i++)
		{
			System.out.println(str[i]);
		}
		
		for(i=0;i<n;i++)
		{
			if(str[i].contains("HR"))
			{
				System.out.println(str[i]);
				count+=1;
			}
		}
		System.out.println("Total "+count);
		for(i=0;i<n;i++)
		{
			if(str[i].contains("HR"))
			{
				System.out.println(str[i].toUpperCase());
			}
		}
		if(count==0)
		{
			System.out.println("No");
		}
		
	}
	

}
