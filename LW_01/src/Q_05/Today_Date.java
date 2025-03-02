package Q_05;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Today_Date {
    public static void main(String[] args) {
        Date Today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd MMM yyyy");
        System.out.println(sdf.format(Today));
    }
}
