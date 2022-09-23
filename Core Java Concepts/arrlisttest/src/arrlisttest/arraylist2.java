//Create an ArrayList of integers {1,2,3,4,5} and perform some operations

package arrlisttest;
import java.util.ArrayList;

public class arraylist2 {
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.remove(3);
		System.out.print("check if the list contains element 4 : ");
		System.out.println(list.contains(4));
		ArrayList<Integer> list2=new ArrayList<Integer>();
		list2.add(2);
		list2.add(3);
		list2.add(5);
		System.out.print("check if the list1 contains elements of list2 : ");
		System.out.println(list.containsAll(list2));
		list.addAll(list2);
		System.out.print("List after adding list1 and list2 : ");
		for(Integer ele: list) 
		{
			System.out.print(ele+" ");
		}
		System.out.println();
		System.out.print("List after removing 1 : ");
		int a=list.indexOf(1);
		list.remove(a);
		for(Integer ele: list) 
		{
			System.out.print(ele+" ");
		}
		
		
		
	}

}
