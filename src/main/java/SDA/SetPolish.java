package SDA;

import SDA.init.MainBoard;

public class SetPolish {


    public static void setPolish() {
        MainBoard.settings.setText("Ustawienia");
        MainBoard.file.setText("Plik");
        MainBoard.lbl5.setText(convertToMultiline("Zaznacz żeby grac z komputerem. \nOdznaczone to gra dwóch osób."));
        if (MainBoard.chBox.isSelected() == true) {
            MainBoard.chBox.setText("Osoba - Komputer");
        } else {

            MainBoard.chBox.setText("Osoba - Osoba");
        }
        MainBoard.eExit.setText("Wyjście");
        MainBoard.eLanguage.setText("Język");
        MainBoard.ePolsh.setText("Polski");
        MainBoard.eEnglish.setText("Angielski");
        MainBoard.eGerman.setText("Niemiecki");
        MainBoard.eChoiceTypeGame.setText("Wybór trybu");


        UstawImiona.message1 = "Player 1 podaj swoje  imie";
        UstawImiona.message2 = "Komputer będzie miał na imię BAJTEK: ";
        UstawImiona.message3 = "Player 2 podaj swoje  imie";
        TheWin.message1="WYGRANA  GRACZA O IMIENIU: ";
        CountRuch.message1="Niestety ale mamy REMIS !!! ";
        RuchOsoba.message1="Ruch Gracza o imieniu : ";
        TheWin.message2="Hura wygrał: ";


        StartGame.message = "No to zaczynamy";

        //MainBoard.lbl1.setText("imie 1");
        MainBoard.lbl11.setText("GRACZ nr 1");

        //MainBoard.lbl2.setText("imie 2");
        MainBoard.lbl12.setText("GRACZ nr 2");

        MainBoard.mOsobaKomp.setText("Osoba - Komp");
        MainBoard.mOsobaOsoba.setText("Osoba - Osoba");
        MainBoard.lbl3.setText("Rozpoczyna Gracz o imeniu :" + MainBoard.lbl1.getText());

    }

    public static String convertToMultiline(String orig) {
        return "<html>" + orig.replaceAll("\n", "<br>");
    }
}
