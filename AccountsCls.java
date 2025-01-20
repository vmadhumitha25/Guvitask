package java_task6;

public class AccountsCls {

	private String AccountHolderName;
	private int AccountNumber;
	private double balance;
	
	//No Argument
	public AccountsCls() {
		this.AccountHolderName ="Madhu Mitha";
		this.AccountNumber = 0;
		this.balance = 0;
	}
	
	//Two Argument
	public AccountsCls(String AccountHolderName, int AccountNumber) {
		this.AccountHolderName = AccountHolderName;
		this.AccountNumber = AccountNumber;
		this.balance = balance;
	}
	
	//Method to deposit amount
	public void deposit(double amount) {
		if(amount >0) {
			balance =+amount;
			System.out.println("Deposited : " +amount);
		}
		else {
			System.out.println("Invalid amount deposited");
		}
	}
	//Method to Withdraw amount
		public void withdraw(double amount) {
			if(amount >0 && amount<=balance) {
				balance =- amount;
				System.out.println("Wihdrawn Amount : " +amount);
			}
			else {
				System.out.println("Invalid withdrawal of amount");
			}
		}
	
	//Check Balance
		public void checkBalance() {
			System.out.println("Current Balance: " +balance);
		}
	
	//Getter and Setter methods for attributes
		public String getAccountHolderName() {
			return AccountHolderName;
		}
		public void setAccountHolderName() {
			this.AccountHolderName = AccountHolderName;
		}
		
		public int getAccountNumber() {
			return AccountNumber;
		}
		public void setAccountNumber(int AccountNumber) {
			this.AccountNumber = AccountNumber;
		}
		
		public double getbalance() {
			return balance;
		}
		public void setbalance(double balance) {
			this.balance = balance;
		}
}

/*
 * 
 */
