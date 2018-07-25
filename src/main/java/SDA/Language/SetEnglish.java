package SDA.Language;

import SDA.*;
import SDA.init.MainBoard;

public class SetEnglish {
    public static void setEnglish() {
        MainBoard.settings.setText("Settings");
        MainBoard.file.setText("File");
        MainBoard.lbl5.setText(convertToMultiline("Check to play with computer.\n" +
                "Is unchecked is a game of two people."));
        if (MainBoard.chBox.isSelected() == true) {
            MainBoard.chBox.setText("Person - Computer");
        } else {
            MainBoard.chBox.setText("Person - Person");
        }
        MainBoard.eExit.setText("Exit");
        MainBoard.eLanguage.setText("language");
        MainBoard.ePolsh.setText("Polish");
        MainBoard.eEnglish.setText("English");
        MainBoard.eGerman.setText("German");
        MainBoard.eChoiceTypeGame.setText("Mode selection");
        UstawImiona.message1 = "Player 1 give your name";
        UstawImiona.message2 = "The computer will be called BAJTEK: ";
        UstawImiona.message3 = "Player 2 give your name";
        TheWin.message1="WIN A PLAYER ABOUT NAME: ";
        TheWin.message2="Hurray won: ";
        CountRuch.message1="Unfortunately, but we have a DRAW !!! ";
        RuchOsoba.message1="Player's movement by name : ";
        StartGame.message = "Now we'll begin\n";
        //MainBoard.lbl1.setText("imie 1");
        MainBoard.lbl11.setText("Player no 1");

        //MainBoard.lbl2.setText("imie 2");
        MainBoard.lbl12.setText("Player no 2");

        MainBoard.mOsobaKomp.setText("Person - Comp");
        MainBoard.mOsobaOsoba.setText("Person - Person");
        MainBoard.lbl3.setText("Begins a player named :" + MainBoard.lbl1.getText());


    }

    public static String convertToMultiline(String orig) {
        return "<html>" + orig.replaceAll("\n", "<br>");
    }


}
