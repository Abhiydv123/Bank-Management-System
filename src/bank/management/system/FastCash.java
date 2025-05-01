package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    JLabel label;
    JButton button1,button2,button3,button4,button5,button6,button7;
    String pin;
    FastCash(String pin){
        this.pin = pin;
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1300,640,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(180,0,950,640);
        add(l3);

        label = new JLabel("SELECT WITHDRAW AMOUNT");
        label.setBounds(190,130,650,30);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System",Font.BOLD,21));
        l3.add(label);

        button1 = new JButton("Rs. 100");
        // button1.setForeground(Color.WHITE);
        //button1.setBackground(new Color(65,125,128));
        button1.setFont(new Font("Raleway",Font.BOLD,15));
        button1.setForeground(Color.black);
        button1.setBackground(Color.white);
        button1.setBounds(165,205,130,27);
        button1.addActionListener(this);
        l3.add(button1);

        button2 = new JButton("Rs. 500");
        //button2.setForeground(Color.WHITE);
        // button2.setBackground(new Color(65,125,128));
        button2.setFont(new Font("Raleway",Font.BOLD,15));
        button2.setForeground(Color.black);
        button2.setBackground(Color.white);
        button2.setBounds(410,205,130,27);
        button2.addActionListener(this);
        l3.add(button2);

        button3 = new JButton("Rs. 1000");
        //button3.setForeground(Color.WHITE);
        //button3.setBackground(new Color(65,125,128));
        button3.setFont(new Font("Raleway",Font.BOLD,15));
        button3.setForeground(Color.black);
        button3.setBackground(Color.white);
        button3.setBounds(165,243,130,27);
        button3.addActionListener(this);
        l3.add(button3);

        button4 = new JButton("Rs. 2000");
        button4.setForeground(Color.black);
        button4.setBackground(Color.white);
        button4.setFont(new Font("Raleway",Font.BOLD,15));
        // button4.setBackground(new Color(65,125,128));
        button4.setBounds(410,243,130,27);

        button4.addActionListener(this);
        l3.add(button4);

        button5 = new JButton("Rs. 5000");
        //  button5.setForeground(Color.WHITE);
        //  button5.setBackground(new Color(65,125,128));
        button5.setFont(new Font("Raleway",Font.BOLD,15));
        button5.setForeground(Color.black);
        button5.setBackground(Color.white);
        button5.setBounds(165,280,130,27);
        button5.addActionListener(this);
        l3.add(button5);

        button6 = new JButton("Rs. 10000");
        // button6.setForeground(Color.WHITE);
        // button6.setBackground(new Color(65,125,128));
        button6.setFont(new Font("Raleway",Font.BOLD,15));
        button6.setForeground(Color.black);
        button6.setBackground(Color.white);
        button6.setBounds(410,283,130,27);
        button6.addActionListener(this);
        l3.add(button6);

        button7 = new JButton("EXIT");
        //button7.setForeground(Color.WHITE);
        // button7.setBackground(new Color(65,125,128));
        button7.setFont(new Font("Raleway",Font.BOLD,15));
        button7.setForeground(Color.black);
        button7.setBackground(Color.white);
        button7.setBounds(410,320,130,27);
        button7.addActionListener(this);
        l3.add(button7);



       ImageIcon iii22 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg10.jpg"));
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
        if (e.getSource()==button7) {
            setVisible(false);
            new main_class(pin);
        }else {
            String amount = ((JButton)e.getSource()).getText().substring(4);
            Conn c = new Conn();
            Date date = new Date();
            try{
                ResultSet resultSet = c.statement.executeQuery("select * from atm where pin = '"+pin+"'");
                int balance =0;
                while (resultSet.next()){
                    if (resultSet.getString("type").equals("Deposit")){
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    }else {
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }
                }

                if (e.getSource() != button7 && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insuffient Balance");
                    return;
                }

                c.statement.executeUpdate("insert into atm values('"+pin+"','"+date+"', 'withdrawl', '"+amount+"')");
                JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");
            }catch (Exception E){
                E.printStackTrace();
            }
            setVisible(false);
            new main_class(pin);
        }

    }

    public static void main(String[] args) {
        new FastCash("");
    }
}
