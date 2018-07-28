package SDA.move;

import SDA.init.MainBoard;

import javax.swing.*;

public class CountRuch extends MainBoard {
    public static String message1 = "Niestety ale mamy REMIS !!! ";

    public static void countRuch() {

        if (!koniec) {
            System.out.println("Count ruch");

            countRuch++;
            System.out.println("ruch numer " + countRuch);
            if ((countRuch == 9)&&(koniec==true)) {
                System.out.println("Koniec bo ruch 9");
                MainBoard.lbl3.setText(message1);
                JOptionPane.showMessageDialog(null, message1);
                koniec = true;

            }

        }
    }
}