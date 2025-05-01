package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class balance_enquiry extends JFrame implements ActionListener {
    JButton button2;
    JLabel jlabel,jlabel2;
    String pin;
    balance_enquiry(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1300,640, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(180,0,950,640);
        add(l3);

        jlabel = new JLabel("Your Current Balance is.. ");
        jlabel.setForeground(Color.white);
        jlabel.setFont(new Font("Raleway",Font.BOLD,22));
        jlabel.setBounds(210,120,400,35);
        l3.add(jlabel);

        jlabel2 = new JLabel();
        jlabel2.setForeground(Color.white);
        jlabel2.setFont(new Font("Raleway",Font.BOLD,18));
        jlabel2.setBounds(220,155,400,35);
        l3.add(jlabel2);


        button2 = new JButton("Back");
        button2.setFont(new Font("Raleway",Font.BOLD,16));
        button2.setBounds(440,320,100,25);
        button2.setForeground(Color.black);
        button2.setBackground(Color.white);
        button2.addActionListener(this);
        l3.add(button2);

        ImageIcon iii22 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg10.jpg"));
        Image iii33 = iii22.getImage().getScaledInstance(1500, 680, Image.SCALE_DEFAULT);
        ImageIcon iii44 = new ImageIcon(iii33);
        JLabel iiimage = new JLabel(iii44);
        iiimage.setBounds(0, 0, 100, 680);
        add(iiimage);

        int balance =0;
        try{
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("Select * from atm where pin = '"+pin+"'");
            while (resultSet.next()){
                if (resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        jlabel2.setText("Rs: "+balance);


        setSize(1500,680);
        setLocation(0,0);
        setVisible(true);
        setLayout(null);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new main_class(pin);
    }

    public static void main(String[] args) {
        new balance_enquiry("");
    }

    }
