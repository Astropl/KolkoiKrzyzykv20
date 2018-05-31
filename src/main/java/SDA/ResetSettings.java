package SDA;

import javax.swing.*;

public class ResetSettings extends PlanszaGlowna {
    public static void resetSettings() {
        System.out.println("Resetuje butony");
        btnReset.setEnabled(false);
        KonstruktorTekstów.konstruktorTekstow();
        ButtonsDisabledOnFirst.buttonsDisabledOnFirst(false);
        btnGraj.setEnabled(true);
        lbl1.setVisible(false);
        lbl2.setVisible(false);
        lbl11.setVisible(false);
        lbl12.setVisible(false);
        lbl3.setVisible(false);
        btn1.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                "")));
        btn2.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                "")));
        btn3.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                "")));
        btn4.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                "")));
        btn5.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                "")));
        btn6.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                "")));
        btn7.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                "")));
        btn8.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                "")));
        btn9.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                "")));


    }

}
