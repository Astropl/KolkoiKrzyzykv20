package SDA;

import static SDA.CountRuch.countRuch;
import static SDA.RuchOsoba.ruchOsoba;

public class NewThread implements Runnable {

    @Override
    public void run() {
        System.out.println("nowy watek");
        countRuch();

        ruchOsoba();
    }
}
