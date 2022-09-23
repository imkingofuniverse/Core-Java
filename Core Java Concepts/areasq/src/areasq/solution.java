package areasq;

import java.util.Scanner;

public class solution {
		
	int area(int side){
		int temp;
		temp= (side*side);
		System.out.println(temp);
	}
}
public class demo {
	
	public static void main(String[] args) {
		
		solution sol= new solution();
	
		Scanner sc= new Scanner(System.in);
		int side=sc.nextInt();
		sol.area(side);
	}

}