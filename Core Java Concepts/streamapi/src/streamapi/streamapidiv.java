package streamapi;

import java.util.ArrayList;
import java.util.Arrays;

public class streamapidiv {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));
		System.out.println("no.of elements divisible by 3 are: "+list.stream().filter(i -> i%3==0).count());
		list.stream().filter(i -> i%3==0).forEach(i->System.out.println(i));
	}
	
}
