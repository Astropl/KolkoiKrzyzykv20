package SDA;

import java.awt.*;

public class KonstruktorTekstów {

    public static void konstruktorTekstow() {
        PlanszaGlowna.btn1.setText("");
        PlanszaGlowna.btn2.setText("");
        PlanszaGlowna.btn3.setText("");
        PlanszaGlowna.btn4.setText("");
        PlanszaGlowna.btn5.setText("");
        PlanszaGlowna.btn6.setText("");
        PlanszaGlowna.btn7.setText("");
        PlanszaGlowna.btn8.setText("");
        PlanszaGlowna.btn9.setText("");
        PlanszaGlowna.btnGraj.setText("START");

        PlanszaGlowna.lbl1.setText("imie 1");
        PlanszaGlowna.lbl11.setText("GRACZ nr 1");
        PlanszaGlowna.lbl1.setFont(new Font("Arial", Font.BOLD, 15));
        PlanszaGlowna.lbl2.setText("imie 2");
        PlanszaGlowna.lbl12.setText("GRACZ nr 2");
        PlanszaGlowna.lbl1.setFont(new Font("Arial", Font.BOLD, 15));
        PlanszaGlowna.lbl3.setFont(new Font("Tahoma", Font.BOLD, 20));
        PlanszaGlowna.lbl4.setText("Current Name");
        PlanszaGlowna.btnReset.setText("RESET");

    }

}