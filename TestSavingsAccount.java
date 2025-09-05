class SavingsAccount{
	static double annualInterestRate;
	private double savingsBalance;
	
	
	public SavingsAccount(double savingsBalance) {
		this.savingsBalance = savingsBalance;
	}
	
	public void calculateMonthlyInterest(String saverName) {
		double monthlyInterest;
		monthlyInterest = savingsBalance * (annualInterestRate / 12);
		savingsBalance += monthlyInterest;
		System.out.println(saverName + " -> Monthly Interest: " + String.format("%.2f", monthlyInterest));
        System.out.println(saverName + " -> Updated Balance: " + String.format("%.2f", savingsBalance));
        System.out.println("-------------------------------------------------");
	}
	
	public static void modifyInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
		System.out.println("Annual Interest Rate set to " + (newAnnualInterestRate * 100) + "%\n");
	}
	
}
public class TestSavingsAccount {
	
	
	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount(2000.00);
		SavingsAccount saver2 = new SavingsAccount(3000.00);
		
		SavingsAccount.modifyInterestRate(0.04);
		saver1.calculateMonthlyInterest("Saver1");
		saver2.calculateMonthlyInterest("Saver2");
		
		SavingsAccount.modifyInterestRate(0.05);
		saver1.calculateMonthlyInterest("Saver1");
		saver2.calculateMonthlyInterest("Saver2");
		

	}

}
