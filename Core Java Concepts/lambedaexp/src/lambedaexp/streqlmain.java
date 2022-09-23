//write a program to create a functional interface to take two strings as an input and then return whether both of them are equal or not make use of the implementation class to solve this program

package lambedaexp;

public class streqlmain {
	
	public static void main(String[] args) {
		
		String str1="hello";
		String str2="hello";
		streqlinterface eq=new streqlcls();
		boolean result=eq.equal(str1,str2);
		System.out.println(result);
		
	}

}
