package SDA.settings;

import SDA.init.MainBoard;

import javax.swing.*;

public class ResetSettings extends MainBoard {
    public static void resetSettings() {
//        NewThread newThread = new NewThread();
//        Thread thread = new Thread(newThread);
//        thread.stop();
        System.out.println("Resetuje butony");
        setLocal = "pol";
        setLocalMetoda(setLocal);
        ePolsh.setSelected(true);
        btnReset.setEnabled(false);
        ConstructorsTextOnButtons.constructorsTextOnButtons();
        ButtonsDisabledOnFirst.buttonsDisabledOnFirst(false);
        btnGraj.setEnabled(true);
        lbl1.setVisible(false);
        lbl2.setVisible(false);
        lbl11.setVisible(false);
        lbl12.setVisible(false);
        lbl3.setVisible(false);
        btn1.setIcon(new ImageIcon(MainBoard.class.getResource(
                "")));
        btn2.setIcon(new ImageIcon(MainBoard.class.getResource(
                "")));
        btn3.setIcon(new ImageIcon(MainBoard.class.getResource(
                "")));
        btn4.setIcon(new ImageIcon(MainBoard.class.getResource(
                "")));
        btn5.setIcon(new ImageIcon(MainBoard.class.getResource(
                "")));
        btn6.setIcon(new ImageIcon(MainBoard.class.getResource(
                "")));
        btn7.setIcon(new ImageIcon(MainBoard.class.getResource(
                "")));
        btn8.setIcon(new ImageIcon(MainBoard.class.getResource(
                "")));
        btn9.setIcon(new ImageIcon(MainBoard.class.getResource(
                "")));
        znacznikBtn1 = "1";
        znacznikBtn2 = "2";
        znacznikBtn3 = "3";
        znacznikBtn4 = "4";
        znacznikBtn5 = "5";
        znacznikBtn6 = "6";
        znacznikBtn7 = "7";
        znacznikBtn8 = "8";
        znacznikBtn9 = "9";
        ruchOsoba = 0;
        chBox.setSelected(false);
        chBox.setVisible(true);
        lbl5.setVisible(true);
        countRuch = 0;
        koniec = false;

    }

}
