package SDA;

import SDA.init.MainBoard;

public class ButtonsDisabledOnFirst {

    public static boolean buttonsDisabledOnFirst(boolean bol) {
        MainBoard.btn1.setEnabled(bol);
        MainBoard.btn2.setEnabled(bol);
        MainBoard.btn3.setEnabled(bol);
        MainBoard.btn4.setEnabled(bol);
        MainBoard.btn5.setEnabled(bol);
        MainBoard.btn6.setEnabled(bol);
        MainBoard.btn7.setEnabled(bol);
        MainBoard.btn8.setEnabled(bol);
        MainBoard.btn9.setEnabled(bol);
        return bol;
    }
}
