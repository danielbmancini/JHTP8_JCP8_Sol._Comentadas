package ex8_06;

public class SavingsAccount {
    private static float annualInterestRate;
    private float savingsBalance;

    public SavingsAccount(float balance) {
        savingsBalance = balance;
    }

    public void modifyInterestRate(float change) //interest rate should be in percentage form (w/o the '%' symbol)
    {
        annualInterestRate = change;
    }

   public void calculateMonthlyInterest(int month1_To, int month2)
   {
        for (int i = month1_To + 1; i <= month2; i++) {
            float monthlyInterestRate = annualInterestRate/(1200f);
            savingsBalance += savingsBalance*monthlyInterestRate;
            System.out.printf("New balance in month %d: %f%n ", i, savingsBalance);
        }
        System.out.println("\n\n");
    }

}