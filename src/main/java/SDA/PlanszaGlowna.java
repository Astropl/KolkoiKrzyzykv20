package SDA;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlanszaGlowna extends JFrame {
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    public JLabel lbl1;
    private JLabel lbl2;
    private JLabel lbl3;
    private JButton btnGraj;
    //private JEditorPane btn11;


    public void planszaGlowna() {
        //PlanszaGlowna();
    }

    PlanszaGlowna() {

        this.setLayout(null);
        this.setSize(500, 500);
        this.setTitle(" Kółko i Krzyżyk");
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        konstruktorButtonow();
        konstruktorAddKontenerow();
        konstruktorRozmiarButtonow();
        konstruktorTekstów();
        this.setVisible(true);
        setVisible(true);


        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Pierwszy");
                btn1.setIcon(new ImageIcon(PlanszaGlowna.class.getResource("Resources/x.jpg")));

                btn1.setEnabled(false);

            }
        });
        btnGraj.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("btnGraj");
                //btnGraj.setIcon(new ImageIcon(PlanszaGlowna.class.getResource("Resources/x.jpg")));
                ustawImiona();
                //btnGraj.setEnabled(false);

            }
        });
    }

    public void ustawImiona() {
        String imie1 = JOptionPane.showInputDialog("Player 1 podaj swoje  imie");
        lbl1.setText(imie1);

        String imie2 = JOptionPane.showInputDialog("Player 2 podaj swoje  imie");
        lbl2.setText(imie2);

    }

    public void konstruktorTekstów() {
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        btnGraj.setText("START");
        lbl1.setText("fhfdh");
        lbl2.setText("hfh");
        lbl3.setText("fhfghgf");
    }


    public void konstruktorRozmiarButtonow() {
        btn1.setBounds(20, 20, 100, 100);
        btn2.setBounds(120, 20, 100, 100);
        btn3.setBounds(220, 20, 100, 100);
        btn4.setBounds(20, 120, 100, 100);
        btn5.setBounds(120, 120, 100, 100);
        btn6.setBounds(220, 120, 100, 100);
        btn7.setBounds(20, 220, 100, 100);
        btn8.setBounds(120, 220, 100, 100);
        btn9.setBounds(220, 220, 100, 100);

        btnGraj.setBounds(370, 20, 80, 60);

        lbl1.setBounds(400, 170, 50, 50);
        lbl2.setBounds(400, 190, 50, 50);
        lbl3.setBounds(400, 200, 50, 50);

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
        kontener.add(lbl2);
        kontener.add(lbl3);
    }

    public void konstruktorButtonow() {
        btn1 = new JButton();
        btn2 = new JButton();
        btn3 = new JButton();
        btn4 = new JButton();
        btn5 = new JButton();
        btn6 = new JButton();
        btn7 = new JButton();
        btn8 = new JButton();
        btn9 = new JButton();
        btnGraj = new JButton();

        lbl1 = new JLabel();
        lbl2 = new JLabel();
        lbl3 = new JLabel();
    }


    //setVisible(true);

//        add(button1);
//        add(button2);
//        add(button3);
//        add(button4);
//        add(button5);
//        add(button6);
//        add(button7);
//        add(button8);
//        add(button9);
//        add(btnGraj);
//
//        add(lbl1);
//        add(lbl2);
//        add(lbl3);
//
//        button1.setBounds(20, 20, 100, 100);
//        button2.setBounds(120, 20, 100, 100);
//        button3.setBounds(220, 20, 100, 100);
//        button4.setBounds(20, 120, 100, 100);
//        button5.setBounds(120, 120, 100, 100);
//        button6.setBounds(220, 120, 100, 100);
//        button7.setBounds(20, 220, 100, 100);
//        button8.setBounds(120, 220, 100, 100);
//        button9.setBounds(220, 220, 100, 100);
//
//        btnGraj.setBounds(370, 20, 80, 60);
//        lbl1.setBounds(400, 170, 50, 50);
//        lbl2.setBounds(400, 190, 50, 50);
//        lbl3.setBounds(400, 200, 50, 50);
//        String imie;
//        //UstawTextButonow(imie);
//
//
//        lbl1.setText("pierszy");
//        lbl2.setText("drugi");
//        lbl3.setText("trzeci");
//
//
//        button1.setText("");
//        button2.setText("");
//        button3.setText("");
//        button4.setText("");
//        button5.setText("");
//        button6.setText("");
//        button7.setText("");
//        button8.setText("");
//        button9.setText("");
//        btnGraj.setText("START");
//        setVisible(true);
//

}
