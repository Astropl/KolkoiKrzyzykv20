package SDA.thread;

import SDA.init.MainBoard;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Time implements Runnable {


//


    public void run() {

        final DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        final DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");//SimpleDateFormat("yyyy/MM/dd HH:mm:ss")


        ActionListener timerListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Date date = new Date();

                //LblDate.setText(dateFormat.format(date));
                MainBoard.lblCzas.setText(timeFormat.format(date) + " " + dateFormat.format(date));
            }
        };
        Timer timer = new Timer(1000, timerListener);

        timer.setInitialDelay(0);
        timer.start();


        System.out.println("Watek z czasem");
        SimpleDateFormat dt = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");


        System.out.println("Local DateTime = " + "czas");
        System.out.println("String moja data = " + "mojaData");
        System.out.println("nadpisana metoda runnable");


        breakFor5Seconds();

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

