package addte;

import java.util.Scanner;

public class cameltosnake {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String inp=sc.nextLine();
		String str=new String(inp);
		
		snakecase s=new snakecase();
		s.camelto(str);
		
	}

}
