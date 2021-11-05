package Assignment4;

public class CheckingAccount extends BankAccount {

	public CheckingAccount(String name, int accountNumber, int balance) {
		super(name, accountNumber, balance);
	}
	public String toString() {
			String s = super.toString();
			return s + " ||";
	}		
	public void MonthEnd(double averageDailyBalance) {
		double bal = this.getBalance();
		for(int i = 1; i < 30; i++) {
			this.setBalance(bal + this.getBalance());
		}
		averageDailyBalance = this.getBalance()/30;
		System.out.println(averageDailyBalance);
		if(averageDailyBalance > 1500 ) {
			this.setBalance(averageDailyBalance - 20);
		}
	}
}
