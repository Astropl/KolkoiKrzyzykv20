package SDA;

public class SetGerman {
    public static void setGerman() {

        PlanszaGlowna.settings.setText("Einstellungen");
        PlanszaGlowna.file.setText("Datei");
        PlanszaGlowna.lbl5.setText(convertToMultiline("Überprüfen Sie, um Computer zu spielen.\n" +
                "            Dekoriert ist ein Spiel von zwei Personen."));

        if (PlanszaGlowna.chBox.isSelected() == true) {
            PlanszaGlowna.chBox.setText("Person - Computer");
        } else {
            PlanszaGlowna.chBox.setText("Person - Person");
        }
        PlanszaGlowna.eExit.setText("Ausfahrt");
        PlanszaGlowna.eLanguage.setText("Sprache");
        PlanszaGlowna.ePolsh.setText("Polnisch");
        PlanszaGlowna.eEnglish.setText("English");
        PlanszaGlowna.eGerman.setText("Deutsch");
        PlanszaGlowna.eChoiceTypeGame.setText("Modusauswahl");
        UstawImiona.message1 = "Spieler 1 geben Sie Ihren Namen";
        UstawImiona.message2 = "Der Computer wird BAJTEK heißen: ";
        UstawImiona.message3 = "Spieler 2 geben Sie Ihren Namen";
        TheWin.message1="GEWINNEN SIE EINEN SPIELER ÜBER NAME: ";
        TheWin.message2="Hurrah gewann: ";
        CountRuch.message1="Leider, aber wir haben ein UNENTSCIEDEN !!! ";
        RuchOsoba.message1="Spielerbewegung mit Namen : ";
        StartGame.message = "Nun, wir fangen an";
//PlanszaGlowna.lbl1.setText("imie 1");
        PlanszaGlowna.lbl11.setText("Spieler no 1");

        //PlanszaGlowna.lbl2.setText("imie 2");
        PlanszaGlowna.lbl12.setText("Spieler no 2");
        PlanszaGlowna.mOsobaKomp.setText("Person - Comp");
        PlanszaGlowna.mOsobaOsoba.setText("Person - Person");
        PlanszaGlowna.lbl3.setText("Beginnt einen Spieler namens :" + PlanszaGlowna.lbl1.getText());

    }

    public static String convertToMultiline(String orig) {
        return "<html>" + orig.replaceAll("\n", "<br>");
    }

}
