package SDA.settings;

import SDA.init.StartGame;
import SDA.init.MainBoard;

import javax.swing.*;

import static SDA.init.MainBoard.setLocal;
import static SDA.language.SetEnglish.setEnglish;
import static SDA.language.SetGerman.setGerman;
import static SDA.language.SetPolish.setPolish;


public class SetNames {


    public static String message1 = "Player 1 podaj swoje  imie";
    public static String message2 = "Komputer będzie mia na imię BAJTEK: ";
    public static String message3 = "Player 2 podaj swoje  imie";
    static String imie1, imie2;

    public static void setNames() {
        System.out.println("Ustaw imiona");

        if (setLocal.equals("pol"))
            setPolish();
        else if (setLocal.equals("eng"))
            setEnglish();
        else if (setLocal.equals("ger"))
            setGerman();

        imie1 = JOptionPane.showInputDialog(message1);
        MainBoard.lbl1.setText(imie1);
        if (MainBoard.chBox.isSelected()) {
            JOptionPane.showMessageDialog(null, message2);

            imie2 = "BAJTEK";
            System.out.println("Ustawiam imie komputera na :" + imie2);

        } else {
            imie2 = JOptionPane.showInputDialog(message3);
        }
        MainBoard.lbl2.setText(imie2);

        MainBoard.lbl3.setText("Rozpoczyna Gracz o imeniu :" + MainBoard.lbl1.getText());
        MainBoard.lbl4.setText(MainBoard.lbl1.getText());
        StartGame.startGame();
    }
}