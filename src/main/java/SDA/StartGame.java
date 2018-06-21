package SDA;

import javax.swing.*;

public class StartGame extends PlanszaGlowna
{
    public static void startGame ()
    {
        JOptionPane.showMessageDialog(null, "No to zaczynamy");

        //for (int kolejnyRuch = 1; kolejnyRuch <= 9; kolejnyRuch++) {
            if (ruchOsoba == 0) {
                //lbl3.setText("Rozpoczyna Gracz o imieniu : " + lbl4.getText()); //TODO
                //ruchOsoba = 1;// Todo: zmieniłem odkomentowałem ruchOsoba=1

            } else if (ruchOsoba == 1) {
                //lbl3.setText("Rozpoczyna Gracz o imieniu : " + lbl4.getText());//TODO
                //ruchOsoba = 0;// Todo: zmieniłem odkomentowałem ruchOsoba=2
            }
        btnReset.setEnabled(true);
        }

    }


