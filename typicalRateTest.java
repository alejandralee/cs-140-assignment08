package assignment08;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class typicalRateTest {

	@Test
	public void test() {
		SavingsAccount sAccount1 = new SavingsAccount(10.0, 10);
		SavingsAccount sAccount2 = new SavingsAccount(11.0, 15);
		SavingsAccount sAccount3 = new SavingsAccount(12.0, 20);
		SavingsAccount sAccount4 = new SavingsAccount(13.0, 25);
		SavingsAccount sAccount5 = new SavingsAccount(14.0, 30);
		
		ArrayList<BankAccount> array = new ArrayList<BankAccount>();
		
		array.add(sAccount1);
		array.add(sAccount2);
		array.add(sAccount3);
		array.add(sAccount4);
		array.add(sAccount5);
		
		typicalRate tr = new typicalRate(array);
		SavingsAccount account = tr.report();
		assertEquals(sAccount3.getId(), account.getId(), .01);
	}

}
