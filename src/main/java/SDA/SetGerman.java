package SDA;

import javax.swing.*;

public class SetGerman {
    public static void setGerman ()
    {

        PlanszaGlowna.settings.setText("Einstellungen");
        PlanszaGlowna.file.setText("Datei");
        PlanszaGlowna.lbl5.setText(convertToMultiline("Überprüfen Sie, um Computer zu spielen.\n" +
                "            Dekoriert ist ein Spiel von zwei Personen."));

        if (PlanszaGlowna.chBox.isSelected() ==true)
        {
            PlanszaGlowna.chBox.setText("Person - Computer");
        }else {
            PlanszaGlowna.chBox.setText("Person - Person");
        }
        PlanszaGlowna.eExit.setText("Ausfahrt");
        PlanszaGlowna.eLanguage.setText("Sprache");
        PlanszaGlowna.ePolsh.setText("Polnisch");
        PlanszaGlowna.eEnglish.setText("English");
        PlanszaGlowna.eGerman.setText("Deutsch");



    }
    public static String convertToMultiline(String orig) {
        return "<html>" + orig.replaceAll("\n", "<br>");
    }

}
