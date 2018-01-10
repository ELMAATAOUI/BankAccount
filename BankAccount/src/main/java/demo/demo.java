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

		if (account.withdraw(-10.0))
			System.out.println(account.toString());
		else {
			System.out
					.println("Vous n'avez pas le droit de procerder à cette opération ...!");
			System.out.println(account.toString());

		}

		
		
		/*
		 
		account.deposit(5.0);

		System.out.println(account.toString());
		
		 */
	}

}
