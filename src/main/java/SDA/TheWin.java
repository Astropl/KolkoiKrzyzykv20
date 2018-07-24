package SDA;

import javax.swing.*;

public class TheWin extends PlanszaGlowna

{
    static String message1 = "WYGRANA  GRACZA O IMIENIU: ";
    static String message2 = "Hura wygrał: ";

    public static void theWin() {

        koniec = true;

//        NewThread newThread = new NewThread();
//        Thread thread = new Thread(newThread);
        JOptionPane.showMessageDialog(null, message2 + lbl4.getText() + " :)");
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
        lbl3.setText(message1 + lbl4.getText());
        System.out.println("Wyłaczam drugi wątek");
        koniec = true;
        //thread.stop();


    }
}