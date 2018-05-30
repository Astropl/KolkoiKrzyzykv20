package SDA;

import javax.swing.*;

public class UstawImiona {

    public static void ustawImiona() {
        String imie1 = JOptionPane.showInputDialog("Player 1 podaj swoje  imie");
        PlanszaGlowna.lbl1.setText(imie1);
        String imie2 = JOptionPane.showInputDialog("Player 2 podaj swoje  imie");
        PlanszaGlowna.lbl2.setText(imie2);
        StartGame.startGame();
    }
}