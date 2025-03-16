package Q_03;

import java.util.Scanner;

public class Question_03 {
    public static void main(String[] args) {
        double Celsius,Fahrenheit;
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius : ");
        Celsius = Input.nextDouble();

        Fahrenheit = (1.8 * Celsius) + 32;

        System.out.println("Fahrenheit Value is : " + Fahrenheit);
    }
}
