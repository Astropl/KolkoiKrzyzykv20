package SDA;

import javax.swing.*;

public class CountRuch extends PlanszaGlowna {
    static String message1 = "Niestety ale mamy REMIS !!! ";

    public static void countRuch() {

        if (!koniec) {
            System.out.println("Coubt ruch");
//            NewThread newThread = new NewThread();
//            Thread thread = new Thread(newThread);
            countRuch++;
            System.out.println("ruch numer " + countRuch);
            if (countRuch == 9) {
                System.out.println("Koniec bo ruch 9");
                JOptionPane.showMessageDialog(null, message1);
//                thread.stop();
            }

        }
    }
}