package Q_08;

import java.util.Scanner;

public class Divide_String {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the sentence with exclamation mark: ");
        String Sentence = Input.nextLine();

        int Exclamation_Index = Sentence.indexOf('!');
        String First_String = Sentence.substring(0,Exclamation_Index).trim();
        String Second_String = Sentence.substring(Exclamation_Index+1).trim();

        System.out.println(First_String);
        System.out.println(Second_String);

    }
}
