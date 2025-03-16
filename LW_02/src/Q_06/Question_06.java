package Q_06;

import java.util.Scanner;
import java.time.Year;

public class Question_06 {
    public static void main(String[] args) {
        int birthYear,Age;

        Scanner Input = new Scanner(System.in);
        System.out.print("What is your birth year? : ");
        birthYear = Input.nextInt();

        int currentYear = Year.now().getValue();
        //System.out.println("Current Year: " + currentYear);

        Age = currentYear - birthYear;
        System.out.println("You were born in "+birthYear+" and will be (are) "+ Age + " this year.");

    }
}
