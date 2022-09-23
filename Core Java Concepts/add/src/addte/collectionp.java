package addte;

import java.util.HashMap;

class Population{
	HashMap<String, Integer> dataList=new HashMap<String, Integer>();
	String maxPopulation() {
		
		String str="";
		int max=0;
		for (String key: dataList.keySet()){  
			System.out.println(key+ " - " + dataList.get(key)); //na
			if(max<dataList.get(key)) 
			{
				max=dataList.get(key);
				str=key;
			}
			
		}
		
		return str;
		
	}
	String minPopulation() {
		
		String str="";
		int min=999999999;
		for (String key: dataList.keySet()){  
			System.out.println(key+ " - " + dataList.get(key)); //na
			if(min>dataList.get(key)) 
			{
				min=dataList.get(key);
				str=key;
			}
			
		}
		
		return str;
		
	}
	long totalPopulation() {
		
		int sum=0;
		for (String key: dataList.keySet()){  
			System.out.println(key+ " - " + dataList.get(key)); //na
			
				sum=sum+dataList.get(key);
			
		}
		long tsum=sum;
		return tsum;
		
	}
}

public class collectionp {
	
	public static void main(String[] args) {
		
		Population obj = new Population();
		obj.dataList.put("India",26382898);
		obj.dataList.put("USA",82738);
		obj.dataList.put("UK",92732);
		String max=obj.maxPopulation();
		System.out.println("max = "+max);
		String min=obj.minPopulation();
		System.out.println("min = "+min);
		long total=obj.totalPopulation();
		System.out.println("total = "+total);
	}

}
