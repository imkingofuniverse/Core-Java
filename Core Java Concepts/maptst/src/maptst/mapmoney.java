package maptst;

import java.util.HashMap;
import java.util.Iterator;

public class mapmoney {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> money = new HashMap<String, Integer>();
		
		money.put("a",1000);
		money.put("b",2000);
		money.put("c",3000);
		money.put("d",4000);
		money.put("e",5000);
		
		Iterator<String> itr= money.keySet().iterator();
		while(itr.hasNext())
		{
			
			System.out.println(money.get(itr.next()));
		}
		
		for (String key: money.keySet()){  
			System.out.println(key+ " - " + money.get(key));
		} 
		
		
		
		int c= money.get("b");
		c=c+1000;
		money.replace("b", c);
		System.out.println("new balance of b:"+money.get("b"));
		
	}

}
