package SDA.Language;

import SDA.init.MainBoard;

public class SetLabels  {
    public static boolean setLabels ( Boolean bol)
    {
        MainBoard.lbl1.setVisible(bol);
        MainBoard.lbl2.setVisible(bol);
        MainBoard.lbl3.setVisible(bol);
        MainBoard.lbl4.setVisible(false);//TODO:  default na false
        MainBoard.lbl11.setVisible(bol);
        MainBoard.lbl12.setVisible(bol);
        return bol;
    }
}
