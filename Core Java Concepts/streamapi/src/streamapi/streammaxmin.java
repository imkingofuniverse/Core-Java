//create a list of elements (5,7,13,9,1) find out minimum value in this list the minimum value has to be found out after removing all the values less than 3 out of it

package streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class streammaxmin {
	
	public static void main(String[] args) {
		
		List<Integer> num = Arrays.asList(5,7,13,9,1);
		num.stream().forEach(System.out::println);
		
		System.out.print("number less than 3: ");
		num.stream().filter(n -> n < 5).forEach(System.out::println);
		
		List<Integer> num2 = new ArrayList<Integer>();
		
		num2 = num.stream().filter(i->i>3).sorted().collect(Collectors.toList());
		System.out.println(num2.get(0));
		
		System.out.println("new list");
		num2.stream().forEach(System.out::println);
		
	}

}
