package runPack;

import Accessmodifire.protectedmodifire;
import bankPackage.BankAccount;

public class runBank {

	public static void main(String[] args) {
		
		
		BankAccount john = new BankAccount("768768");
		
		BankAccount micke = new BankAccount("7678687");
		
		BankAccount tom = new BankAccount();
		
		BankAccount tom1= new BankAccount(34);
		
		
		System.out.println(john.AccountNumber);
		
		//Setup a value for john here.
		
		//john. I am not getting any properties here.So, I have to make the properties public.
		
		
		john.Address="Virginia";
		
		micke.Address="DC";
		
		
		System.out.println(john.Address);
		
		
		//Class is design or prototype.When we create a object, object will copy all the
	   // properties and functionality of the class.
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
