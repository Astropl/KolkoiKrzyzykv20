package SDA;

public class SetPolish {


    public static void setPolish() {
        PlanszaGlowna.settings.setText("Ustawienia");
        PlanszaGlowna.file.setText("Plik");
        PlanszaGlowna.lbl5.setText(convertToMultiline("Zaznacz żeby grac z komputerem. \nOdznaczone to gra dwóch osób."));
        if (PlanszaGlowna.chBox.isSelected() == true) {
            PlanszaGlowna.chBox.setText("Osoba - Komputer");
        } else {

            PlanszaGlowna.chBox.setText("Osoba - Osoba");
        }
        PlanszaGlowna.eExit.setText("Wyjście");
        PlanszaGlowna.eLanguage.setText("Język");
        PlanszaGlowna.ePolsh.setText("Polski");
        PlanszaGlowna.eEnglish.setText("Angielski");
        PlanszaGlowna.eGerman.setText("Niemiecki");
        PlanszaGlowna.eChoiceTypeGame.setText("Wybór trybu");
        UstawImiona.message1 = "Player 1 podaj swoje  imie";
        UstawImiona.message2 = "Komputer będzie miał na imię BAJTEK: ";
        UstawImiona.message3 = "Player 2 podaj swoje  imie";
        StartGame.message = "No to zaczynamy";

    }

    public static String convertToMultiline(String orig) {
        return "<html>" + orig.replaceAll("\n", "<br>");
    }
}
