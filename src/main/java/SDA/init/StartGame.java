package SDA.init;

import SDA.init.MainBoard;

import javax.swing.*;

import static SDA.language.SetEnglish.setEnglish;
import static SDA.language.SetGerman.setGerman;
import static SDA.language.SetPolish.setPolish;

public class StartGame extends MainBoard {
    public static String message = "No to zaczynamy";

    public static void startGame() {
        if (setLocal.equals("pol"))
            setPolish();
        else if (setLocal.equals("eng"))
            setEnglish();
        else if (setLocal.equals("ger"))
            setGerman();
        JOptionPane.showMessageDialog(null, message);


        if (ruchOsoba == 0) {


        } else if (ruchOsoba == 1) {

        }
        btnReset.setEnabled(true);
    }

}


