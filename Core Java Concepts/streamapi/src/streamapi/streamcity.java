//create a list of strings (pune,mumbai,chennai,banglore,noida) ;print all the cities ;print only those cities which has length more than 5 ;create a list of the cities which has length lesser than 5 ; print the corresponding length of all the cities

package streamapi;

import java.util.ArrayList;
import java.util.List;

public class streamcity {
	
	public static void main(String[] args) {
		
		List<String> city=new ArrayList<String>();
		city.add("pune");
		city.add("mumbai");
		city.add("chennai");
		city.add("banglore");
		city.add("noida");
		
		city.stream().forEach((str)->System.out.println(str));
		
		System.out.println("Cities greater than length 5: ");
		city.stream().filter(c -> c.length() > 5).forEach(System.out::println);
		
		System.out.println("Cities lesser than length 5: ");
		city.stream().filter(c -> c.length() < 5).forEach(System.out::println);
		
		System.out.println("Corresponding length of all cities: ");
		city.stream().map(str -> str.length()).forEach(System.out::println);

}
}
