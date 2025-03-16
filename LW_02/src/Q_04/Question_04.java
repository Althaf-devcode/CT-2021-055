package Q_04;

import java.util.Scanner;

public class Question_04 {
    public static void main(String[] args) {
        int bodyWeight,calories;
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the body weight in pounds : ");
        bodyWeight = Input.nextInt();

        calories = bodyWeight * 19;

        System.out.println("You need " + calories + " calories in one day" );

    }
}
