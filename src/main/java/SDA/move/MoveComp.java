package SDA.move;

import SDA.init.MainBoard;

import javax.swing.*;
import java.util.Random;

import static SDA.endGame.Checkresult.checkResult;

public class MoveComp extends MainBoard {



    public static int randomInt;

    public static void moveComp() {
        if (!koniec) {
            countRuch++;
            lbl4.setText(lbl2.getText());
            lbl3.setText("Ruch Kompa o imieniu :" + lbl4.getText());
            System.out.println("**************");
            System.out.println("Ruch Kompa");

            if (koniec) {
                System.out.println("Koniec na True");

            } else {
                System.out.println("Ruch Kompa teraz");
                randomMoveComp();
                checkResult();
                lbl4.setText(lbl1.getText());
            }
        }
    }

    public static void randomMoveComp() {
        breakFor5Seconds();
        Random rn = new Random();
        randomInt = 0;
        randomInt = rn.nextInt(9) + 1;
        System.out.println("Wylosoał komp numer " + randomInt);
        sprawdzCzyJuzByZaznaczony();
    }

    public static void breakFor5Seconds() {
        System.out.println("Przerwa kilka sekund");
//        for (int i = 2; i >= 0;  i-- )
//        {
//            System.out.println(i);
//            try
//            {
//                Thread.sleep(500);
//            }
//            catch(InterruptedException e)
//            {
//            }
//        }
    }

    public static void btnFalse() {
        System.out.println("ikona pelna. Losuj jeszcze raz");
        randomMoveComp();
    }

    public static void btnTrue() {
        System.out.println("Ikona pusta Gra dalej");


    }

    public static void sprawdzCzyJuzByZaznaczony() {
        switch (randomInt) {
            case 1:

                if (btn1.isEnabled() == false) {
                    btnFalse();
                } else if (btn1.isEnabled() == true) {
                    btnTrue();
                    btn1.setIcon(new ImageIcon(MainBoard.class.getResource(
                            "../Resources/o.jpg"
                    )));
                    znacznikBtn1 = "o";
                    btn1.setEnabled(false);
                }

                break;
            case 2:
                if (btn2.isEnabled() == false) {
                    btnFalse();
                } else if (btn2.isEnabled() == true) {
                    btnTrue();
                    btn2.setIcon(new ImageIcon(MainBoard.class.getResource(
                            "../Resources/o.jpg"
                    )));
                    znacznikBtn2 = "o";
                    btn2.setEnabled(false);
                }

                break;
            case 3:
                if (btn3.isEnabled() == false) {
                    btnFalse();
                } else if (btn3.isEnabled() == true) {
                    btnTrue();
                    btn3.setIcon(new ImageIcon(MainBoard.class.getResource(
                            "../Resources/o.jpg"
                    )));
                    znacznikBtn3 = "o";
                    btn3.setEnabled(false);
                }

                break;

            case 4:
                if (btn4.isEnabled() == false) {
                    btnFalse();
                } else if (btn4.isEnabled() == true) {
                    btnTrue();
                    btn4.setIcon(new ImageIcon(MainBoard.class.getResource(
                            "../Resources/o.jpg"
                    )));
                    znacznikBtn4 = "o";
                    btn4.setEnabled(false);
                }

                break;

            case 5:
                if (btn5.isEnabled() == false) {
                    btnFalse();
                } else if (btn5.isEnabled() == true) {
                    btnTrue();
                    btn5.setIcon(new ImageIcon(MainBoard.class.getResource(
                            "../Resources/o.jpg"
                    )));
                    znacznikBtn5 = "o";
                    btn5.setEnabled(false);
                }

                break;

            case 6:
                if (btn6.isEnabled() == false) {
                    btnFalse();
                } else if (btn6.isEnabled() == true) {
                    btnTrue();
                    btn6.setIcon(new ImageIcon(MainBoard.class.getResource(
                            "../Resources/o.jpg"
                    )));
                    znacznikBtn6 = "o";
                    btn6.setEnabled(false);
                }

                break;

            case 7:
                if (btn7.isEnabled() == false) {
                    btnFalse();
                } else if (btn7.isEnabled() == true) {
                    btnTrue();
                    btn7.setIcon(new ImageIcon(MainBoard.class.getResource(
                            "../Resources/o.jpg"
                    )));
                    znacznikBtn7 = "o";
                    btn7.setEnabled(false);
                }

                break;

            case 8:
                if (btn8.isEnabled() == false) {
                    btnFalse();
                } else if (btn8.isEnabled() == true) {
                    btnTrue();
                    btn8.setIcon(new ImageIcon(MainBoard.class.getResource(
                            "../Resources/o.jpg"
                    )));
                    znacznikBtn8 = "o";
                    btn8.setEnabled(false);
                }

                break;

            case 9:
                if (btn9.isEnabled() == false) {
                    btnFalse();
                } else if (btn9.isEnabled() == true) {
                    btnTrue();
                    btn9.setIcon(new ImageIcon(MainBoard.class.getResource(
                            "../Resources/o.jpg"
                    )));
                    znacznikBtn9 = "o";
                    btn9.setEnabled(false);
                }

                break;


        }

    }

}
