package Q_07;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Today_Time {
    public static void main(String[] args) {

        Date Today = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss a");
        // System.out.println(sdf.format(Today));

        String Time = sdf.format(Today);

        JFrame MyWindow = new JFrame();
        MyWindow.setSize(350,300);
        MyWindow.setTitle(Time);
        MyWindow.setVisible(true);
    }
}
