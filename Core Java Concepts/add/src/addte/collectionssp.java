package addte;

import java.util.ArrayList;


class student{
	
	String name;
	String collegename;
	float percentage;
	float scholarchip;
	public student(String name, String collegename, float percentage) {
		
		this.name = name;
		this.collegename = collegename;
		this.percentage = percentage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public float getScholarchip() {
		return scholarchip;
	}
	public void setScholarchip(float scholarchip) {
		this.scholarchip = scholarchip;
	}
	
	
	
}

class portal{
	ArrayList<student> studentlist=new ArrayList<>();
	
	void assignscholarship() {
		
		for(student s: studentlist) {
			
			if(s.percentage>=91) {
				s.scholarchip=10000;
			}
			else if(s.percentage>=81) {
				s.scholarchip=5000;
			}
			else if(s.percentage<81) {
				s.scholarchip=0;
			}
			System.out.println("Percentage : "+s.percentage+" Scholarship : "+s.scholarchip);
			
			}
		
		
		
	}
	float totalscholarship(){
		
		float sum=0;
		for(student s: studentlist) {
			sum=sum+s.scholarchip;
		}
		
		return sum;
		
	}
	String totalmaxscholarshipofcollege() {
		
		float maxs=0;
		String str="";
		
		for(student s: studentlist) {
			if(s.scholarchip>maxs) {
				maxs=s.scholarchip;
				str=s.collegename;
			}
		}
		
		return str;
		
	}
}


public class collectionssp {
	
	public static void main(String[] args) {
		
		portal obj=new portal();
		obj.studentlist.add(new student("Steve","IIT",89));
		obj.studentlist.add(new student("Bob","NIT",94));
		obj.studentlist.add(new student("Alice","Abcd",59));
		
		

		for(student s: obj.studentlist) {
			System.out.println("Percentage: "+s.percentage);
			
			}
		
		
		obj.assignscholarship();
		
		
		float f=obj.totalscholarship();
		System.out.println("Total scholarship issued by government : "+f);
		
		String str=obj.totalmaxscholarshipofcollege();
		System.out.println("total max scholarship of college : "+str);
		
	}

}
