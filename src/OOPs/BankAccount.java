package OOPs;

public class BankAccount {
	

	    private int accountNumber;
	    private String accountHolder;
	    private double balance;

	    BankAccount(int accountNumber, String accountHolder, double balance) {
	        this.accountNumber = accountNumber;
	        this.accountHolder = accountHolder;
	        this.balance = balance;
	    }

	    void deposit(double amount) {
	        balance = balance + amount;
	    }

	    void withdraw(double amount) {
	        if (amount <= balance) {
	            balance = balance - amount;
	        } else {
	            System.out.println("Insufficient Balance");
	        }
	    }

	    void checkBalance() {
	        System.out.println("Current Balance : " + balance);
	    }
	
	public static void main(String[] args) {
		  BankAccount account = new BankAccount(101, "Sahana", 10000);

	        account.checkBalance();

	        account.deposit(5000);
	        account.checkBalance();

	        account.withdraw(3000);
	        account.checkBalance();
		

	}

}
