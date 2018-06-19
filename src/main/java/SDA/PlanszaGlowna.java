package SDA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static SDA.CountRuch.countRuch;
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
    public static JLabel lbl5;
    public static JButton btnGraj;
    public static JButton btnReset;
    public static JCheckBox chBox;

    static int ruchOsoba = 0; // 0 osoba numer 1, 1 osoba numer 2, 2  komputer BAJTEK
    static String znacznikBtn1 = "1", znacznikBtn2 = "2", znacznikBtn3 = "3";
    static String znacznikBtn4 = "4", znacznikBtn5 = "5", znacznikBtn6 = "6";
    static String znacznikBtn7 = "7", znacznikBtn8 = "8", znacznikBtn9 = "9";

    boolean bol = false;
    static boolean koniec = false;
    static int countRuch = 0;
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
        chBox.addActionListener(this);
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
        kontener.add(chBox);
        kontener.add(lbl5);
    }



    public void actionPerformed(ActionEvent e) {
        NewThread newThread = new NewThread();
        Thread thread = new Thread(newThread);
        Object source = e.getSource();
        if (source == btn1) {
            if (ruchOsoba == 0) {
                btn1.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/x.jpg")));
                System.out.println(lbl1.getText() + " zaznaczył 1x");
                znacznikBtn1 = "x";

            } else if (ruchOsoba == 1) {
                btn1.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/o.jpg"
                )));
                System.out.println(lbl2.getText() + " zaznaczył 1o");
                znacznikBtn1 = "o";

            } else if (ruchOsoba == 2) {
                System.out.println("Ruch kompa");
                btn1.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/o.jpg"
                )));
                System.out.println(lbl2.getText() + " zaznaczył 1o");
                znacznikBtn1 = "o";

            }
            thread.start();

            PlanszaGlowna.btn1.setEnabled(false);
            System.out.println("Nacinall 1");


        } else if (source == btn2) {
            if (ruchOsoba == 0) {
                btn2.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/x.jpg"
                )));
                znacznikBtn2 = "x";

            } else if (ruchOsoba == 1) {
                btn2.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/o.jpg"
                )));
                znacznikBtn2 = "o";

            } else if (ruchOsoba == 2) {
                System.out.println("Ruch kompa");
                btn2.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/o.jpg"
                )));
                znacznikBtn2 = "o";

            }
            thread.start();

            btn2.setEnabled(false);

            System.out.println("Nacoisnl 2");
        } else if (source == btn3) {

            if (ruchOsoba == 0) {
                btn3.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/x.jpg"
                )));
                znacznikBtn3 = "x";

            } else if (ruchOsoba == 1) {
                btn3.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/o.jpg"
                )));
                znacznikBtn3 = "o";

            } else if (ruchOsoba == 2) {
                System.out.println("Ruch kompa");
                btn3.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/o.jpg"
                )));
                znacznikBtn3 = "o";

            }
            thread.start();
            //countRuch();
            btn3.setEnabled(false);
            //ruchOsoba();
            System.out.println("Nacoisnl 3");
        } else if (source == btn4) {
            if (ruchOsoba == 0) {
                btn4.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/x.jpg"
                )));
                znacznikBtn4 = "x";

            } else if (ruchOsoba == 1) {
                btn4.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/o.jpg"
                )));
                znacznikBtn4 = "o";

            } else if (ruchOsoba == 2) {
                System.out.println("Ruch kompa");
                btn4.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/o.jpg"
                )));
                znacznikBtn4 = "o";

            }
            thread.start();
            //countRuch();
            btn4.setEnabled(false);
            //ruchOsoba();
            System.out.println("Nacoisnl 4");
        } else if (source == btn5) {
            if (ruchOsoba == 0) {
                btn5.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/x.jpg"
                )));
                znacznikBtn5 = "x";

            } else if (ruchOsoba == 1) {
                btn5.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/o.jpg"
                )));
                znacznikBtn5 = "o";

            } else if (ruchOsoba == 2) {
                System.out.println("Ruch kompa");
                btn5.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/o.jpg"
                )));
                znacznikBtn5 = "o";

            }
            thread.start();
            //countRuch();
            btn5.setEnabled(false);
            //ruchOsoba();
            System.out.println("Nacoisnl 5");
        } else if (source == btn6) {
            if (ruchOsoba == 0) {
                btn6.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/x.jpg"
                )));
                znacznikBtn6 = "x";

            } else if (ruchOsoba == 1) {
                btn6.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/o.jpg"
                )));
                znacznikBtn6 = "o";

            } else if (ruchOsoba == 2) {
                System.out.println("Ruch kompa");
                btn6.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/o.jpg"
                )));
                znacznikBtn6 = "o";

            }
            thread.start();
            //countRuch();
            btn6.setEnabled(false);
            //ruchOsoba();
            System.out.println("Nacoisnl 6");
        } else if (source == btn7) {
            if (ruchOsoba == 0) {
                btn7.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/x.jpg"
                )));
                znacznikBtn7 = "x";

            } else if (ruchOsoba == 1) {
                btn7.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/o.jpg"
                )));
                znacznikBtn7 = "o";

            } else if (ruchOsoba == 2) {
                System.out.println("Ruch kompa");
                btn7.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/o.jpg"
                )));
                znacznikBtn7 = "o";

            }
            thread.start();
            //countRuch();
            btn7.setEnabled(false);
            //ruchOsoba();
            System.out.println("Nacoisnl 7");
        } else if (source == btn8) {
            if (ruchOsoba == 0) {
                btn8.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/x.jpg"
                )));
                znacznikBtn8 = "x";

            } else if (ruchOsoba == 1) {
                btn8.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/o.jpg"
                )));
                znacznikBtn8 = "o";

            } else if (ruchOsoba == 2) {
                System.out.println("Ruch kompa");
                btn8.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/o.jpg"
                )));
                znacznikBtn8 = "o";

            }
            thread.start();
            //countRuch();
            btn8.setEnabled(false);
            //ruchOsoba();
            System.out.println("/Nacoisnl 8");
        } else if (source == btn9) {
            if (ruchOsoba == 0) {
                btn9.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/x.jpg"
                )));
                znacznikBtn9 = "x";

            } else if (ruchOsoba == 1) {
                btn9.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/o.jpg"
                )));
                znacznikBtn9 = "o";

            } else if (ruchOsoba == 2) {
                System.out.println("Ruch kompa");
                btn9.setIcon(new ImageIcon(PlanszaGlowna.class.getResource(
                        "Resources/o.jpg"
                )));
                znacznikBtn9 = "o";

            }
            thread.start();
            //countRuch();
            btn9.setEnabled(false);
            //ruchOsoba();
            System.out.println("/Nacoisnl 9");
        } else if (source == btnReset)

        {
            ResetSettings.resetSettings();


            System.out.println("Nacisnal RESET");
        } else if (source == btnGraj) {

            UstawImiona.ustawImiona();
            btnGraj.setEnabled(false);
            System.out.println("Nacoisnl btnGraj");
            System.out.println("***************");
            //lbl3.setText("Rozpoczyna Gracz o imieniu : " + lbl1.getText());
            btdof.buttonsDisabledOnFirst(true);
            sL.setLabels(true);
            chBox.setVisible(false);
            lbl5.setVisible(false);
        } else if (source == chBox) {
            System.out.println("Zmiana ststusu CheckBoxa");

            if (chBox.isSelected()) {
                chBox.setText("Osoba - Komputer");
            } else if (chBox.isSelected() == false) {
                chBox.setText("Osoba - Osoba");
            }
        }

    }

}
