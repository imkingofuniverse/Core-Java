package lambedaexp;

import java.util.LinkedList;
import java.util.function.Supplier;


public class itemmain {
	
	public static void main(String[] args) {
		
		item i1= new item();
		i1.setName("a");
		i1.setPrice(10);
		item i2= new item();
		i2.setName("b");
		i2.setPrice(20);
		LinkedList<item> itm = new LinkedList<item>();
		itm.add(i1);
		itm.add(i2);
		for(item i : itm)
		System.out.println("name="+i.name+" price="+i.price);
		
		Supplier<item> supplier = () -> new item();
		System.out.println("Initial values: ");
		System.out.println("Name: "+supplier.get().getName());
		System.out.println("Price: "+supplier.get().getPrice());
		
		
	}

}
