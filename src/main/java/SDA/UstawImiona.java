package SDA;

import javax.swing.*;

public class UstawImiona {

    public static void ustawImiona() {
        System.out.println("Ustaw imiona");
        String imie1, imie2;

        imie1 = JOptionPane.showInputDialog("Player 1 podaj swoje  imie");
        PlanszaGlowna.lbl1.setText(imie1);
        if (PlanszaGlowna.chBox.isSelected())
        {
            JOptionPane.showMessageDialog(null, "Komputer będzie mia na imię BAJTEK: ");

            imie2 = "BAJTEK";
            System.out.println("Ustawiam imie komputera na Bajtek");

        }else {
            imie2 = JOptionPane.showInputDialog("Player 2 podaj swoje  imie");
        }
        PlanszaGlowna.lbl2.setText(imie2);
        PlanszaGlowna.lbl3.setText("1Rozpoczyna Gracz o imeniu :" +PlanszaGlowna.lbl1.getText());
        PlanszaGlowna.lbl4.setText(PlanszaGlowna.lbl1.getText());
        StartGame.startGame();
    }
}