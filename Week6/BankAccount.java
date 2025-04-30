class BankAccount {
	static String bankName="SBI";
	String accountHolderName;
	final int accountNumber;
	
	BankAccount(){
		accountHolderName="Varma";
		accountNumber=4784;
	}
	
	BankAccount(String accountHolderName,int accountNumber){
		this.accountHolderName=accountHolderName;
		this.accountNumber=accountNumber;
	}
		
	
	
	void getTotalAccounts(){
		System.out.println("Bank Name: "+bankName);
		System.out.println("Account Holder Name: "+accountHolderName);
		System.out.println("Account Number: "+accountNumber+"\n");
	}
	public static void main(String[] args){
		BankAccount one = new BankAccount();
		BankAccount two =new BankAccount("Vardhan",244345);
		if (one instanceof BankAccount){
			System.out.println("It is instance of class");
		}
		else{
			System.out.println("Object is not instance of the BankAccount");
		}
		one.getTotalAccounts();
		two.getTotalAccounts();
	}
	
}
