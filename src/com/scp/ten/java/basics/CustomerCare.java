package com.scp.ten.java.basics;


public class CustomerCare {

	

	private int id;
	private String name;
	private Custname CustType;
	private String gender;
	
	
	
	public int getId(){
		if(id <10){
		 return 0;	
		 	
		}
		else{
		return id;
		}
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCustType() {

		return CustType;
	}
	
	public void setCustType(String CustType) {
		CustType = CustType;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	public CustomerCare() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public CustomerCare(int id, String name, String CustType, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.CustType = CustType;
		this.gender = gender;
	}
	public String toString() {
		return "CustomerCare [id=" + id + ", name=" + name + ", CustType="
				+ CustType + ", gender=" + gender + "]";
	}
	
	
	
	
	
	
	
	

}

