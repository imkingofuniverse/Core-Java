//create a map having values int and string (1,one)(2,two)(3,three)(4,four)(5,five)(6,six)

package maptst;

import java.util.HashMap;
import java.util.Iterator;

public class mapnum {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> num = new HashMap<Integer, String>();
		
		num.put(1,"one");
		num.put(2,"two");
		num.put(3,"three");
		num.put(4,"four");
		num.put(5,"five");
		num.put(6,"six");
		
		Iterator<Integer> itr= num.keySet().iterator();
		while(itr.hasNext())
		{
			System.out.println(num.get(itr.next()));
		}
		
		num.replace(2, "na");
		num.remove(4);
		
		System.out.println("after replacing two with na and removing key 4 : ");
		Iterator<Integer> itr2= num.keySet().iterator();
		while(itr2.hasNext())
		{
			System.out.print(num.get(itr2.next())+" ");
		}
		System.out.println();
		System.out.println("checking if map contains elements or not:"+num.isEmpty());
		
		System.out.println("checking if map contains element three:"+num.containsValue("three"));
		
		System.out.println("printing set view of map: ");
		System.out.println(num.keySet());
		
		System.out.println("Map in form of set: "+num.entrySet());
		
		num.clear();
		
	}

}
