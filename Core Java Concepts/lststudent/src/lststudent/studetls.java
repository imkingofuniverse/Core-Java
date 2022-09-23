//using class students with constructors

package lststudent;

import java.util.ArrayList;

public class studetls {
	
	public static void main(String[] args) {
		
		students s1 = new students(101,"Deepak",23);
		students s2 = new students(102,"Ravi",25);
		students s3 = new students(103, "Raj",19);
		
		ArrayList<students> student = new ArrayList<students>();
		student.add(s1);
		student.add(s2);
		student.add(s3);
		
		System.out.println("Student details: ");
		for(students s: student) {
		System.out.println("Roll: "+s.id+" Name: "+s.name+" Age: "+s.age);
		}
		System.out.print("Student names: ");
		for(students s: student) {
		System.out.print(s.name+" ");
		}
		System.out.println("\nStudent whose age is below 20: ");
		for(students s: student) {
		if(s.age<20) {
		System.out.println("Name: "+s.name+" Id: "+s.id);
		}
		}
		
	}

}
