package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
    JButton s,c;
    JRadioButton r1,r2, r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6;
    String first;

    Signup3(String first){
        this.first = first;


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(60,60,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(110,5,100,80);
        add(image);

        l1 = new JLabel("Page 3 :-");
        l1.setFont(new Font("Raleway", Font.BOLD,30));
        l1.setBounds(340,10,600,40);
        l1.setBackground(Color.black);
        l1.setForeground(Color.white);
        add(l1);

        l2 = new JLabel("Additonal Details -");
        l2.setFont(new Font("Raleway", Font.BOLD,25));
        l2.setBounds(300,50,600,40);
        l2.setBackground(Color.black);
        l2.setForeground(Color.white);
        add(l2);


        l3 = new JLabel("Account Type -");
        l3.setFont(new Font("Raleway",Font.BOLD,23));
        l3.setBounds(80,100,200,30);
        l3.setBackground(Color.black);
        l3.setForeground(Color.white);
        add(l3);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
       // r1.setBackground(new Color(215,252,252));
        r1.setBounds(80,150,160,30);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
      //  r2.setBackground(new Color(215,252,252));
        r2.setBounds(330,150,240,30);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
     //   r3.setBackground(new Color(215,252,252));
        r3.setBounds(80,200,160,30);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
       // r4.setBackground(new Color(215,252,252));
        r4.setBounds(330,200,240,30);
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        l4 = new JLabel("Card Number:");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(80,250,200,30);
        l4.setBackground(Color.black);
        l4.setForeground(Color.white);
        add(l4);

        l5 = new JLabel("(Your 16-digit Card Number)");
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        l5.setBounds(80,280,200,20);
        l5.setBackground(Color.black);
        l5.setForeground(Color.white);
        add(l5);

        l6 = new JLabel("XXXX-XXXX-XXXX-4841");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(330,250,250,30);
        l6.setBackground(Color.black);
        l6.setForeground(Color.white);
        add(l6);

        l7 = new JLabel("(It would appear on atm card/cheque Book and Statements)");
        l7.setFont(new Font("Raleway",Font.BOLD,12));
        l7.setBounds(330,280,530,20);
        l7.setBackground(Color.black);
        l7.setForeground(Color.white);
        add(l7);

        l8 = new JLabel("PIN:");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(80,310,200,30);
        l8.setBackground(Color.black);
        l8.setForeground(Color.white);
        add(l8);

        l9 = new JLabel("XXXX");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(330,310,200,30);
        l9.setBackground(Color.black);
        l9.setForeground(Color.white);
        add(l9);

        l10 = new JLabel("(4-digit Password)");
        l10.setFont(new Font("Raleway",Font.BOLD,12));
        l10.setBounds(80,335,200,20);
        l10.setBackground(Color.black);
        l10.setForeground(Color.white);
        add(l10);

        l11 = new JLabel("Services Required -");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(80,370,200,30);
        l11.setBackground(Color.black);
        l11.setForeground(Color.white);
        add(l11);

        c1 = new JCheckBox("ATM CARD");
      //  c1.setBackground(new Color(215,252,252));
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(80,420,200,30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
       // c2.setBackground(new Color(215,252,252));
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,420,200,30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
     //   c3.setBackground(new Color(215,252,252));
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(80,470,200,30);
        add(c3);

        c4 = new JCheckBox("EMAIL Alerts");
       // c4.setBackground(new Color(215,252,252));
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,470,200,30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
     //   c5.setBackground(new Color(215,252,252));
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(80,520,200,30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
     //   c6.setBackground(new Color(215,252,252));
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,520,200,30);
        add(c6);

        JCheckBox c7 = new JCheckBox("I here by decleares that the above entered details correct to the best of my knlowledge.",true);
       // c7.setBackground(new Color(215,252,252));
        c7.setFont(new Font("Raleway",Font.BOLD,12));
        c7.setBounds(80,570,550,20);
        add(c7);

        l12 = new JLabel("Form No : "+first);
        l12.setFont(new Font("Raleway", Font.BOLD,14));
        l12.setBounds(540,5,160,30);
        l12.setBackground(Color.black);
        l12.setForeground(Color.white);
        add(l12);




        s = new JButton("Submit");
        s.setFont(new Font("Raleway", Font.BOLD,14));
        s.setBackground(Color.BLACK);
        s.setForeground(Color.WHITE);
        s.setBounds(180,610,100,30);
        s.addActionListener(this);
        add(s);

        c = new JButton("Cancel");
        c.setFont(new Font("Raleway", Font.BOLD,14));
        c.setBackground(Color.BLACK);
        c.setForeground(Color.WHITE);
        c.setBounds(380,610,100,30);
        c.addActionListener(this);
        add(c);



        ImageIcon iii22 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg3.jpg"));
        Image iii33 = iii22.getImage().getScaledInstance(680, 660, Image.SCALE_DEFAULT);
        ImageIcon iii44 = new ImageIcon(iii33);
        JLabel iiimage = new JLabel(iii44);
        iiimage.setBounds(0, 5, 680, 660);
        add(iiimage);

        setSize(690,680);
        setLocation(270,5);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String atype = null;
        if (r1.isSelected()){
            atype = "Saving Account";
        } else if (r2.isSelected()) {
            atype ="Fixed Deposit Account";
        }else if (r3.isSelected()){
            atype ="Current Account";
        }else if (r4.isSelected()){
            atype = "Recurring Deposit Account";
        }

        Random ran = new Random();
        long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;
        String cardno = "" + Math.abs(first7);

        long first3 = (ran.nextLong() % 9000L)+ 1000L;
        String pin = "" + Math.abs(first3);

        String fac = "";
        if(c1.isSelected()){
            fac = fac+"ATM CARD ";
        } else if (c2.isSelected()) {
            fac = fac+"Internet Banking";
        } else if (c3.isSelected()) {
            fac = fac+"Mobile Banking";
        } else if (c4.isSelected()) {
            fac = fac+"EMAIL Alerts";
        } else if (c5.isSelected()) {
            fac=fac+"Cheque Book";
        } else if (c6.isSelected()) {
            fac=fac+"E-Statement";
        }

        try {
            if (e.getSource()==s){
                if (atype.equals("")){
                    JOptionPane.showMessageDialog(null,"Fill all the fields");
                }else {
                    Conn c2 = new Conn();
                    String q1 = "insert into signupthree values('"+first+"', '"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                    String q2 = "insert into login values('"+first+"','"+cardno+"','"+pin+"')";
                    c2.statement.executeUpdate(q1);
                    c2.statement.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null,"Card Number : "+cardno+"\n Pin : "+pin );
                    new Deposit(pin);
                     setVisible(false);
                }
            } else if (e.getSource()==c) {
                System.exit(0);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup3("");
    }
}
