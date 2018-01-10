package demo;

import org.sg.agh.domain.BankAccount;

/**
 * @author elm
 * 
 */
public class demo {

	// Simulation Simple de BankAccount

	public static void main(String[] args) {

		BankAccount account = new BankAccount("1234", "pierre-jean", 100.0);

		System.out.println(account.toString());

		account.withdraw(1000.0);

		System.out.println(account.toString());

		account.deposit(5.0);

		System.out.println(account.toString());

	}

}
