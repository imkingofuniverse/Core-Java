//write a program to create a functional interface to take two strings as an input and then return whether both of them are equal or not

package lambedaexp;

import java.util.function.BiPredicate;

public class eqlusinglambds {
	
	public static void main(String[] args) {
		
		String str1="hello";
		String str2="hello";
		BiPredicate<String,String> streql=(String stri1,String stri2) -> str1.equals(str2);
		boolean t = streql.test(str1,str2);
		System.out.println(t);
	}

}
