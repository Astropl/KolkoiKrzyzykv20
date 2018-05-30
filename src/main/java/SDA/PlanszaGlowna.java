package SDA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static SDA.RuchOsoba.ruchOsoba;


public class PlanszaGlowna extends JFrame implements ActionListener {
    public static JButton btn1;
    public static JButton btn2;
    public static JButton btn3;
    public static JButton btn4;
    public static JButton btn5;
    public static JButton btn6;
    public static JButton btn7;
    public static JButton btn8;
    public static JButton btn9;
    public static JLabel lbl1;
    public static JLabel lbl11;
    public static JLabel lbl2;
    public static JLabel lbl12;
    public static JLabel lbl3;
    public static JLabel lbl4;
    public static JButton btnGraj;
    public static JButton btnReset;

    static int ruchOsoba = 0; // 0 osoba numer 1, 1 osoba numer 2
    static String znacznikBtn1 = "1", znacznikBtn2 = "2", znacznikBtn3 = "3";
    static String znacznikBtn4 = "4", znacznikBtn5 = "5", znacznikBtn6 = "6";
    static String znacznikBtn7 = "7", znacznikBtn8 = "8", znacznikBtn9 = "9";

    boolean bol = false;
    ButtonsDisabledOnFirst btdof = new ButtonsDisabledOnFirst();
    KonstruktorButtonow kb = new KonstruktorButtonow();
    KonstruktorRozmiarButtonow krb = new KonstruktorRozmiarButtonow();
    KonstruktorTekstów kt = new KonstruktorTekstów();
    SetLabels sL = new SetLabels();


    public void planszaGlowna() {

        kb.kontruktorButonow();
        konstruktorAddKontenerow();
        krb.rozmiaryLabelow();
        kt.konstruktorTekstow();
        addActiony();
        this.setVisible(true);
        btdof.buttonsDisabledOnFirst(false);
        setVisible(true);
        sL.setLabels(false);
        btnReset.setEnabled(false);
        lbl4.setVisible(false);
    }

    public PlanszaGlowna() {
        this.bol = bol;
        this.setLayout(null);
        this.setSize(500, 500);
        this.setTitle(" Kółko i Krzyżyk");
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }


    public void addActiony() {
        btnGraj.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnReset.addActionListener(this);
    }


    public void konstruktorAddKontenerow() {
        Container kontener = this.getContentPane();
        kontener.add(btn1);
        kontener.add(btn2);
        kontener.add(btn3);
        kontener.add(btn4);
        kontener.add(btn5);
        kontener.add(btn6);
        kontener.add(btn7);
        kontener.add(btn8);
        kontener.add(btn9);
        kontener.add(btnGraj);
        kontener.add(lbl1);
        kontener.add(lbl11);
        kontener.add(lbl2);
        kontener.add(lbl12);
        kontener.add(lbl3);
        kontener.add(lbl4);
        kontener.add(btnReset);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == btn1) {
            if (ruchOsoba == 0) {
                btn1.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/x.jpg"

                )));
                znacznikBtn1 = "x";
                ruchOsoba();
            } else {
                btn1.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/o.jpg"
                )));
                znacznikBtn1 = "o";
                ruchOsoba();
            }
            ;
            btn1.setEnabled(false);
            System.out.println("Nacinall jeden");
        } else if (source == btn2) {
            if (ruchOsoba == 0) {
                btn2.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/x.jpg"
                )));
                znacznikBtn2 = "x";
                ruchOsoba();
            } else {
                btn2.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/o.jpg"
                )));
                znacznikBtn2 = "o";
                ruchOsoba();
            }
            btn2.setEnabled(false);
            System.out.println("/Nacoisnl 2");
        } else if (source == btn3) {

            if (ruchOsoba == 0) {
                btn3.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/x.jpg"
                )));
                znacznikBtn3 = "x";
                ruchOsoba();
            } else {
                btn3.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/o.jpg"
                )));
                znacznikBtn3 = "o";
                ruchOsoba();
            }
            btn3.setEnabled(false);
            System.out.println("/Nacoisnl 3");
        } else if (source == btn4) {
            if (ruchOsoba == 0) {
                btn4.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/x.jpg"
                )));
                znacznikBtn4 = "x";
                ruchOsoba();
            } else {
                btn4.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/o.jpg"
                )));
                znacznikBtn4 = "o";
                ruchOsoba();
            }
            btn4.setEnabled(false);
            System.out.println("/Nacoisnl 4");
        } else if (source == btn5) {
            if (ruchOsoba == 0) {
                btn5.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/x.jpg"
                )));
                znacznikBtn5 = "x";
                ruchOsoba();
            } else {
                btn5.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/o.jpg"
                )));
                znacznikBtn5 = "o";
                ruchOsoba();
            }
            btn5.setEnabled(false);
            System.out.println("/Nacoisnl 5");
        } else if (source == btn6) {
            if (ruchOsoba == 0) {
                btn6.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/x.jpg"
                )));
                znacznikBtn6 = "x";
                ruchOsoba();
            } else {
                btn6.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/o.jpg"
                )));
                znacznikBtn6 = "o";
                ruchOsoba();
            }
            btn6.setEnabled(false);
            System.out.println("/Nacoisnl 6");
        } else if (source == btn7) {
            if (ruchOsoba == 0) {
                btn7.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/x.jpg"
                )));
                znacznikBtn7 = "x";
                ruchOsoba();
            } else {
                btn7.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/o.jpg"
                )));
                znacznikBtn7 = "o";
                ruchOsoba();
            }
            btn7.setEnabled(false);
            System.out.println("/Nacoisnl 7");
        } else if (source == btn8) {
            if (ruchOsoba == 0) {
                btn8.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/x.jpg"
                )));
                znacznikBtn8 = "x";
                ruchOsoba();
            } else {
                btn8.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/o.jpg"
                )));
                znacznikBtn8 = "o";
                ruchOsoba();
            }
            btn8.setEnabled(false);
            System.out.println("/Nacoisnl 8");
        } else if (source == btn9) {
            if (ruchOsoba == 0) {
                btn9.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/x.jpg"
                )));
                znacznikBtn9 = "x";
                ruchOsoba();
            } else {
                btn9.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/o.jpg"
                )));
                znacznikBtn9 = "o";
                ruchOsoba();
            }
            btn9.setEnabled(false);
            System.out.println("/Nacoisnl 9");
        }else if (source==btnReset)

        { //ResetSettings rSett = new ResetSettings();
            ResetSettings.resetSettings();
            //rSett.resetSettings();
            // Butn Reset resetuje gre i przywraca wszytsko do poziomu zero

            System.out.println("Nacisnal RESET");
        } else if (source == btnGraj) {

            UstawImiona.ustawImiona();
            btnGraj.setEnabled(false);
            System.out.println("/Nacoisnl btnGraj");
            lbl3.setText("Rozpoczyna Gracz o imieniu : " + lbl1.getText());
            btdof.buttonsDisabledOnFirst(true);
            sL.setLabels(true);
        }

    }

}
