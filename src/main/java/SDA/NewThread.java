package SDA;

import static SDA.CountRuch.countRuch;
import static SDA.PlanszaGlowna.lbl3;
import static SDA.PlanszaGlowna.lbl4;
import static SDA.RuchOsoba.ruchOsoba;

public class NewThread implements Runnable {

    @Override
    public void run() {
        lbl3.setText("2Rucha Gracza o imienieu :"+ lbl4.getText());
        System.out.println("nowy watek");

        countRuch();

        ruchOsoba();
    }
}
