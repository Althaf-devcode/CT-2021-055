package Q_10;

import java.util.Scanner;

public class Odd_String {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the string with number of odd characters : ");
        String Sentence = Input.nextLine();

        int Length = Sentence.length();

        int Index_of_Middle = (Length/2)+1;
        System.out.println(Sentence.substring(Length/2,Index_of_Middle));
    }
}
