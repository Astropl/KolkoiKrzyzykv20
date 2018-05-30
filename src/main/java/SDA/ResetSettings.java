package SDA;

public class ResetSettings extends PlanszaGlowna
{
    public static void resetSettings ()
    {
        System.out.println("Resetuje butony");
        btnReset.setEnabled(false);
        KonstruktorTekstów.konstruktorTekstow();
        ButtonsDisabledOnFirst.buttonsDisabledOnFirst(false);
    }

}
