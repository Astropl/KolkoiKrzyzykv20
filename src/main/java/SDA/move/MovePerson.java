package SDA.move;

import SDA.init.MainBoard;

import static SDA.endGame.Checkresult.checkResult;
import static SDA.move.MoveComp.moveComp;


public class MovePerson extends MainBoard


{

    public static String message1 = "Ruch Gracza o imieniu : ";


    public static void movePerson() {
        if (!koniec) {
            System.out.println("Ruch Osoba");
            if (ruchOsoba == 0) {
                if (chBox.isSelected() == true) {

                    System.out.println("Selected jest zaznaczony w RuchOsoba");
                    ruchOsoba = 2;
                    checkResult();
                    moveComp();
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
                lbl3.setText(message1 + lbl4.getText());
            }
        }
    }
}

