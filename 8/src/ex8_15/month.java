package ex8_15;

public enum month {
    January(1, 1), February(2, 32), March(3, 60), April(4, 91),
    May(5, 121), June(6, 152), July(7, 182), August(8, 213),
    September(9, 244), October(10, 274), November(11, 305),
    December(12, 335);

    private int monthNumber;
    private int daysAfterNewYear;

    month(int monthNumber, int daysAfterNewYear) {
        this.monthNumber = monthNumber;
        this.daysAfterNewYear = daysAfterNewYear;
    }

    int getMonthNumber() {
        return monthNumber;
    }

    int getDaysAfterNewYear() {
        return daysAfterNewYear;
    }
}