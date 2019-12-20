import ex8_06.SavingsAccount;

/*
    Exercise 8.6 main class
 */
public class SavingsAccount_Run {
    public static void main(String[] args) {
        SavingsAccount saver1 = new SavingsAccount(2000f);
        SavingsAccount saver2 = new SavingsAccount(3000f);

        saver1.modifyInterestRate(4f);
        saver2.modifyInterestRate(4f);

        saver1.calculateMonthlyInterest(1, 12);
        saver2.calculateMonthlyInterest(1, 12);

        saver1.modifyInterestRate(5f);
        saver2.modifyInterestRate(5f);

        saver1.calculateMonthlyInterest(1, 2);
        saver2.calculateMonthlyInterest(1, 2);
    }
}