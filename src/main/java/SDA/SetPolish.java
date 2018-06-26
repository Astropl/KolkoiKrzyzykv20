package SDA;

import javax.swing.*;

public class SetPolish {



    public static void setPolish()
    {


        PlanszaGlowna.settings.setText("Ustawienia");
        PlanszaGlowna.file.setText("Plik");
        PlanszaGlowna.lbl5.setText(convertToMultiline("Zaznacz żeby grac z komputerem. \nOdznaczone to gra dwóch osób."));
        if (PlanszaGlowna.chBox.isSelected() ==true)
        {
            PlanszaGlowna.chBox.setText("Osoba - Komputer");
        }else {

            PlanszaGlowna.chBox.setText("Osoba - Osoba");
        }
    }
    public static String convertToMultiline(String orig) {
        return "<html>" + orig.replaceAll("\n", "<br>");
    }
}
