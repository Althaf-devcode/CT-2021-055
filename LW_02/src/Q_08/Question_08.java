package Q_08;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Question_08 {
    public static void main(String[] args) {
        double R,V;   // R - Radius  V - Volume
        final double PI = 3.14;

        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the Radius : ");
        R = Input.nextDouble();

        V = (4/3.0) * (PI * Math.pow(R,3));
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Volume of a sphere is : " + df.format(V));





    }
}
