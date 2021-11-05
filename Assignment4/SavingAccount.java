package Assignment4;

public class SavingAccount extends BankAccount {
	private double interestRate;
	public SavingAccount(
			String name, 
			int accountNumber, 
			int balance,
			double interestRate
			) {
		super(name, accountNumber, balance);
		this.setInterestRate(interestRate);
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public void MonthEnd(double averageDailyBalance) {
		double bal = this.getBalance();
		for(int i = 1; i < 30; i++) {
			this.setBalance(bal + this.getBalance());
		}
		averageDailyBalance = (this.getBalance()/30);
		double interest = (this.getInterestRate()/100);
		double amount = (averageDailyBalance * interest);
		this.setBalance(averageDailyBalance + amount);
	}
	public String toString() {
		String s = super.toString();
		return s + ", Interest Rate: " + interestRate + " ||";
	}

}
