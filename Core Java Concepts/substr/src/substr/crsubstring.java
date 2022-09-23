//program to create a string "application", take out the string, out of the existing string starting from index 3 to 6

package substr;

public class crsubstring {
	
	public static void main(String[] args) {
		
		String str= "application";
		System.out.println(str);
		int i,n;
		n=str.length();
		char string[]=str.toCharArray();
		for(i=3;i<7;i++)
		{
				System.out.print(string[i]);
		}
	}

}
