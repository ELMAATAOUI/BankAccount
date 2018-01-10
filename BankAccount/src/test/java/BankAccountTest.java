import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.sg.agh.domain.BankAccount;

public class BankAccountTest {

	
	private BankAccount bankAccount;

	@Before
	public void setup() {
		bankAccount = new BankAccount("1234", "Yassine", 0.0);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void canDepositMoney() {

		bankAccount.deposit(10);

		assertEquals(10, bankAccount.getBalance());
	}

	@SuppressWarnings("deprecation")
	@Test
	public void canDepositMoneySequentially() {

		bankAccount.deposit(5);
		bankAccount.deposit(23);

		assertEquals(28, bankAccount.getBalance());
	}

	@SuppressWarnings("deprecation")
	@Test
	public void canWithdrawMoney() {
		bankAccount.deposit(10);

		bankAccount.withdraw(5);

		assertEquals(5, bankAccount.getBalance());
	}
}
