public class MortgageCalculator {

    private double amountOfLoan;
    private double monthlyInterestRate;

    private int totalNumberOfPayments;

    public void setAmountOfLoan(double amountOfLoan) {
        this.amountOfLoan = amountOfLoan;
    }

    public void setMonthlyInterestRate(double monthlyInterestRate) {
        this.monthlyInterestRate = monthlyInterestRate;
    }

    public void setTotalNumberOfPayments(int totalNumberOfPayments) {
        this.totalNumberOfPayments = totalNumberOfPayments;
    }

    public double getAmountOfLoan() {
        return amountOfLoan;
    }

    public double getMonthlyInterestRate() {
        return monthlyInterestRate;
    }

    public int getTotalNumberOfPayments() {
        return totalNumberOfPayments;
    }
}
