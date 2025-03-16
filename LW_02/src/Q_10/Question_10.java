package Q_10;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Question_10 {
    public static void main(String[] args) {
        double loanAmount,annualInterestRate;
        int loanPeriod;
        final int MONTHS_IN_YEAR = 12;
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Loan amount : ");
        loanAmount = Input.nextDouble();

        System.out.print("Enter the Annual interest rate : ");
        annualInterestRate = Input.nextDouble();

        System.out.print("Enter the loan period in years : ");
        loanPeriod = Input.nextInt();

        double monthlyInterestRate = annualInterestRate / 100.0 / MONTHS_IN_YEAR;
        int numberOfPayments = loanPeriod * MONTHS_IN_YEAR;
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1/(1+monthlyInterestRate),numberOfPayments));
        double totalPayment = monthlyPayment * numberOfPayments;

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Monthly Payment : " + df.format(monthlyPayment));
        System.out.println("Total Payment : " + df.format(totalPayment));
        
    }
}
