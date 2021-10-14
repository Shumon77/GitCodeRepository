package bank;

public class RunBank {
	
	
	public static void main(String[] args){
		
		
		bankaccount John = new bankaccount("675454545");
		
		bankaccount Mike = new bankaccount("705454545");
		
		
		John.address="Virginia";
		
		Mike.address="DC";
		
		System.out.println(John.accountnumber);
		
		System.out.println(Mike.accountnumber);
		
		System.out.println(John.address);
		
		System.out.println(Mike.address);
		
		John.depositeMoney();
		
		Mike.withdrowMoney();
		
		
		//Static functions & properties
		
		bankaccount.emailAddress="missLizy@icloud.com";
		
		bankaccount.getIDNumber();
		
		John.gettotalMoney();
		
		John.gettotalMoney(12);
		
		//Inheritance
		
		Inheritance tom = new Inheritance();
		
		tom.createAccount();
		
		tom.addInformation();
		
		
	
		
				
		
		
		
		
		
	}

}
