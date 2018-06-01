package SDA;

import javax.swing.*;

public class UstawImiona {

    public static void ustawImiona() {
        String imie1, imie2;

        imie1 = JOptionPane.showInputDialog("Player 1 podaj swoje  imie");
        PlanszaGlowna.lbl1.setText(imie1);
        if (PlanszaGlowna.chBox.isSelected())
        {
            JOptionPane.showMessageDialog(null, "Komputer będzie mia na imię BAJTEK: ");
            //String imie2 = JOptionPane.showDialog("Player 2 podaj swoje  imie");
            imie2 = "BAJTEK";
            System.out.println("Ustawiam imie komputera na Bajtek");
            //PlanszaGlowna.ruchOsoba =0;
        }else {
            imie2 = JOptionPane.showInputDialog("Player 2 podaj swoje  imie");
        }
        PlanszaGlowna.lbl2.setText(imie2);
        StartGame.startGame();
    }
}