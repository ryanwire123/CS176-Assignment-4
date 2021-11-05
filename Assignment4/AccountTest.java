package Assignment4;

public class AccountTest {

	public static void main(String[] args) {
		BankAccount a1 = new BankAccount("Nina Masters", 0001, 1000);
		CheckingAccount a2 = new CheckingAccount("John Smith", 0002, 500);
		SavingAccount a3 = new SavingAccount("Amy Smith", 0003, 15000, 3.5);
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		a2.deposit(10000);
		a2.MonthEnd(a2.getBalance());		
		a3.withdraw(5000);
		a3.MonthEnd(a3.getBalance());
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
	}
}
