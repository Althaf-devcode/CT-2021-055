package Q_11;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the First Name : ");
        String First_Name = Input.next();

        System.out.print("Enter the Middle Name : ");
        String Middle_Name = Input.next();

        System.out.print("Enter the Last Name : ");
        String Last_Name = Input.next();

        String Middle_Initial = Middle_Name.substring(0,1);

        System.out.println(Last_Name + ", " + First_Name + " " + Middle_Initial + ".");

    }
}
