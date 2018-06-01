package SDA;

import static SDA.CountRuch.countRuch;
import static SDA.TheWin.theWin;

public class Checkresult extends PlanszaGlowna {

    public static void checkResult() {


        System.out.println("Check resutlit ok ");
        if (znacznikBtn1 == znacznikBtn2 && znacznikBtn2 == znacznikBtn3 && znacznikBtn3 == znacznikBtn1) {
            System.out.println("Pierwszy rzad sie zgadza");
            theWin();
        } else {
            System.out.println("nie ma 1 w rzedzie wygranej");


        }

        if (znacznikBtn4 == znacznikBtn5 && znacznikBtn5 == znacznikBtn6 && znacznikBtn6 == znacznikBtn4) {
            System.out.println("Drugi rzad sie zgadza");
            theWin();
        } else {
            System.out.println("nie ma w 2 rzedzie wygranej");
        }

        if (znacznikBtn7 == znacznikBtn8 && znacznikBtn8 == znacznikBtn9 && znacznikBtn9 == znacznikBtn7) {
            System.out.println("trzeci rzad sie zgadza");
            theWin();
        } else {
            System.out.println("nie ma w 3 rzedzie wygranej");

        }

        if (znacznikBtn1 == znacznikBtn4 && znacznikBtn4 == znacznikBtn7 && znacznikBtn7 == znacznikBtn1) {
            System.out.println("Pierwsza kolumna sie zgadza");
            theWin();
        } else {
            System.out.println("nie ma w 1 kolumnie wygranej");

        }
        if (znacznikBtn2 == znacznikBtn5 && znacznikBtn5 == znacznikBtn8 && znacznikBtn8 == znacznikBtn2) {
            System.out.println("Druga kolumna sie zgadza");
            theWin();
        } else {
            System.out.println("nie ma w 2 kolumnie wygranej");

        }
        if (znacznikBtn3 == znacznikBtn6 && znacznikBtn6 == znacznikBtn9 && znacznikBtn9 == znacznikBtn3) {
            System.out.println("trzeciaa kolumna sie zgadza");
            theWin();
        } else {
            System.out.println("nie ma w 3 kolumnie wygranej");

        }
        if (znacznikBtn1 == znacznikBtn5 && znacznikBtn5 == znacznikBtn9 && znacznikBtn9 == znacznikBtn1) {
            System.out.println("Na ukos z lewej do prawej z gory na dół");
            theWin();
        } else {
            System.out.println("nie ma Na ukos z lewej do prawej z gory na dół wygranej");

        }
        if (znacznikBtn3 == znacznikBtn5 && znacznikBtn5 == znacznikBtn7 && znacznikBtn7 == znacznikBtn3) {
            System.out.println("Na ukos z lewej do prawej z dołu na góre");
            theWin();
        } else {
            System.out.println("nie ma Na ukos z lewej do prawej  z dołu na góre wygranej");

        }
countRuch();

    }

}
