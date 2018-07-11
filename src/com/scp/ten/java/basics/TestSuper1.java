package com.scp.ten.java.basics;


class Person{
	int id ;
	String name;
	String Type="parent class";

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Person() {
		super();
		System.out.println(" inside parent class constructor");

	}
	
	
	void p1(){
		System.out.println("parent class method");
	}
	
}


class Emp extends Person{
	float salary;
	String Type = "child class";
	
	public Emp() {
		super();
		System.out.println(" inside child class constructor");
	}


	public Emp(int id, String name,float salary) {
		super(id, name);
		this.salary=salary;		
	}
	
	
void printType(){
	System.out.println("value with super:"+super.Type);//print from child class instance variable
	System.out.println("value without super:"+Type);//print from parent class instance variable
	super.p1();// executes the parent class methods
}
	



}


public class TestSuper1{
	public static void main(String[] args) {
		Emp e1 = new Emp(); //first execute parent class con due to super
		e1.printType();
		



	
	}
	
	
}