//write a program to store address in a list

package linkedlist;

import java.util.LinkedList;


public class linkedlistaddr {
	
	public static void main(String[] args) {
		
		lladdress a1= new lladdress("tom","bakers street","london","uk",123);
		lladdress a2= new lladdress("james","street 11","bostan","us",1234);
		lladdress a3= new lladdress("raj","street 21","delhi","delhi",12345);
		
		
		
		
		LinkedList<lladdress> address = new LinkedList<lladdress>();
		address.add(a1);
		address.add(a2);
		address.add(a3);
		
		System.out.println("address details: ");
		for(lladdress a: address) {
		System.out.println("Name: "+a.name+" Street: "+a.street+" City: "+a.city+" State: "+a.state+" Code: "+a.code);
		
		}
		
		System.out.print("city of person named tom: ");
		for(lladdress a: address) {
			if(a.name=="tom")
			{
				
				System.out.println(a.city);
			
			}
		}
		System.out.print("Name of a person whose city is delhi: ");
		for(lladdress a: address) {
			if(a.city=="delhi")
			{
				
				System.out.println(a.name);
			
			}
		}
		
		lladdress a4 = new lladdress("rishab","street 56","gurgaun","haryana",12);
		lladdress a5 = new lladdress("deepak","street 58","noida","up",567);
		
		LinkedList<lladdress> address2 = new LinkedList<lladdress>();
		address2.add(a4);
		address2.add(a5);
		
		address.addAll(address2);
		
		System.out.println("address details: ");
		for(lladdress a: address) {
		System.out.println("Name: "+a.name+" Street: "+a.street+" City: "+a.city+" State: "+a.state+" Code: "+a.code);
		
		}
		
		System.out.print("street of a person who has code 567: ");
		for(lladdress a: address) {
			if(a.code==567)
			{
				
				System.out.println(a.street);
			
			}
		}
		
		
		
		
	}

}
