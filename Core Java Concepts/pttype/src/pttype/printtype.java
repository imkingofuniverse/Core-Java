//print if it is upper,lower,number or white space

package pttype;

public class printtype {
	
	public static void main(String[] args) {
		
		char arr[]= {'a','b','5','A',' '};
		int n,i;
		n=arr.length;
		for(i=0;i<n;i++)
		{
				char ch=arr[i];
				if (ch >= 'A' && ch <= 'Z')
	                System.out.println(ch+"= upper");
	            else if (ch >= 'a' && ch <= 'z')
	            	System.out.println(ch+"= lower");
	            else if (ch >= '0' && ch <= '9')
	            	System.out.println(ch+"= number");
	            else if (ch == ' ')
	            	System.out.println(ch+"= white space");
		}
		
		
	}

}
