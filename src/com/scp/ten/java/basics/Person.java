package com.scp.ten.java.basics;


public class Person {
	long aadharId;
	String firstName;
	String address;
	static String state;

	static{
		state="MH";
		System.out.println("Static fields initialization");
		System.out.println("inside static block");
	}
	
	{
		System.out.println("Instance fields initialization");
		System.out.println("Instance block");
	}
	
	public Person(long adh, String fnm, String adr) {
		this.aadharId = adh;
		this.firstName = fnm;
		this.address = adr;
	}
	public static void main(String[] args) {
		Person p1 = new Person(12121212l,"Amit","Pune");
		Person p2 = new Person(222222222,"John","Mumbai");
		
		p1.displayPersonInfo(); //P1 -- load --execution --bahar nikalo ---
		p2.displayPersonInfo();
		
		showPersonInfo(p2);
		
	}

	public void displayPersonInfo() {
			String name = "LocalVar";
			System.out.println("Addhar ID : " +aadharId);
			System.out.println("First-Name :" +firstName);
			System.out.println("Address : " +address);
			System.out.println("State :" +state);
			name="xyz";
			System.out.println(name);
			
	}

	static public void showPersonInfo(Person p) {
		
		System.out.println("Addhar ID : " +p.aadharId);
		System.out.println("First-Name :" +p.firstName);
		System.out.println("Address : " +p.address);
		System.out.println("State :" +state);
		
		
	}


}

/**

javac Person.java (Eclipse) ->>> Person.class
java Person

class loading  -- Bootstrap/Application/Extension
Static fields initialization
inside static block

inside main method

Instance fields initialization
Instance block
Constructor Execution 

Instance fields initialization
Instance block
Constructor Execution

First-Name :Amit
Address : Pune
State :MH

First-Name :John
Address : Mumbai
State :MH


First-Name :John
Address : Mumbai
State :MH



How to debug a code
-- Add togglepoint  -- double click on that line/ right click add toggle
-- Debug as --- java application
--Shortcuts
		F5 -- Step In/Go inside/Dig -- apke method ko 
		F6--Step over/next line/dont show what is happening inside--just go to next stmt
		F7 -- step return -- works only within stack frame
		F8 -- Toggle to Toggle
 * 
 * 
 * 
 * 
 */














