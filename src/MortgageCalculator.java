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


    public double getMonthlyPayment() {
        return  this.amountOfLoan * this.monthlyInterestRate *
                Math.pow(1 + this.monthlyInterestRate , this.totalNumberOfPayments) /
                (Math.pow(1 + this.monthlyInterestRate , this.totalNumberOfPayments) - 1);
    }
}
