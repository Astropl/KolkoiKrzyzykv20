package SDA.language;

import SDA.move.CountRuch;
import SDA.move.MovePerson;
import SDA.init.StartGame;
import SDA.endGame.TheWin;
import SDA.init.MainBoard;
import SDA.settings.SetNames;

public class SetGerman {
    public static void setGerman() {

        MainBoard.settings.setText("Einstellungen");
        MainBoard.file.setText("Datei");
        MainBoard.lbl5.setText(convertToMultiline("Überprüfen Sie, um Computer zu spielen.\n" +
                "            Dekoriert ist ein Spiel von zwei Personen."));

        if (MainBoard.chBox.isSelected() == true) {
            MainBoard.chBox.setText("Person - Computer");
        } else {
            MainBoard.chBox.setText("Person - Person");
        }
        MainBoard.eExit.setText("Ausfahrt");
        MainBoard.eLanguage.setText("Sprache");
        MainBoard.ePolsh.setText("Polnisch");
        MainBoard.eEnglish.setText("English");
        MainBoard.eGerman.setText("Deutsch");
        MainBoard.eChoiceTypeGame.setText("Modusauswahl");
        SetNames.message1 = "Spieler 1 geben Sie Ihren Namen";
        SetNames.message2 = "Der Computer wird BAJTEK heißen: ";
        SetNames.message3 = "Spieler 2 geben Sie Ihren Namen";
        TheWin.message1 = "GEWINNEN SIE EINEN SPIELER ÜBER NAME: ";
        TheWin.message2 = "Hurrah gewann: ";
        CountRuch.message1 = "Leider, aber wir haben ein UNENTSCIEDEN !!! ";
        MovePerson.message1 = "Spielerbewegung mit Namen : ";
        StartGame.message = "Nun, wir fangen an";
//MainBoard.lbl1.setText("imie 1");
        MainBoard.lbl11.setText("Spieler no 1");

        //MainBoard.lbl2.setText("imie 2");
        MainBoard.lbl12.setText("Spieler no 2");
        MainBoard.mOsobaKomp.setText("Person - Comp");
        MainBoard.mOsobaOsoba.setText("Person - Person");
        MainBoard.lbl3.setText("Beginnt einen Spieler namens :" + MainBoard.lbl1.getText());

    }

    public static String convertToMultiline(String orig) {
        return "<html>" + orig.replaceAll("\n", "<br>");
    }

}
