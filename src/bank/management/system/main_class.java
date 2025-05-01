package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_class extends JFrame implements ActionListener {
    ImageIcon i1,iii22;
    JButton button1,button2,button3,button4,button5,button6,button7;
    JLabel label;
    String pin;
    main_class(String pin){
        this.pin = pin;

        i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1300,640,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(180,0,950,640);
        add(l3);

        label = new JLabel("Please Select Your Transaction");
        label.setBounds(175,130,650,30);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System",Font.BOLD,24));
        l3.add(label);

        button1 = new JButton("DEPOSIT");
       // button1.setForeground(Color.WHITE);
        //button1.setBackground(new Color(65,125,128));
        button1.setFont(new Font("Raleway",Font.BOLD,15));
        button1.setForeground(Color.black);
        button1.setBackground(Color.white);
        button1.setBounds(165,205,130,27);
        button1.addActionListener(this);
        l3.add(button1);

        button2 = new JButton("CASH WITHDRAWL");
        //button2.setForeground(Color.WHITE);
       // button2.setBackground(new Color(65,125,128));
        button2.setFont(new Font("Raleway",Font.BOLD,15));
        button2.setForeground(Color.black);
        button2.setBackground(Color.white);
        button2.setBounds(360,205,183,27);
        button2.addActionListener(this);
        l3.add(button2);

        button3 = new JButton("FAST CASH");
        //button3.setForeground(Color.WHITE);
        //button3.setBackground(new Color(65,125,128));
        button3.setFont(new Font("Raleway",Font.BOLD,15));
        button3.setForeground(Color.black);
        button3.setBackground(Color.white);
        button3.setBounds(165,243,130,27);
        button3.addActionListener(this);
        l3.add(button3);

        button4 = new JButton("MINI STATEMENT");
        button4.setForeground(Color.black);
        button4.setBackground(Color.white);
        button4.setFont(new Font("Raleway",Font.BOLD,15));
       // button4.setBackground(new Color(65,125,128));
        button4.setBounds(360,243,183,27);

        button4.addActionListener(this);
        l3.add(button4);

        button5 = new JButton("PIN CHANGE");
      //  button5.setForeground(Color.WHITE);
      //  button5.setBackground(new Color(65,125,128));
        button5.setFont(new Font("Raleway",Font.BOLD,15));
        button5.setForeground(Color.black);
        button5.setBackground(Color.white);
        button5.setBounds(165,280,130,27);
        button5.addActionListener(this);
        l3.add(button5);

        button6 = new JButton("BALANCE ENQUIRY");
       // button6.setForeground(Color.WHITE);
       // button6.setBackground(new Color(65,125,128));
        button6.setFont(new Font("Raleway",Font.BOLD,15));
        button6.setForeground(Color.black);
        button6.setBackground(Color.white);
        button6.setBounds(360,283,183,27);
        button6.addActionListener(this);
        l3.add(button6);

        button7 = new JButton("EXIT");
        //button7.setForeground(Color.WHITE);
       // button7.setBackground(new Color(65,125,128));
        button7.setFont(new Font("Raleway",Font.BOLD,15));
        button7.setForeground(Color.black);
        button7.setBackground(Color.white);
        button7.setBounds(360,320,183,27);
        button7.addActionListener(this);
        l3.add(button7);



        iii22 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg10.jpg"));
        Image iii33 = iii22.getImage().getScaledInstance(1500, 680, Image.SCALE_DEFAULT);
        ImageIcon iii44 = new ImageIcon(iii33);
        JLabel iiimage = new JLabel(iii44);
        iiimage.setBounds(0, 0, 1500, 680);
        add(iiimage);

        setLayout(null);
        setSize(1550,680);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button1){
            new Deposit(pin);
            setVisible(false);
        }else if(e.getSource()==button7)
        {
            System.exit(0);
        }
        else if(e.getSource()==button2)
        {
            new withdrawl(pin);
            setVisible(false);
        }else if(e.getSource()==button6){
            new balance_enquiry(pin);
            setVisible(false);
        }else if(e.getSource()==button3){
            new FastCash(pin);
            setVisible(false);
        }else if(e.getSource()==button5){
            new ChangePin(pin);
            setVisible(false);
        }
        else if(e.getSource()==button4){
            new mini(pin);
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new main_class("");
    }
}
