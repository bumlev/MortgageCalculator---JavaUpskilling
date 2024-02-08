import java.util.Scanner;

public class Execution {

    public static void main(String[] args) {

        MortgageCalculator mortgageCalculator = new MortgageCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome in Mortgage Calculator");
        System.out.println("Please enter the loan amount in dollars: ");

        double amountOfLoan = InputException.inputExceptionForDouble(scanner);
        mortgageCalculator.setAmountOfLoan(amountOfLoan);

        System.out.println("Please enter the annual interest rate as a percentage: ");
        double annualInterestRate = InputException.inputExceptionForDouble(scanner);
        double monthlyInterestRate = annualInterestRate/12/100;
        mortgageCalculator.setMonthlyInterestRate(monthlyInterestRate);


        System.out.println("Please enter the loan duration in years: ");
        int years = InputException.inputExceptionForInteger(scanner);
        int numberOfPayments = years * 12;
        mortgageCalculator.setTotalNumberOfPayments(numberOfPayments);

        double monthlyPayment  = mortgageCalculator.getMonthlyPayment();

        System.out.println("The monthly payment is " + monthlyPayment);
    }
}


