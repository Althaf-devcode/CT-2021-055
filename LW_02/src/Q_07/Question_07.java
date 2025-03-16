package Q_07;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Question_07 {
    public static void main(String[] args) {
        double W,H,BMI;
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter your weight in Kg : ");
        W = Input.nextDouble();
        System.out.print("Enter your height in cm : ");
        H = Input.nextDouble();

        BMI = W / Math.pow((H/100),2);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("BMI : " + df.format(BMI));

    }
}
