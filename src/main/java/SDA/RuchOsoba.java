package SDA;

import static SDA.Checkresult.checkResult;
import static SDA.RuchKompa.ruchKompa;

public class RuchOsoba extends PlanszaGlowna

{

    public static void ruchOsoba() {
        if (ruchOsoba == 0) {
            if (chBox.isSelected() == true) {
                lbl4.setText(lbl1.getText());
                lbl3.setText("c1Ruch Gracza o imieniu : " + lbl4.getText());//todo:
                System.out.println("Selected jest zaznaczony w RuchOsoba");
                ruchOsoba = 2;
                //********************
                // Testuje cos
                ruchKompa();
                ruchOsoba=0;





            } else if (chBox.isSelected() == false) {
                lbl4.setText(lbl2.getText());
                lbl3.setText("c2Ruch Gracza o imieniu : " + lbl4.getText());// TODO:
                System.out.println("Selected jest NIE zaznaczony w RuchOsoba");
                ruchOsoba = 1;
            }

            //lbl4.setText(lbl1.getText());

        } else if (ruchOsoba == 1) {
            //lbl3.setText("Ruch Gracza o imieniu : " + lbl1.getText());//todo:

            ruchOsoba = 0;
            lbl4.setText(lbl1.getText());

//        } else if (ruchOsoba == 2) {
//
//            ruchKompa();
//            ruchOsoba = 0;
//            lbl4.setText(lbl2.getText());
           lbl3.setText("c3Ruch Gracza o imieniu : " + lbl4.getText());
        }

        checkResult();
    }
}

