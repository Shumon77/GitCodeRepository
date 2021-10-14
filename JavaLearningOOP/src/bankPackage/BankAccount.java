package bankPackage;

public class BankAccount {
	
	
	public String firstName;
	public String lastName;
	public String AccountNumber;
	public int totalMoney;
	public String Address;
	
	
	//To create a account number you must have to setup a account number thats why I am creating
	// a constructor
	
	public BankAccount(String AccountNumber) {
		
		this.AccountNumber=AccountNumber;
		
			
	}
	
	public BankAccount() {
		
		System.out.println("No input constructor");
		
	}
	
	public BankAccount(int x) {
		
		System.out.println("Integer input constructor");
	}
	
	
	
	public void depositMoney() {
		
		System.out.println("depositMoney");
		
		
	}
	
	
	public void withdrowMoney() {
		
		System.out.println("withdrowMoney");
		
		
	}
	
	// These functionality will copied to the object when object is created.
	
	
	public void gettotalmoney() {
		
		System.out.println("gettotalMoney");
		
		
		
	}
	
	public void overDraft() {
		
	System.out.println("overDraft");	
		
		
		
	}

}
