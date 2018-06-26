package SDA;

import javax.swing.*;



public class SetEnglish
{
    public static void setEnglish()
    {



        PlanszaGlowna.settings.setText("Settings");
        PlanszaGlowna.file.setText("File");
        PlanszaGlowna.lbl5.setText(convertToMultiline("Check to play with computer.\n" +
                "Is unchecked is a game of two people."));
        if (PlanszaGlowna.chBox.isSelected() ==true)
        {
            PlanszaGlowna.chBox.setText("Person - Computer");
        }else {
            PlanszaGlowna.chBox.setText("Person - Person");
        }
    }
    public static String convertToMultiline(String orig) {
        return "<html>" + orig.replaceAll("\n", "<br>");
    }



}
