package Q_06;

import javax.swing.*;
import java.util.Scanner;

public class Frame {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Number of pixels for window width : ");
        int W = Input.nextInt();

        System.out.print("Enter the Number of pixels for window height : ");
        int H = Input.nextInt();

        System.out.print("Enter the title for the frame : ");
        String Title = Input.next();

        JFrame MyWindow = new JFrame();
        MyWindow.setSize(W,H);
        MyWindow.setTitle(Title);
        MyWindow.setVisible(true);
    }
}
