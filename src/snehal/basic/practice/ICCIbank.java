package snehal.basic.practice;

public class ICCIbank extends Customer implements Bank {

	
	
	public ICCIbank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ICCIbank(int id, String cust_name, int age, String gender,
			String bankType, double balance) {
		super(id, cust_name, age, gender, bankType, balance);
		// TODO Auto-generated constructor stub
	}

	public double CalculateIntrest(double ammount) {
		return ammount*0.06;
	}

}
