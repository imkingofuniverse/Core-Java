package com.capgemini.mavendemo.entity;

public class employee {
	
	private int empid;
	private String name;
	private String designation;
	private int salary;
	
	public employee(int empid, String name, String designation, int salary) {
		super();
		this.empid = empid;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString(){
		return "employee [EmpId="+empid+" ,name="+name+" ,Designation="+designation+" ,Salary="+salary+"]";
	}
	
	

}
