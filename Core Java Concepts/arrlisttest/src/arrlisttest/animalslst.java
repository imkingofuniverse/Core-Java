//Creating a list of animals and using methods

package arrlisttest;

import java.util.ArrayList;
import java.util.Collections;

public class animalslst {
	
	public static void main(String[] args) {
		
ArrayList<String> list = new ArrayList<String>();
		
		list.add("cat");
		list.add("dog");
		list.add("cow");
		System.out.println("Animal list: " + list);
		System.out.println(list.get(1));
		list.set(2, "horse");
		Collections.sort(list);
		System.out.println("Sorted Animal list: " + list);
		int n=list.indexOf("cat");
		System.out.println("index of element cat: "+n);
		int siz=list.size();
		System.out.println("size of arraylist: "+siz);
		
		ArrayList<String> sublist = new ArrayList<String>();
		sublist.addAll(list.subList(0, 2));
		System.out.println("Sub List : "+sublist);
		list.clear();
		
	}

}
