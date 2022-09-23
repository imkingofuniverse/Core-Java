package streamapi;

import java.util.Arrays;
import java.util.List;

public class streamname {
	
	public static void main(String[] args) {
		
		List<String> name = Arrays.asList("amithabh","warner","aman","rahul","shahrukh");
		name.stream().forEach(System.out::println);
		
		System.out.println("name starting with 'a':");
		name.stream().filter(nam->nam.startsWith("a")).forEach(System.out::println);
		
		System.out.println("name ending with 'r':");
		name.stream().filter(nam->nam.endsWith("r")).forEach(System.out::println);
		
		System.out.println("name whose names end with \'r\': ");
		name.stream().filter(str -> str.endsWith("r")).forEach(str -> System.out.println(str.toUpperCase()));
		System.out.println("Whether any of the name is starting with \'R\': "+name.stream().anyMatch(str -> str.startsWith("R")));
		
		System.out.println("Whether all the names start with \'A\': "+name.stream().allMatch(str -> str.startsWith("A")));
		System.out.println("Whether none of the name starts with \'A\': "+name.stream().noneMatch(str -> str.startsWith("A")));
		
		System.out.println("Count of names ending with \'r\': "+ name.stream().filter(str -> str.endsWith("r")).count());
		System.out.println("First element from list: "+name.get(0));
		
	}

}
