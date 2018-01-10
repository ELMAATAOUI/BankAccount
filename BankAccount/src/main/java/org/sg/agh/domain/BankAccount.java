package org.sg.agh.domain;

/**
 * @author elm
 * 
 */
public class BankAccount {

	// the attributes
	private String accountNumber;
	private String accountName;
	private double balance;

	// the methods

	// the constructor
	public BankAccount(String numberIn, String nameIn, Double balanceIn) {
		accountNumber = numberIn;
		accountName = nameIn;
		balance = balanceIn;
	}

	// methods to read the attributes
	public String getAccountName() {
		return accountName;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public synchronized double getBalance() {
		return balance;
	}

	// methods to deposit and withdraw money
	public synchronized boolean deposit(double amountIn) {
		if ( amountIn < 0) {
			return false;
		} else {
			balance = balance + amountIn;
		
			return true;
		}
	}

	public synchronized boolean withdraw(double amountIn) {
		if (amountIn > balance || amountIn < 0) {
			return false;
		} else {
			balance = balance - amountIn;
			return true;
		}
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((accountName == null) ? 0 : accountName.hashCode());
		result = prime * result
				+ ((accountNumber == null) ? 0 : accountNumber.hashCode());
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BankAccount other = (BankAccount) obj;
		if (accountName == null) {
			if (other.accountName != null)
				return false;
		} else if (!accountName.equals(other.accountName))
			return false;
		if (accountNumber == null) {
			if (other.accountNumber != null)
				return false;
		} else if (!accountNumber.equals(other.accountNumber))
			return false;
		if (Double.doubleToLongBits(balance) != Double
				.doubleToLongBits(other.balance))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + getAccountNumber()
				+ ", accountName=" + getAccountName() + ", balance=" + balance
				+ "]";
	}

}
