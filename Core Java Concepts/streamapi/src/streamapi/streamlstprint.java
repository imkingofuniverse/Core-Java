//create a list of three strings (cat,dogs,horse). ;print the elements of the list using stream API ;print the length of the strings using stream api

package streamapi;


import java.util.Arrays;
import java.util.List;

public class streamlstprint {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("cat", "dogs", "horse");
		list.stream().forEach(System.out::println);
		list.stream().map(String::length).forEach(System.out::println);
		
	}
	
}
