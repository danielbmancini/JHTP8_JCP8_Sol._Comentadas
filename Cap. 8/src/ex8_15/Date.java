package ex8_15;

class Date {
    private int year;
    private int day;
    private month aMonth;

    Date(month aaMonth, int day, int year) {
        this.aMonth = aaMonth;
        this.day = day;
        this.year = year;
    }

    String toString_a() {
        if (day < 10 && aMonth.getMonthNumber() > 9)
            return String.format("%d/%02d/%d", aMonth.getMonthNumber(), day, year);
        if (day > 9 && aMonth.getMonthNumber() < 10)
            return String.format("%02d/%d/%d", aMonth.getMonthNumber(), day, year);
        if (day < 10)
            return String.format("%02d/%02d/%d", aMonth.getMonthNumber(), day, year);

        return null;
    }

    String toString_b() {
        if (day < 10)
            return String.format("%s %02d, %d", aMonth, day, year);
        else
            return String.format("%s %d, %d", aMonth, day, year);
    }

    String toString_c() {
        int daysAfterNewYear = aMonth.getDaysAfterNewYear() + day - 1;
        if (daysAfterNewYear < 100)
            return String.format("%03d %d", daysAfterNewYear, year);
        else
            return String.format("%d %d", daysAfterNewYear, year);
    }

}