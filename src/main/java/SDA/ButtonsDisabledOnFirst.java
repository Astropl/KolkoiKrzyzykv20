package SDA;

public class ButtonsDisabledOnFirst {

    public static boolean buttonsDisabledOnFirst(boolean bol) {
        PlanszaGlowna.btn1.setEnabled(bol);
        PlanszaGlowna.btn2.setEnabled(bol);
        PlanszaGlowna.btn3.setEnabled(bol);
        PlanszaGlowna.btn4.setEnabled(bol);
        PlanszaGlowna.btn5.setEnabled(bol);
        PlanszaGlowna.btn6.setEnabled(bol);
        PlanszaGlowna.btn7.setEnabled(bol);
        PlanszaGlowna.btn8.setEnabled(bol);
        PlanszaGlowna.btn9.setEnabled(bol);
        return bol;
    }
}
