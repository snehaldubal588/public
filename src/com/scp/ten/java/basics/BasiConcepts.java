package com.scp.ten.java.basics;

public class BasiConcepts {       //class is nothing but collection of a methods and variables.
	
	static int i;
	int j;
	
	static
	{   
	//purpose:- class creation prerequisites	
	System.out.println(" In Static Block");
	
	}
	
	
	{
    //purpose:- object creation prerequisites
    System.out.println("In Instance Block");
    System.out.println("value of i="+i);
    System.out.println("value of j="+j);
	}
	
	

	public BasiConcepts() 
	{
		
		// purpose of Constructor:  initializing a instance fields
		 System.out.println("In Constructor");
	}

    
	public void m1(){
		//purpose:- hold the object level logic for every object.
		System.out.println("In Instance Method..");
	}

	
	public static void m2(){
		//purpose:- hold the class level logic for every object.
		
		System.out.println("in Static Method..");
	}
	


	public static void main(String[] args) { //main is starting point of program execution.
		
	System.out.println("In Main Method...");
	BasiConcepts obj = new BasiConcepts(); 
	obj.m1();
	obj.m2();
		
	/*when we create a object that obj is nothing but REFERENCE VARIABLE/Identifier  of class(BasiConcepts) type.
	 * 
	 * Object - is instance of a class
	 *  or Product of class structure.
	 *  or snapshot of class.
	 *  or user defined data type.
	 * 
	 */
	
	/*Following is execution sequence of java program:-
	 * 1)Static fields initialization.
	 * 2)static Block execution
	 * 3)main method execution
	 * 4)object Creation statement(classname obj = new classname() )
	 * 5)instance fields initialization
	 * 6)instance Block execution
	 * 7)Constructor executed
	 * 8)whatever we call executed according to that sequences
	 * 	
	 */
	
	
	}

}
