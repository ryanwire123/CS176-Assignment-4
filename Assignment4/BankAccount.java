package Assignment4;

public class BankAccount {
	private String name;
	private int accountNumber;
	private double balance;
	public BankAccount(String name, int accountNumber, double balance){
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(int amount){
	      this.balance = balance + amount;
	}
	 public void withdraw(int amount){
         	this.balance = balance - amount;
	 }
	 public String toString() {
			return "Name: " + name + ", Account Number: " + accountNumber + ", Balance: " + balance;
	 }

}
