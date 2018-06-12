package SDA;

import static SDA.Checkresult.checkResult;
import static SDA.RuchKompa.ruchKompa;

public class RuchOsoba extends PlanszaGlowna

{

    public static void ruchOsoba() {
        if (ruchOsoba == 0) {
            if (chBox.isSelected() == true) {
                lbl3.setText("Ruch Gracza o imieniu : " + lbl2.getText());
                System.out.println("Selected jest zaznaczony w RuchOsoba");
                ruchOsoba = 2;
                //********************
                // Testuje cos
                ruchKompa();
                ruchOsoba=0;
                lbl4.setText(lbl2.getText());




            } else if (chBox.isSelected() == false) {
                lbl3.setText("Ruch Gracza o imieniu : " + lbl2.getText());
                System.out.println("Selected jest NIE zaznaczony w RuchOsoba");
                ruchOsoba = 1;
            }

            lbl4.setText(lbl1.getText());

        } else if (ruchOsoba == 1) {
            lbl3.setText("Ruch Gracza o imieniu : " + lbl1.getText());
            ruchOsoba = 0;
            lbl4.setText(lbl2.getText());

//        } else if (ruchOsoba == 2) {
//
//            ruchKompa();
//            ruchOsoba = 0;
//            lbl4.setText(lbl2.getText());
//            lbl3.setText("Ruch Gracza o imieniu : " + lbl1.getText());
        }

        checkResult();
    }
}

