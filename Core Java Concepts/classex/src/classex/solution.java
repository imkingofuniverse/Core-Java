package classex;

import java.util.Scanner;

public class solution {
	public int area(int side) {
		int temp;
		temp = (side*side);
		return temp;
	}

}

public class example {

	public static void main(String[] args) {
		System.out.println("Enter side length");
		Scanner sc = new Scanner(System.in);
		int side = sc.nextInt();
		solution solobj = new solution();
		int output = solution.area(side);
		System.out.println("The area is " + output);
	}
}
