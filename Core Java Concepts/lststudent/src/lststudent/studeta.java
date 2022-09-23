package lststudent;

import java.util.ArrayList;

public class studeta {
	
	public static void main(String[] args) {
		
		student s1 = new student();
		s1.setRoll(101);
		s1.setName("Deepak");
		s1.setAge(23);
		student s2 = new student();
		s2.setRoll(102);
		s2.setName("Ravi");
		s2.setAge(25);
		student s3 = new student();
		s3.setRoll(103);
		s3.setName("Raj");
		s3.setAge(19);
		
		ArrayList<student> student = new ArrayList<student>();
		student.add(s1);
		student.add(s2);
		student.add(s3);
		
		
		System.out.println("Student details: ");
		for(student s: student) {
		System.out.println("Roll: "+s.roll+" Name: "+s.name+" Age: "+s.age);
		}
		System.out.print("Student names: ");
		for(student s: student) {
		System.out.print(s.name+" ");
		}
		System.out.println("\nStudent whose age is below 20: ");
		for(student s: student) {
		if(s.age<20) {
		System.out.println("Name: "+s.name+" Id: "+s.roll);
		}
		}
		
	}

}
