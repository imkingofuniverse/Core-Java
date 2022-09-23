//create a string a,b,c split the stringwith ","

package divstr2;

public class divstr {
	
	public static void main(String[] args) {
		
		String str= "a,b,c";
		int i,n;
		n=str.length();
		char string[]=str.toCharArray();
		for(i=0;i<n;i++)
		{
			if(string[i]!=',')
				System.out.print(string[i]);
			else
				System.out.println();
		}
		
	}

}
