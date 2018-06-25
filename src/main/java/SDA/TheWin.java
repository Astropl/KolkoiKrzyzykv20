package SDA;

import javax.swing.*;

public class TheWin extends PlanszaGlowna

{
    public static void theWin() {
        koniec = true;
        NewThread newThread = new NewThread();
        Thread thread = new Thread(newThread);
        JOptionPane.showMessageDialog(null, "Hura wygrał: " + lbl4.getText() + " :)");
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        lbl3.setText("WYGRANA  GRACZA O IMIENIU: " + lbl4.getText());
        System.out.println("Wyłaczam drugi wątek");
        koniec = true;
                thread.stop();


    }
}