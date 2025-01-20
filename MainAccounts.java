package java_task6;

public class MainAccounts extends AccountsCls{
	public static void main(String[] args) {
		
		AccountsCls account1 = new AccountsCls();
		System.out.println("Account 1 :");
		account1.checkBalance();
		
		AccountsCls account2 = new AccountsCls("Madhu Mitha", 2548792	);
		System.out.println("Account 2 :");
		account2.checkBalance();
		
		account2.deposit(1000);
		account2.withdraw(500);
		account2.checkBalance();
		
		//Try to withdraw invalid amount
		account2.withdraw(3000);
	}
}

/*
Output:
Account 1 :
Current Balance: 0.0
Account 2 :
Current Balance: 0.0
Deposited : 1000.0
Wihdrawn Amount : 500.0
Current Balance: 500.0
Invalid withdrawal of amount
*/