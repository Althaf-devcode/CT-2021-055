package Q_09;

import java.util.Scanner;

public class String_Input {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String Sentence = Input.nextLine();

        int Length = Sentence.length();
        String first_Character = Sentence.substring(0,1);
        String last_Character = Sentence.substring(Length-1);



        System.out.println(Length);
        System.out.println(first_Character);
        System.out.println(last_Character);
    }
}
