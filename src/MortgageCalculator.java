import java.util.Scanner;

public class MortgageCalculator {

    private double amountOfLoan;
    private double monthlyInterestRate;

    private int totalNumberOfPayments;

    private final Scanner scanner;

    public MortgageCalculator() {
        scanner = new Scanner(System.in);
    }

    public void setAmountOfLoan(double amountOfLoan) {
        this.amountOfLoan = amountOfLoan;
    }

    public void setMonthlyInterestRate(double monthlyInterestRate) {
        this.monthlyInterestRate = monthlyInterestRate;
    }

    public void setTotalNumberOfPayments(int totalNumberOfPayments) {
        this.totalNumberOfPayments = totalNumberOfPayments;
    }

    public void enterAmountOfLoan() {

        System.out.println("Please enter the loan amount in dollars: ");
        double amountOfLoan = Input.inputForDouble(this.scanner);
        setAmountOfLoan(amountOfLoan);
    }

    public void enterMonthlyInterestRate() {

        System.out.println("Please enter the annual interest rate as a percentage: ");
        double annualInterestRate = Input.inputForDouble(this.scanner);
        double monthlyInterestRate = annualInterestRate/12/100;
        setMonthlyInterestRate(monthlyInterestRate);
    }

    public void enterTotalNumberOfPayment() {

        System.out.println("Please enter the loan duration in years: ");
        int years = Input.inputForInteger(scanner);
        int numberOfPayments = years * 12;
        setTotalNumberOfPayments(numberOfPayments);
    }


    public double getMonthlyPayment() {

        return  this.amountOfLoan * this.monthlyInterestRate *
                Math.pow(1 + this.monthlyInterestRate , this.totalNumberOfPayments) /
                (Math.pow(1 + this.monthlyInterestRate , this.totalNumberOfPayments) - 1);
    }
}
