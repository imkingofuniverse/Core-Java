package strings;

public class str {
	public static void main(String[] args) {
		
	String str = "my first program";
	int a= str.length();
	System.out.println(a);
	System.out.println(str.indexOf("p"));
	System.out.println(str.charAt(5));
	System.out.println(str.endsWith("am"));
	System.out.println(str.startsWith("m"));
	System.out.println(str.isEmpty());
	String str1= str.replace("my", "your");
	System.out.println(str1);
	
	}

}

/* create a program to create a string name my first program (i)print no.of characters present inside the string
ii print the index of the chracter p
iii print the character which is present at index 5
iv check if the string end with am
v check if the string starts with m
vi check if the string is empty or not
vii replace the character my with your */