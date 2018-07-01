package SDA;

import java.time.LocalDateTime;

public class Time implements Runnable {
    LocalDateTime czas = LocalDateTime.now();

    public void run() {

        System.out.println("Watek z czasem");


        System.out.println(czas);

        breakFor5Seconds();
run();
    }

    public void breakFor5Seconds() {
        System.out.println("Przerwa kilka sekund");
        for (int i = 1; i >= 0; i--) {
            //for (;;)
            {
                //System.out.println(i);

                System.out.println(LocalDateTime.now());
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }

            }
        }
    }}

