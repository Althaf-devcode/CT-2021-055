package Q_02;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Question_02 {
    public static void main(String[] args) {
        double cm,totalInches,in;
        int ft;
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the value in centimeters : ");
        cm = Input.nextDouble();

        totalInches = cm / 2.54;
        ft = (int) totalInches / 12;
        in = totalInches - (ft * 12);

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(cm + " Centimeters = " + ft + " feets and " + df.format(in) + " inches");

    }
}
