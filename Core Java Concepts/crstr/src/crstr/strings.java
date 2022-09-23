package crstr;

public class strings {
	
	public static void main(String[] args) {
		String str= "this is a really simple sentence";
		int n=str.length();
		int i,vow=0,con=0,blank=0;
		for(i=0;i<n;i++)
		{
			if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u')
				vow=vow+1;
			else
				con=con+1;
		}
		for(i=0;i<n;i++)
		{
			if(str.charAt(i)==' ')
				blank=blank+1;
		}
		con=con-blank;
		System.out.println("No.of Vowels= "+vow+" "+"No.of Consonents= "+con);
	}

}
//create a string which has a value "this is a really simple sentence" ,print the count od the vowels and consonants in the string