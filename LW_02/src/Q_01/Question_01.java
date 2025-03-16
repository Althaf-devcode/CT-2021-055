package Q_01;
import java.text.DecimalFormat;

public class Question_01 {
    public static void main(String[] args) {
        int A = 2 , B = 4 , C = 6;
        int X = 3 , Y = 5;
        double a,b,c,d;         // for answers
        System.out.println("A=" + A + " B=" + B + " C=" + C + " X=" + X + " Y=" + Y);
        DecimalFormat df = new DecimalFormat("0.00");

        a = Math.sqrt((Math.pow(B,2)) + (4*A*C));
        System.out.println("The square root of B^2 + 4AC : " + df.format(a));

        b = Math.sqrt(X + (4 *  Math.pow(Y,3)));
        System.out.println("The square root of X + 4Y^3 : " + df.format(b));

        double product = X*Y;
        c = Math.cbrt(product);
        System.out.println("The cube root of the product of X and Y :" + df.format(c));

        final double PI = 3.14;
        double Radius = 7;

        d = PI*Radius*Radius;
        System.out.println("Area of the circle : " + df.format(d));
    }
}
