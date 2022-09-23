package addte;

import java.util.ArrayList;

class company{
	String companyname;
	String type;
	int turnover;
	public company(String companyname, String type, int turnover) {
		super();
		this.companyname = companyname;
		this.type = type;
		this.turnover = turnover;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getTurnover() {
		return turnover;
	}
	public void setTurnover(int turnover) {
		this.turnover = turnover;
	}
	
	
	
}

class record{
	
	ArrayList<company> companies = new ArrayList<>();
	
	public String addcompany(company c) {
		
		
		
		return null;
		
	}
	public String filterdata() {
		
		
		
		return null;
		
	}
	
}

public class collectionsm {
	
	public static void main(String[] args) {
		
		company c1=new company("Doselect","IT",300);
		record record=new record();
		record.addcompany(c1);
		
		
	}

}
