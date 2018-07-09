package snehal.basic.practice;

public class Customer {

	private int id;
	private String cust_name;
	private int age;
	private String gender;
	private String BankType;
	private double Balance;
	private double intrest;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(int id, String cust_name, int age, String gender,
			String bankType, double balance) {
		super();
		this.id = id;
		this.cust_name = cust_name;
		this.age = age;
		this.gender = gender;
		BankType = bankType;
		Balance = balance;
	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBankType() {
		return BankType;
	}

	public void setBankType(String bankType) {
		BankType = bankType;
	}

	public double getBalance() {
		return Balance;
	}

	public void setBalance(double balance) {
		Balance = balance;
	}

	public double getIntrest() {
		return intrest;
	}

	public void setIntrest(double intrest) {
		this.intrest = intrest;
	}

	public String toString() {
		return "Customer [id=" + id + ", cust_name=" + cust_name + ", age="
				+ age + ", gender=" + gender + ", BankType=" + BankType
				+ ", Balance=" + Balance + ", intrest=" + intrest + "]";
	}
	
	
	
	
	
	
}
