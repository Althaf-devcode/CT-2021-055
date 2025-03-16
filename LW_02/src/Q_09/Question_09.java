package Q_09;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Question_09 {
    public static void main(String[] args) {
        double P,R;     // P - Invest amount in dollars  R - Interest rate compounded annually
        int N;          // N - Number of years
        double M;       // Amount of money earned after N years
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the invest amount in dollars : ");
        P = Input.nextDouble();
        System.out.print("Enter interest rate compounded annually : ");
        R = Input.nextDouble();
        System.out.print("Enter the number of years : ");
        N = Input.nextInt();
        M = P * Math.pow((1+(R/100)),N);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.print("Amount of money earned after N years : " + df.format(M) + " $");



    }
}
