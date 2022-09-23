//Create a list of 4 students, ("A","B","C","D"). Print the element of this list using lambda expresssion

package lambedaexp;

import java.util.LinkedList;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class listusinglambdaexp {

	public static void main(String[] args) {
		
		LinkedList<String> itm = new LinkedList<String>();
		itm.add("a");
		itm.add("b");
		itm.add("c");
		itm.add("d");
		System.out.println(itm.size());
		int len=itm.size();
		System.out.println(itm);
		Consumer<String> consumer=(String str) -> System.out.println(str);;
		for(int i=0;i<len;i++)
		consumer.accept(itm.get(i));
		
		
		
	}
	
	
}
