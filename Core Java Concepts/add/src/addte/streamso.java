package addte;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;



class people{
	
	String name;
	int age;
	gender gend;
	
	enum gender{
		MAN,
		WOMAN;
	}

	public people(String name, int age, gender gend) {
		
		this.name = name;
		this.age = age;
		this.gend = gend;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public gender getGend() {
		return gend;
	}

	public void setGend(gender gend) {
		this.gend = gend;
	}
	
	
	
	
}

class peopleimplementation{
	
	public int minimumagecontaininge(Collection<people> peoples) {
		
		for(people p : peoples) {
			System.out.println("Name : "+p.name+" Age : "+p.age);
		}
		
		peoples.stream().filter(c -> c.name.contains("e")).forEach(c -> System.out.println(c.name));
		
		List<people> namee = new ArrayList<people>();
		namee = peoples.stream().filter(c -> c.name.contains("e")).collect(Collectors.toList());
		
		int minage=999999999;
		for(people p : namee) {
			if(p.age<minage) {
				minage=p.age;
			}
		}
		
		return minage;
		
	}
	
	public int getageofoldestman(Collection<people> peoples) {
		
		for(people p : peoples) {
			System.out.println("Name : "+p.name+" Age : "+p.age);
		}
		
		peoples.stream().filter(c -> c.gend==people.gender.MAN).forEach(c -> System.out.println(c.name));
		
		List<people> namee = new ArrayList<people>();
		namee = peoples.stream().filter(c -> c.gend==people.gender.MAN).collect(Collectors.toList());
		
		int maxage=0;
		for(people p : namee) {
			if(p.age>maxage) {
				maxage=p.age;
			}
		}
		
		return maxage;  
		
	}
	
}

public class streamso {
	
	public static void main(String[] args) {
		
		Collection<people> peoples = Arrays.asList(
				new people("Vivek",16,people.gender.MAN),
				new people("Kayle",23,people.gender.WOMAN),
				new people("Jeremy",42,people.gender.MAN),
				new people("Ivan",69,people.gender.MAN));
		
		peopleimplementation obj=new peopleimplementation();
		
		int minage = obj.minimumagecontaininge(peoples);
		System.out.println("minimum age containing e : "+minage);
		
		int maxage = obj.getageofoldestman(peoples);
		System.out.println("maximum age of male : "+maxage);
		
	}

}
