package BANK;

public class SavingAccount extends BankAccount {
	private double interestRate;

	public SavingAccount() {
		super();
	}

	public SavingAccount(String accountNum, double balance, double interestRate) {
		super(accountNum, balance);
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public void payInterest() {
		super.setBalance(super.getBalance() * (1 + interestRate));
	}

	public String toString() {
		String info = "";
		info = super.toString();
		info += ", ÀûÂÊ:" + this.interestRate;

		return info;
	}

}
