package addte;

import java.util.Scanner;

public class powerof2 {
	
	public static void main(String[] args) {
		
	
		Scanner in = new Scanner(System.in);
		int a,t=1;
		
		a=in.nextInt();
		System.out.println("input is: "+a);
		
		
        while(a != 1)
        {
            if(a%2 != 0 )
            {
            	t=0; 
            	break;
            }
            a/=2;
        }
        if(a<0)
		{
			System.out.println("Number too small");
		}
		else if(a>32767)
		{
			System.out.println("Number too large");
		}
		else if(t==1)
        {
        	System.out.println("Yes");
        }
        else if(t==0)
        {
        	System.out.println("No");
        }
        
		
		
		
	/*	double x = Math.log(a)/Math.log(2);
		System.out.println("power is: "+x);
		double y = Math.pow(2, x);
		System.out.println("value is: "+y);
		int z=(int) y;
		
		int c=(int) (x%2);
		System.out.println("remainder is"+c);
		
		if(c==0)
		{
			System.out.println("Yes");
		}
		else if(c!=0)
		{
			System.out.println("No");
		}
		else if(a<0)
		{
			System.out.println("Number too small");
		}
		else if(a>32767)
		{
			System.out.println("Number too large");
		}
		
		*/
		
		
		
		
		/*	double x;
		
		x=Math.log(25)/Math.log(5);
		System.out.println(x);
		
		int y=(int) x;
		System.out.println(y);
		
		double z=Math.pow(5, y);
		
		int a=(int) z;
		System.out.println(a);    */
		
	}    

}
