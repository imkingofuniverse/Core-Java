//create a map having key as name and runs as value. (vishal,10)(sachin,30)(vibhav,20)

package maptst;

import java.util.HashMap;

public class maptest {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> runsmap = new HashMap<String,Integer>();
		
		runsmap.put("vishal",10);
		runsmap.put("sachin",30);
		runsmap.put("vibhav",20);
		
		System.out.print("printing the size of the map: ");
		System.out.println(runsmap.size());
		System.out.println("Printing the elements of map: " + runsmap);
		
		System.out.print("If vishal is in record print his runs: ");
		if (runsmap.containsKey("vishal")) {
			System.out.println(runsmap.get("vishal"));
		} 
		else {
			System.out.println("vishal is not in record");
		}
		
	}

}
