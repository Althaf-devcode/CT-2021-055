package Q_02;

import javax.swing.*;
import java.util.Scanner;

public class NameWindow {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the First_Name : ");
        String First_Name = Input.nextLine();
        System.out.print("Enter the Last_Name : ");
        String Last_Name = Input.nextLine();

        JFrame My_Window = new JFrame();
        My_Window.setSize(500,200);
        My_Window.setTitle(First_Name + " " + Last_Name);
        My_Window.setVisible(true);
    }
}
