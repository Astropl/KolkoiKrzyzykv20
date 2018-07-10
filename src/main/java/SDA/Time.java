package SDA;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class Time implements Runnable {
    LocalDateTime czas = LocalDateTime.now();
    String mojaData = String.valueOf(czas);
    private long time1;
    private Timer timer1;

    public Time() {
        this.czas = czas;
    }


    public void run() {
        //czas = LocalDateTime.parse((new String(String.valueOf(czas))));
        System.out.println("Watek z czasem");
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        //Date date = dt.parse(mojaData);

//*sprawdzam w konsoli

        System.out.println("Local DateTime = " + czas);
        System.out.println("String moja data = " + mojaData);


        System.out.println("nadpisana metoda runnable");
        PlanszaGlowna.lblCzas.setText("" + mojaData);


        //PlanszaGlowna.lblCzas.setText(mojaData);
        //System.out.println(dt.format(czas));


        //PlanszaGlowna.lblCzas.setText(String.valueOf(czas));
        //lblCzas.setText(String.valueOf(czas));


        breakFor5Seconds();
//run();
    }

    public void breakFor5Seconds() {
        System.out.println("Przerwa kilka sekund");
//        for (int i = 1; i >= 0; i--) {
//            //for (;;)
//            {
//                //System.out.println(i);
//
//                System.out.println(LocalDateTime.now());
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                }
//
//            }
//        }
    }
}

