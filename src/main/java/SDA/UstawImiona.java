package SDA;

import javax.swing.*;

import static SDA.PlanszaGlowna.setLocal;
import static SDA.SetEnglish.setEnglish;
import static SDA.SetGerman.setGerman;
import static SDA.SetPolish.setPolish;

public class UstawImiona {


    static String imie1, imie2;
    static String message1 = "Player 1 podaj swoje  imie";
    static String message2 = "Komputer będzie mia na imię BAJTEK: ";
    static String message3 = "Player 2 podaj swoje  imie";


    public static void ustawImiona() {
        System.out.println("Ustaw imiona");

        if (setLocal.equals("pol"))
            setPolish();
        else if (setLocal.equals("eng"))
            setEnglish();
        else if (setLocal.equals("ger"))
            setGerman();

        imie1 = JOptionPane.showInputDialog(message1);
        PlanszaGlowna.lbl1.setText(imie1);
        if (PlanszaGlowna.chBox.isSelected()) {
            JOptionPane.showMessageDialog(null, message2);

            imie2 = "BAJTEK";
            System.out.println("Ustawiam imie komputera na :"+imie2);

        } else {
            imie2 = JOptionPane.showInputDialog(message3);
        }
        PlanszaGlowna.lbl2.setText(imie2);
        PlanszaGlowna.lbl3.setText("Rozpoczyna Gracz o imeniu :" + PlanszaGlowna.lbl1.getText());
        PlanszaGlowna.lbl4.setText(PlanszaGlowna.lbl1.getText());
        StartGame.startGame();
    }
}