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
        TheWin.message1="WYGRANA  GRACZA O IMIENIU: ";
        CountRuch.message1="Niestety ale mamy REMIS !!! ";
        RuchOsoba.message1="Ruch Gracza o imieniu : ";
        TheWin.message2="Hura wygrał: ";


        StartGame.message = "No to zaczynamy";

        //PlanszaGlowna.lbl1.setText("imie 1");
        PlanszaGlowna.lbl11.setText("GRACZ nr 1");

        //PlanszaGlowna.lbl2.setText("imie 2");
        PlanszaGlowna.lbl12.setText("GRACZ nr 2");

        PlanszaGlowna.mOsobaKomp.setText("Osoba - Komp");
        PlanszaGlowna.mOsobaOsoba.setText("Osoba - Osoba");
        PlanszaGlowna.lbl3.setText("Rozpoczyna Gracz o imeniu :" + PlanszaGlowna.lbl1.getText());

    }

    public static String convertToMultiline(String orig) {
        return "<html>" + orig.replaceAll("\n", "<br>");
    }
}
