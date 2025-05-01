package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;
import java.awt.event.ComponentListener;

public class withdrawl extends JFrame implements ActionListener {
    JTextField textAtm;
    JLabel jlabel;
    JButton button1,button2;
    String pin;
    withdrawl(String pin){

            this.pin = pin;


            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
            Image i2 = i1.getImage().getScaledInstance(1300,640,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel l3 = new JLabel(i3);
            l3.setBounds(180,0,950,640);
            add(l3);

            jlabel = new JLabel("MAXIMUM WITHDRAWAL IS RS.10,000");
            jlabel.setForeground(Color.white);
            jlabel.setFont(new Font("Raleway",Font.BOLD,16));
            jlabel.setBounds(200,110,400,35);
            l3.add(jlabel);

           jlabel = new JLabel("PLEASE ENTER THE AMOUNT");
           jlabel.setForeground(Color.white);
           jlabel.setFont(new Font("Raleway",Font.BOLD,18));
           jlabel.setBounds(220,140,400,35);
           l3.add(jlabel);



            textAtm = new JTextField();
            textAtm.setFont(new Font("Raleway",Font.BOLD,16));
            textAtm.setBounds(200,180,300,30);
             textAtm.setForeground(Color.BLACK);
            textAtm.setBackground(Color.WHITE);
            l3.add(textAtm);

            button1 = new JButton("WITHDRAW");
            button1.setFont(new Font("Raleway",Font.BOLD,16));
            button1.setBounds(390 ,280,150,25);
            button1.setForeground(Color.black);
            button1.setBackground(Color.white);
            button1.addActionListener(this);
            l3.add(button1);

            button2 = new JButton("Back");
            button2.setFont(new Font("Raleway",Font.BOLD,16));
            button2.setBounds(390,317,150,25);
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



            setSize(1500, 680);
            setLocation(0,0);
            setVisible(true);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1) {
            try {
                String amount = textAtm.getText();
                Date date = new Date();
                if (textAtm.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the Amount you want to withdraw");
                } else {
                    Conn c = new Conn();
                    ResultSet resultSet = c.statement.executeQuery("select * from atm where pin = '" + pin + "'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit  ")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insuffient Balance");
                        return;
                    }

                    c.statement.executeUpdate("insert into atm values('" + pin + "', '" + date + "', 'Withdrawl ', '" + amount + "' )");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                    setVisible(false);
                    new main_class(pin);

                }
            } catch (Exception E) {

            }
        } else if (e.getSource()==button2) {
            setVisible(false);
            new main_class(pin);
        }

    }

    public static void main(String[] args) {
        new withdrawl("");
    }

}
