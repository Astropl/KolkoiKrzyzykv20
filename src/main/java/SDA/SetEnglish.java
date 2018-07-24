package SDA;

public class SetEnglish {
    public static void setEnglish() {
        PlanszaGlowna.settings.setText("Settings");
        PlanszaGlowna.file.setText("File");
        PlanszaGlowna.lbl5.setText(convertToMultiline("Check to play with computer.\n" +
                "Is unchecked is a game of two people."));
        if (PlanszaGlowna.chBox.isSelected() == true) {
            PlanszaGlowna.chBox.setText("Person - Computer");
        } else {
            PlanszaGlowna.chBox.setText("Person - Person");
        }
        PlanszaGlowna.eExit.setText("Exit");
        PlanszaGlowna.eLanguage.setText("language");
        PlanszaGlowna.ePolsh.setText("Polish");
        PlanszaGlowna.eEnglish.setText("English");
        PlanszaGlowna.eGerman.setText("German");
        PlanszaGlowna.eChoiceTypeGame.setText("Mode selection");
        UstawImiona.message1 = "Player 1 give your name";
        UstawImiona.message2 = "The computer will be called BAJTEK: ";
        UstawImiona.message3 = "Player 2 give your name";
        TheWin.message1="WIN A PLAYER ABOUT NAME: ";
        TheWin.message2="Hurray won: ";
        CountRuch.message1="Unfortunately, but we have a DRAW !!! ";
        RuchOsoba.message1="Player's movement by name : ";
        StartGame.message = "Now we'll begin\n";
        //PlanszaGlowna.lbl1.setText("imie 1");
        PlanszaGlowna.lbl11.setText("Player no 1");

        //PlanszaGlowna.lbl2.setText("imie 2");
        PlanszaGlowna.lbl12.setText("Player no 2");

        PlanszaGlowna.mOsobaKomp.setText("Person - Comp");
        PlanszaGlowna.mOsobaOsoba.setText("Person - Person");
        PlanszaGlowna.lbl3.setText("Begins a player named :" + PlanszaGlowna.lbl1.getText());


    }

    public static String convertToMultiline(String orig) {
        return "<html>" + orig.replaceAll("\n", "<br>");
    }


}
