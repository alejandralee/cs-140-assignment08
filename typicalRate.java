package assignment08;

import java.util.ArrayList;

public class typicalRate extends Reporter {

	public typicalRate(ArrayList<BankAccount> accounts) {
		super(accounts);
	}
	public SavingsAccount report(){
		ArrayList<BankAccount> accounts = getAccounts();
		double sumOfInterestRates = 0.0;
		int numOfInterestRates = 0;
		double smallestDifference = 999999999;
		SavingsAccount closestAccount = null;
		
		if (accounts != null && accounts.size() > 0){
				for (BankAccount b : accounts){
					if(b!=null && b instanceof SavingsAccount){
						sumOfInterestRates += ((SavingsAccount)b).getInterestRate();
						numOfInterestRates++;
					}
				}
		
		
				double average = sumOfInterestRates/numOfInterestRates;
				
				System.out.println(average);
				
				for(BankAccount b : accounts){
					if(b != null && b instanceof SavingsAccount){
						if (Math.abs(((SavingsAccount)b).getInterestRate() - average) < smallestDifference){
							closestAccount = (SavingsAccount)b;
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
