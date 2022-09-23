//create a program to create a list of fruits (mango,apple,banana,grapes) and print the elements of the list using enhanced fro loop and iterator

package arrlisttest;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylisttest {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("mango");
		list.add("apple");
		list.add("banana");
		list.add("grapes");
		System.out.print("using enhanced for loop: ");
		for(String ele: list) {
		System.out.print(ele+" ");
		}
		System.out.println();
		Iterator iterator = list.iterator();
		System.out.println("uing iterator.next()");
		while(iterator.hasNext())
		{
			System.out.print(iterator.next()+" ");
		}
		list.set(1, "strawberry");
		System.out.println();
		System.out.println(" new list ");
		for(String ele: list) 
		{
			System.out.print(ele+" ");
		}
		
		
		
		
	}

}
