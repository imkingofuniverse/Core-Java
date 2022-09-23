package addte;

import java.util.ArrayList;
import java.util.List;

class companydet{
	
	String companyname;
	String type;
	int turnover;
	public companydet(String companyname, String type, int turnover) {
		super();
		this.companyname = companyname;
		this.type = type;
		this.turnover = turnover;
	}
	
	
	
}

class crecord{
	
	List<companydet> companies =new ArrayList<>();
	
	String addcompany(companydet com) {
		
		companies.add(com);
		
		System.out.println("no.of companies in the list : "+companies.size());
		for(companydet d : companies)
		{
			System.out.println("company name : "+d.companyname+" type : "+d.type+" turn over : "+d.turnover);
		}
		
		return "Added";
		
	}
	
}

public class collectionsr {
	
	public static void main(String[] args) {
		
		companydet c1 = new companydet("Doselect","IT",300);
		crecord rec=new crecord();
		String str = rec.addcompany(c1);
		System.out.println(str);
		
	}

}
