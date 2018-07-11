package com.scp.ten.java.basics;

import java.util.Arrays;


class ArtelCust extends CustomerCare{
	

	
	long PhoneNo;

	public ArtelCust() {
		super();
		}

	
	public ArtelCust(int id, String name, String CustType, String gender,long PhoneNo) {
		super(id, name, CustType, gender);
		this.PhoneNo=PhoneNo;
		}
	
	
}


class IdeaCust extends CustomerCare{
	long PhoneNo;

	public IdeaCust() {
		super();
	}

	public IdeaCust(int id, String name, String CustType, String gender,long PhoneNo) {
		super(id, name, CustType, gender);
		this.PhoneNo=PhoneNo;
	}	
	
}




public class TestCustomer {
	
public static void main(String[] args) {
	
	CustomerCare arr[] = new CustomerCare[3];
	arr[0]=new ArtelCust(11,"sonu","artel","female",1234567888);
	arr[1]=new ArtelCust(21,"snehal","artel","female",976674798);
	arr[2]=new IdeaCust(5,"vidya","idea","female",45678999);
	
	System.out.println("before sort...."+Arrays.toString(arr));
	//Arrays.sort(arr);
	//System.out.println("after sort...."+Arrays.toString(arr));
	
	  for( int i =0; i<arr.length;i++){
		  CustomerCare c = arr[i];
		  /*
		    if(c instanceof ArtelCust){
		    	ArtelCust artel =(ArtelCust) c;	 
		    	System.out.println("artel customer..."+artel);
		    	
		    }else if(c instanceof  IdeaCust){
		    	IdeaCust idea = (IdeaCust) c;
		    	System.out.println("idea customer..."+idea);

		    }else{
		    	System.out.println("its a parent object");
		    }
		    	
		  */
		  
		  
		  
	  }

	


	
	
	
	
	
}

	
}
