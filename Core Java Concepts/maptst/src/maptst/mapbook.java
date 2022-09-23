//create a map which will have (studentid=key , book=value) book=(book id,book name,book publisher,book quantity)the record of map will be (1, (101,c,yashwanth,bpb,8))(2,(102,data communications,ashish,mcgrawhill,4))
package maptst;

import java.util.HashMap;

public class mapbook {
	
	public static void main(String[] args) {
		
		HashMap<Integer, book> bookdetails = new HashMap<Integer, book>();
		
		book b1 = new book(101,"c","yashwanth","bpb",8);
		book b2 = new book(102,"data communications","ashish","mcgrawhill",4);
		
		bookdetails.put(1,b1);
		bookdetails.put(2,b2);

		
		//lambda method
		
		bookdetails.forEach((key, value) -> 
		{
			 System.out.println(key + " Details:" + " " + value.getbookid() + " " + value.getbookname() + " " + value.getauthor()
			 + " " + value.getbookpublish() + " " + value.getbookqty());
		});
		
		
		
	}

}
