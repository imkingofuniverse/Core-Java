//create a map containing id and name (100,amith)(101,vijay)(102,rahul)  ;if the below entry is not present then add it(103,gaurav) ;print the new map

package maptst;

import java.util.HashMap;

public class mapidname {

	public static void main(String[] args) {
		
		HashMap<Integer, String> details = new HashMap<Integer, String>();
		
		details.put(100,"amith");
		details.put(101,"vijay");
		details.put(102,"rahul");
		
		System.out.println("check if 103 is presant: "+details.containsKey(103));
		if(details.containsKey(103)==false)
		{
			details.put(103,"gaurav");
		}
		
		for (int key: details.keySet())
		{  
			System.out.println(key+ " - " + details.get(key));
		} 
		
		HashMap<Integer, String> details2 = new HashMap<Integer, String>();
		
		details2.put(104,"ravi");
		details2.put(105,"rohith");
		
		details.putAll(details2);
		System.out.println("updated details:");
		for (int key: details.keySet())
		{  
			System.out.println(key+ " - " + details.get(key));
		} 
		
		details.replace(102, "gaurav");
		
	}
	
}
