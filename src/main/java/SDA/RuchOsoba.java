package SDA;

import static SDA.Checkresult.checkResult;
import static SDA.RuchKompa.ruchKompa;

public class RuchOsoba extends PlanszaGlowna

{

    public static void ruchOsoba() {
        if (!koniec) {
            System.out.println("Ruch Osoba");
            if (ruchOsoba == 0) {
                if (chBox.isSelected() == true) {

                    System.out.println("Selected jest zaznaczony w RuchOsoba");
                    ruchOsoba = 2;
                    checkResult();
                    ruchKompa();
                    ruchOsoba = 0;
                } else if (chBox.isSelected() == false) {
                    System.out.println("Selected jest NIE zaznaczony w RuchOsoba");
                    ruchOsoba = 1;

                    checkResult();
                    lbl4.setText(lbl2.getText());
                }
            } else if (ruchOsoba == 1) {


                ruchOsoba = 0;

                checkResult();
                lbl4.setText(lbl1.getText());
            }
            if (!koniec) {
                //lbl4.setText(lbl1.getText());
                lbl3.setText("C3Ruch Gracza o imieniu : " + lbl4.getText());
            }
        }
    }
}

