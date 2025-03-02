package Q_04;

import java.util.Date;
import java.text.SimpleDateFormat;


public class Today_Date {
    public static void main(String[] args) {
        Date Today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
        System.out.println(sdf.format(Today));
    }
}
