package SDA;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;

public class Time extends PlanszaGlowna implements Runnable {
    LocalDateTime czas = LocalDateTime.now();
    String mojaData = String.valueOf(czas);
    private long time1;
    private Timer timer1;


    public Time(LocalDateTime czas, String mojaData, long time1, Timer timer1) {
        this.czas = czas;
        this.mojaData = mojaData;
        this.time1 = time1;
        this.timer1 = timer1;

    }

    public Time() {

    }

    public void run() {
        //czas = LocalDateTime.parse((new String(String.valueOf(czas))));
        System.out.println("Watek z czasem");
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");


        System.out.println("Local DateTime = " + czas);
        System.out.println("String moja data = " + mojaData);
        System.out.println("nadpisana metoda runnable");



        //lblCzas.setText(String.valueOf(czas));


        breakFor5Seconds();
//run();
    }

    public void breakFor5Seconds() {
        System.out.println("Przerwa kilka sekund");
//        for (int i = 0; i >= 5; i++) {
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

