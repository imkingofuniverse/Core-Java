package addte;

import java.util.ArrayList;
import java.util.List;

class employee{
	String name;
	int salary;
	public employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}



public class streamv {
	
	public static void main(String[] args) {
		
		List<employee> emps=new ArrayList<>();
		emps.add(new employee("Mickey",100000));
		emps.add(new employee("Timmy",50000));
		emps.add(new employee("Anny",40000));
		
	}

}
