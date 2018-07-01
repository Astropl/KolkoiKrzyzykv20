package SDA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import static SDA.SetEnglish.setEnglish;
import static SDA.SetGerman.setGerman;
import static SDA.SetPolish.setPolish;


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
    public static JLabel lblCzas;

    public static JMenuBar menuBar;
    public static JMenu menu;
    public static JMenuItem jMenuItem;


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
    static String setLocal = "pol";
    static SetPolish setPolish = new SetPolish();
    static SetEnglish setEnglish = new SetEnglish();
    static SetGerman setGerman = new SetGerman();

    JMenuBar menubar = new JMenuBar();
    JRadioButtonMenuItem mOsobaKomp = new JRadioButtonMenuItem("Osoba - Komp");
    static JMenu file = new JMenu("Plik");
    static JMenu settings = new JMenu("Ustawienia");
    ImageIcon exitIcon = new ImageIcon("Resources/exit.png");
    static JMenuItem eExit = new JMenuItem("Wyjscie");

    static JMenu eLanguage = new JMenu("Język");
    static JRadioButtonMenuItem ePolsh = new JRadioButtonMenuItem("Polski", true);
    static JRadioButtonMenuItem eEnglish = new JRadioButtonMenuItem("Angielski");
    static JRadioButtonMenuItem eGerman = new JRadioButtonMenuItem("Niemiecki");
    static JMenu eChoiceTypeGame = new JMenu("Wybór trybu");
    JRadioButtonMenuItem mOsobaOsoba = new JRadioButtonMenuItem("Osoba - Osoba", true);
    ButtonGroup directionGroup1 = new ButtonGroup();
    ButtonGroup directionGroup2 = new ButtonGroup();



    public void planszaGlowna() {
        Time time = new Time();
        time.run();
        initUI();


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
        this.setSize(500, 600);
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
        mOsobaKomp.addActionListener(this);
        mOsobaOsoba.addActionListener(this);
        ePolsh.addActionListener(this);
        eEnglish.addActionListener(this);
        eGerman.addActionListener(this);


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
        kontener.add(lblCzas);
    }

    //**************************
    private void initUI() {

        createMenuBar();


        setLocationRelativeTo(null);

    }

    private void createMenuBar() {


        file.setMnemonic(KeyEvent.VK_F);


        eExit.setMnemonic(KeyEvent.VK_E);
        eExit.setToolTipText("Zamknięcie aplikacji");
        eExit.addActionListener((ActionEvent event) -> {
            System.exit(0);
        });
        file.add(eExit);
        settings.add(eLanguage);
        settings.addSeparator();
        settings.add(eChoiceTypeGame);

        eLanguage.add(ePolsh);
        eLanguage.add(eEnglish);
        eLanguage.add(eGerman);
        directionGroup1.add(ePolsh);
        directionGroup1.add(eEnglish);
        directionGroup1.add(eGerman);


        eChoiceTypeGame.add(mOsobaKomp);
        eChoiceTypeGame.add(mOsobaOsoba);
        directionGroup2.add(mOsobaOsoba);
        directionGroup2.add(mOsobaKomp);
        menubar.add(file);
        menubar.add(settings);

        setJMenuBar(menubar);

    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Plansza Glowna");
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

            btn1.setEnabled(false);
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
            btn3.setEnabled(false);
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
            btn4.setEnabled(false);
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
            btn5.setEnabled(false);
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
            btn6.setEnabled(false);
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
            btn7.setEnabled(false);
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
            btn8.setEnabled(false);
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
            btn9.setEnabled(false);
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
            btdof.buttonsDisabledOnFirst(true);
            sL.setLabels(true);
            chBox.setVisible(false);
            lbl5.setVisible(false);
        } else if (source == chBox) {
            System.out.println("Zmiana ststusu CheckBoxa");

            if (chBox.isSelected()) {
                setLocalMetoda(setLocal);
                mOsobaKomp.setSelected(true);
                mOsobaOsoba.setSelected(false);
                //chBox.setText("Osoba - Komputer");
            } else if (chBox.isSelected() == false) {
                setLocalMetoda(setLocal);
                mOsobaKomp.setSelected(false);
                mOsobaOsoba.setSelected(true);
                //chBox.setText("Osoba - Osoba");
            }
        } else if (source == mOsobaKomp) {
            mOsobaKomp.isSelected();
            System.out.println("Zmiana mOsoba na checked");
            chBox.setSelected(true);
            //chBox.setText("Osoba - Komputer");
            setLocalMetoda(setLocal);
        } else if (source == mOsobaOsoba) {
            mOsobaOsoba.isSelected();
            System.out.println("Zmiana osoba osoba na checked");
            chBox.setSelected(false);
            setLocalMetoda(setLocal); //todo sprawdzam setlocale
            //chBox.setText("Osoba - Osoba");
        } else if (source == ePolsh) {
            System.out.println("Wybór polskich liter");
            //settings.setText("Ustawienia");
            setLocal = "pol";
            setLocalMetoda(setLocal);
        } else if (source == eEnglish) {
            System.out.println("Wybór angielkisch liter");
            setLocal = "eng";
            setLocalMetoda(setLocal);
        } else if (source == eGerman) {
            System.out.println("Wybór niemieckich liter");
            setLocal = "ger";
            setLocalMetoda(setLocal);
        }
    }

    public String setLocalMetoda(String setLocal) {
        if (setLocal.equals("pol")) {
            setPolish();
        } else if (setLocal.equals("eng")) {
            setEnglish();
        } else if (setLocal.equals("ger")) {
            setGerman();
        }

        return null;
    }

}
