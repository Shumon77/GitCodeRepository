package testJavaFunction;

public class conditions {

	public static void main(String[] args) {
		
		double creditscore = 750;
		
		double interestrate =0;
		double carprice = 12000;
		double dounpayment = 2000;
		double month = 60;
		
		double tax = 6;
		double priceafterdown;
		double financeprice;
		double monthlypayment;
		
		
		int x = 25;
		
		//if conditional statement
		
		if(x>10) {
			
			//Whatever we write here will be executed
			
			
			}
		
		
		if(creditscore>730) {
			
			interestrate = 1.5;
			
			
		}
		
		
		if(creditscore<=700) {
			
			interestrate = 2;
			
		}
		
		
		priceafterdown = carprice-dounpayment;
		
		financeprice = priceafterdown+priceafterdown*(interestrate/100);
		
		monthlypayment = financeprice/month;
		
		System.out.println(monthlypayment);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
