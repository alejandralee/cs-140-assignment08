package assignment08;

import java.util.ArrayList;

public class ClosestToAverage extends Reporter {

	public ClosestToAverage(ArrayList<BankAccount> accounts) {
		super(accounts);
	}
	
	public BankAccount report(){
		ArrayList<BankAccount> accounts = getAccounts();
		double sumOfAccounts = 0.0;
		int numOfAccounts = 0;
		double smallestDifference = 999999999;
		BankAccount closestAccount = null;
		
		if (accounts != null && accounts.size() > 0){
			for (BankAccount b : accounts){
				if(b!=null){
					sumOfAccounts += b.getBalance();
					numOfAccounts++;
				}
			}
		
		
		double average = sumOfAccounts/numOfAccounts;
		for(BankAccount b : accounts){
			if(b != null){
				if (Math.abs(b.getBalance() - average) < smallestDifference){
					closestAccount = b;
					smallestDifference = Math.abs(b.getBalance() - average);
				}
			}
		}		
		return closestAccount;
	}
		else{
			return null;
		}
	}

}
