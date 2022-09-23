//create a treeset of countries(india,australia,china,japan);using iterater print the elements of the set;remove chinafrom the set;add india to the set;check whether it contains south africa

package arrlisttest;

import java.util.Iterator;
import java.util.TreeSet;

public class countryset {
	public static void main(String[] args) {
	
	TreeSet<String> list= new TreeSet<String>();
	list.add("india");
	list.add("australia");
	list.add("china");
	list.add("japan");
	Iterator<String> iterator = list.iterator();
	System.out.println("Printing set values using iterator: ");
	while(iterator.hasNext())
	{
		System.out.print(iterator.next()+" ");
		
	}
	System.out.println();
	list.remove("china");
	
	System.out.println("After removing china: ");
	System.out.print(list+" ");
	System.out.println();
	list.add("india");
	System.out.println("whether it contains south africa: "+list.contains("south africa"));
	System.out.print(list+" ");

	
	
	
	}
}
