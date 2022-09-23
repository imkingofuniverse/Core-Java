package addte;


class customer{
	
	int id;
	String name;
	double walletid;
	String address;
	public customer(int id, String name, double walletid, String address) {
		super();
		this.id = id;
		this.name = name;
		this.walletid = walletid;
		this.address = address;
	}
	
	
}

class item{
	
	int id;
	String name;
	String companyname;
	double price;
	boolean isinstock;
	
	public item(int id, String name, String companyname, double price, boolean isinstock) {
		super();
		this.id = id;
		this.companyname = companyname;
		this.price = price;
		this.isinstock = isinstock;
	}
	
}

class shoppingwebsite{
	
	String purchaseitem(item i,customer c) throws insufficientbalanceexception,itemoutofstockexception {
		
		String msg="";
		
		try {
			
			if(c.walletid>i.price  && i.isinstock==true)
			{
				return "Order Successful";
			}
			else if(i.isinstock!=true) {
				
				throw new itemoutofstockexception(msg);
				
			}
			else if(c.walletid<i.price)
			{
				throw new insufficientbalanceexception(msg);
			}
		}
		catch(insufficientbalanceexception e){
				
			return "customer wallet balance is not sufficient";
				
		}
		catch(itemoutofstockexception e) {
			return "item out of stock";
		}
		
		return "Order Successful";
		
		
	}
	
}

class insufficientbalanceexception extends Exception{
	
	String message;
	public insufficientbalanceexception(String message) {
		
		this.message = message;
		
	}
	
}

class itemoutofstockexception extends Exception{
	
	String message;
	public itemoutofstockexception(String message) {
		
		this.message = message;
		
	}
	
}

public class exceptionso {
	
	public static void main(String[] args) throws insufficientbalanceexception, itemoutofstockexception {
		
		customer cusdet = new customer(927392,"Steve",5000.0,"USA");
		item itemdet = new item(27392,"T-Shirt","US polo",800,true);
		shoppingwebsite obj=new shoppingwebsite();
		String out = obj.purchaseitem(itemdet, cusdet);
		System.out.println(out);
		
		System.out.println("customer wallet id : "+cusdet.walletid);
		
		
	}
	
	

}
