package SDA;

import SDA.init.MainBoard;

import java.awt.*;


public class KonstruktorTekstów {

    public static void konstruktorTekstow() {

        MainBoard.btn1.setText("");
        MainBoard.btn2.setText("");
        MainBoard.btn3.setText("");
        MainBoard.btn4.setText("");
        MainBoard.btn5.setText("");
        MainBoard.btn6.setText("");
        MainBoard.btn7.setText("");
        MainBoard.btn8.setText("");
        MainBoard.btn9.setText("");
        MainBoard.btnGraj.setText("START");

        MainBoard.lbl1.setText("imie 1");
        MainBoard.lbl11.setText("GRACZ nr 1");

        MainBoard.lbl2.setText("imie 2");
        MainBoard.lbl12.setText("GRACZ nr 2");

        MainBoard.lbl1.setFont(new Font("Arial", Font.BOLD, 15));
        MainBoard.lbl2.setFont(new Font("Arial", Font.BOLD, 15));
        MainBoard.lbl3.setFont(new Font("Arial", Font.BOLD, 20));

        MainBoard.lbl4.setText("Current Name");
        MainBoard.btnReset.setText("RESET");
        MainBoard.chBox.setText("Osoba - Osoba");
        MainBoard.lbl5.setText(convertToMultiline("Zaznacz żeby grac z komputerem. \nOdznaczone to gra dwóch osób."));
        MainBoard.lblCzas.setText("1900:01:01 12:04");
        MainBoard.lblCzas.setFont(new Font("Arial",Font.BOLD,20));
    }

    public static String convertToMultiline(String orig) {
        return "<html>" + orig.replaceAll("\n", "<br>");
    }

}