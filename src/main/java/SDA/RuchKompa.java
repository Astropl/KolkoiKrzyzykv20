package SDA;

import javax.swing.*;
import java.util.Random;

public class RuchKompa extends PlanszaGlowna {


    public static int losuj;

    public static void ruchKompa() {
        System.out.println("Ruch Kompa teraz");
        losujRuchKompa();
    }

    public static void losujRuchKompa() {
        Random rn = new Random();
        losuj = rn.nextInt(9) + 1;
        System.out.println("Wylosoał komp numer " + losuj);
        sprawdzCzyJuzByZaznaczony();
    }

    public static void sprawdzCzyJuzByZaznaczony() {
        switch (losuj) {
            case 1:
                //btn1.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
//                        "Resources/x.jpg"
                if (btn1.isEnabled()==false )
                {
                    System.out.println("ikona pelna. Losuj jeszcze raz");
                    losujRuchKompa();
                }else if ( btn1.isEnabled()==true)
                {
                    System.out.println("Ikona pusta Gra dalej");

                    btn1.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                            "Resources/o.jpg"
                    )));
                    znacznikBtn1 = "o";
                    btn1.setEnabled(false);
                }

                break;
            case 2:
                if (btn2.isEnabled()==false )
                {
                    System.out.println("ikona pelna. Losuj jeszcze raz");
                    losujRuchKompa();
                }else if ( btn2.isEnabled()==true)
                {
                    System.out.println("Ikona pusta Gra dalej");
                    btn2.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                            "Resources/o.jpg"
                    )));
                    znacznikBtn2 = "o";
                    btn2.setEnabled(false);
                }

                break;
            case 3:
                if (btn3.isEnabled()==false )
                {
                    System.out.println("ikona pelna. Losuj jeszcze raz");
                    losujRuchKompa();
                }else if ( btn3.isEnabled()==true)
                {
                    System.out.println("Ikona pusta Gra dalej");
                    btn3.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                            "Resources/o.jpg"
                    )));
                    znacznikBtn3 = "o";
                    btn3.setEnabled(false);

                }

                break;

            case 4:
                if (btn4.isEnabled()==false )
                {
                    System.out.println("ikona pelna. Losuj jeszcze raz");
                    losujRuchKompa();
                }else if ( btn4.isEnabled()==true)
                {
                    System.out.println("Ikona pusta Gra dalej");
                    btn4.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                            "Resources/o.jpg"
                    )));
                    znacznikBtn4 = "o";
                    btn4.setEnabled(false);
                }

                break;

            case 5:
                if (btn5.isEnabled()==false )
                {
                    System.out.println("ikona pelna. Losuj jeszcze raz");
                    losujRuchKompa();
                }else if ( btn5.isEnabled()==true)
                {
                    System.out.println("Ikona pusta Gra dalej");
                    btn5.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                            "Resources/o.jpg"
                    )));
                    znacznikBtn5 = "o";
                    btn5.setEnabled(false);
                }

                break;

            case 6:
                if (btn6.isEnabled()==false )
                {
                    System.out.println("ikona pelna. Losuj jeszcze raz");
                    losujRuchKompa();
                }else if ( btn6.isEnabled()==true)
                {
                    System.out.println("Ikona pusta Gra dalej");
                    btn6.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                            "Resources/o.jpg"
                    )));
                    znacznikBtn6 = "o";
                    btn6.setEnabled(false);
                }

                break;

            case 7:
                if (btn7.isEnabled()==false )
                {
                    System.out.println("ikona pelna. Losuj jeszcze raz");
                    losujRuchKompa();
                }else if ( btn7.isEnabled()==true)
                {
                    System.out.println("Ikona pusta Gra dalej");
                    btn7.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                            "Resources/o.jpg"
                    )));
                    znacznikBtn7 = "o";
                    btn7.setEnabled(false);
                }

                break;

            case 8:
                if (btn8.isEnabled()==false )
                {
                    System.out.println("ikona pelna. Losuj jeszcze raz");
                    losujRuchKompa();
                }else if ( btn8.isEnabled()==true)
                {
                    System.out.println("Ikona pusta Gra dalej");
                    btn8.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                            "Resources/o.jpg"
                    )));
                    znacznikBtn8 = "o";
                    btn8.setEnabled(false);
                }

                break;

            case 9:
                if (btn9.isEnabled()==false )
                {
                    System.out.println("ikona pelna. Losuj jeszcze raz");
                    losujRuchKompa();
                }else if ( btn9.isEnabled()==true)
                {
                    System.out.println("Ikona pusta Gra dalej");
                    btn9.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                            "Resources/o.jpg"
                    )));
                    znacznikBtn9 = "o";
                    btn9.setEnabled(false);
                }

                break;




        }
    }

}
//btn1.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
//                        "Resources/x.jpg"