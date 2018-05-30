package SDA;

import javax.swing.*;

public class StartGame extends PlanszaGlowna
{
    public static void startGame ()
    {
        JOptionPane.showMessageDialog(null, "No to zaczynamy");

        for (int kolejnyRuch = 1; kolejnyRuch <= 9; kolejnyRuch++) {
            if (ruchOsoba == 0) {
                lbl3.setText("Ruch Gracza o imieniu : " + lbl1.getText());
                //ruchOsoba = 1;

            } else if (ruchOsoba == 1) {
                lbl3.setText("Ruch Gracza o imieniu : " + lbl2.getText());
                //ruchOsoba = 0;
            }
        }
    }
}
