package SDA;

import java.io.IOException;

import static SDA.CountRuch.countRuch;
import static SDA.PlanszaGlowna.lbl3;
import static SDA.PlanszaGlowna.lbl4;
import static SDA.RuchOsoba.ruchOsoba;

public class NewThread implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("nowy watek");
            countRuch();
            ruchOsoba();
            //interrupt();

        }catch (Exception e)
        {
            e.printStackTrace();
        }finally {
            System.out.println("poszło dalej");
        }
    }



//    private static void interrupt() {
//        Thread.currentThread().stop();
//    }
}
