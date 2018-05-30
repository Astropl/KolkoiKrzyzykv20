package SDA;

public class SetLabels  {
    public static boolean setLabels ( Boolean bol)
    {
        PlanszaGlowna.lbl1.setVisible(bol);
        PlanszaGlowna.lbl2.setVisible(bol);
        PlanszaGlowna.lbl3.setVisible(bol);
        PlanszaGlowna.lbl4.setVisible(bol);
        PlanszaGlowna.lbl11.setVisible(bol);
        PlanszaGlowna.lbl12.setVisible(bol);
        return bol;
    }
}
