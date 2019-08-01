public class ex8_06_SavingsAccount_Run{
    public static void main(String[] args) {
        ex8_06_SavingsAccount saver1 = new ex8_06_SavingsAccount(2000f);
        ex8_06_SavingsAccount saver2 = new ex8_06_SavingsAccount(3000f);

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