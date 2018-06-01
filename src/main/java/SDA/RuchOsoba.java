package SDA;

public class RuchOsoba extends PlanszaGlowna

{

    public static void ruchOsoba()
    {
        if (ruchOsoba == 0) {
            ruchOsoba = 1;
            lbl4.setText(lbl1.getText());
            lbl3.setText("Ruch Gracza o imieniu : " + lbl2.getText());
        } else if (ruchOsoba == 1) {
            ruchOsoba = 0;
            lbl4.setText(lbl2.getText());
            lbl3.setText("Ruch Gracza o imieniu : " + lbl1.getText());
        } else if (ruchOsoba ==2)
        {
            ruchOsoba =0;
            lbl4.setText(lbl2.getText());
            lbl3.setText("Ruch Gracza o imieniu : " + lbl1.getText());
        }

        Checkresult.checkResult();
    }
}

