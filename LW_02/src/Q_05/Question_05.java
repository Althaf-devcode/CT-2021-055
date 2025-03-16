package Q_05;

import java.util.Scanner;

public class Question_05 {
    public static void main(String[] args) {
        double Celsius,Fahrenheit;
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the temperature in Fahrenheit : ");
        Fahrenheit = Input.nextDouble();

        Celsius = (5.0/9) * (Fahrenheit - 32);

        System.out.println("Celsius Value is : " + Celsius);
    }
}
