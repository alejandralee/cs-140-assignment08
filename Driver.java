package assignment08;

public class Driver {

	public static void main(String[] args){
		BankAccountGroup group = new BankAccountGroup();
		SavingsAccount sAccount1 = new SavingsAccount(1.5, 1);
		SavingsAccount sAccount2 = new SavingsAccount(2.5, 2);
		SavingsAccount sAccount3 = new SavingsAccount(3.5, 3);
		SavingsAccount sAccount4 = new SavingsAccount(1, 4);
		SavingsAccount sAccount5 = new SavingsAccount(2, 5);
		
		sAccount1.deposit(100);
		sAccount2.deposit(500);
		sAccount3.deposit(800);
		sAccount4.deposit(300);
		sAccount5.deposit(1000);
		
		CheckingAccount cAccount1 = new CheckingAccount(100, 6);
		CheckingAccount cAccount2 = new CheckingAccount(300, 7);
		CheckingAccount cAccount3 = new CheckingAccount(500, 8);
		CheckingAccount cAccount4 = new CheckingAccount(700, 9);
		CheckingAccount cAccount5 = new CheckingAccount(900, 10);
		
		group.addAccount(sAccount1);
		group.addAccount(sAccount2);
		group.addAccount(sAccount3);
		group.addAccount(sAccount4);
		group.addAccount(sAccount5);
		group.addAccount(cAccount1);
		group.addAccount(cAccount2);
		group.addAccount(cAccount3);
		group.addAccount(cAccount4);
		group.addAccount(cAccount5);
		group.addAccount(null);
		
		group.doReport();
		System.out.println(group);
		group.doUpdate();
		System.out.println(group);
		
	}
	

}
