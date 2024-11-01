import java.util.Scanner;

public class SavingGoalCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		// Get user input for saving goal, initial balance, monthly deposit and interest
		// rate

		System.out.println("Enter Saving Goal");
		double savingsGoal = scanner.nextDouble();

		System.out.println("Enter Initial Balance");
		double initialBalance = scanner.nextDouble();

		System.out.println("Enter Monthly Deposit");
		double monthlyDeposit = scanner.nextDouble();

		System.out.println("Enter Interest Rate");
		double annualInterestRate = scanner.nextDouble();

		//Convert annualInterest Rate to monthlyInterestRate
		double monthlyInterestRate = annualInterestRate / 12 /100;
		
		int months =  calculateMonthsToReachSavingGoal(savingsGoal, initialBalance, monthlyDeposit,monthlyInterestRate );

		//check number of months to validate whether the savingGoal is reaslistic or not
		if(months > (80*12)) {
			System.out.println("The SavingGoal isn't realistic");
		}else {
			System.out.println("It Takes  " +  months + " to reach to the savingGoal");
		}
	}
																
	public static int calculateMonthsToReachSavingGoal(double savingGoal, double initialBalance,
			double monthlyDeposit, double monthlyInterestRate) {

		int month = 0;
		double currentBalance = initialBalance;
		
		while(currentBalance < savingGoal) {
			
			month++;
			
			double interest = currentBalance * monthlyInterestRate;
			
			currentBalance = currentBalance + interest + monthlyDeposit;
			
			//Output the current balance after each month
			System.out.printf("Month %d: Current Saving Balance - %.2f \n", month, currentBalance);
		}
		
		return month;
	}

}
