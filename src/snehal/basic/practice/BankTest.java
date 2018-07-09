package snehal.basic.practice;

public class BankTest {

	
	public static void main(String[] args) {
		
		
		Customer item[] = new Customer[3];
		
		item[0]= new SBIbank(1,"cust1",22,"F","SBI",5000);
      	item[1]=new ICCIbank(2,"cust2",23,"M","ICCI",6000);
      	item[3]=new HDFCbank(3,"cust3",24,"F","HDFC",9000);
      	
		SBIbank sb=new SBIbank();
		ICCIbank ic = new ICCIbank();
		HDFCbank hd =new HDFCbank();
		
		
		for(int i=0;i<item.length;i++){
			if(item[i].getBankType()=="SBI" ){
				System.out.println("SBI bank intrest"+sb.CalculateIntrest(item[i].getBalance()));
				
				
			}
			
		}
		
		
	}
	
}
