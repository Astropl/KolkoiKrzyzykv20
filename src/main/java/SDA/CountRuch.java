package SDA;

import javax.swing.*;

public class CountRuch extends PlanszaGlowna {


    public static void countRuch() {

        System.out.println("ruch numer" + countRuch);
        if (countRuch == 9) {
            System.out.println("Koniec bo ruch 9");
            JOptionPane.showMessageDialog(null, "Niestety ale mamy REMIS !!! ");
        }
        countRuch++;
    }
}