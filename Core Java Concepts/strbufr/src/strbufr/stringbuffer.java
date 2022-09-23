//create a program to create stringbuffer for value "student"

package strbufr;

public class stringbuffer {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("student");
		sb.append("details");
		System.out.println(sb);
		sb.insert(7, " ");
		System.out.println(sb);
		sb.replace(8, 15, "informs");
		System.out.println(sb);
		sb.delete(8, 10);
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
	}

}
