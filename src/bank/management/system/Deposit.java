package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
    JTextField textAtm;
    JLabel jlabel;
    JButton button,button2;
    String pin;
    Deposit(String pin){
        this.pin = pin;


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1300,640,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(180,0,950,640);
        add(l3);

        jlabel = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        jlabel.setForeground(Color.white);
        jlabel.setFont(new Font("Raleway",Font.BOLD,16));
        jlabel.setBounds(190,115,400,35);
        l3.add(jlabel);


        textAtm = new JTextField();
        textAtm.setFont(new Font("Raleway",Font.BOLD,16));
        textAtm.setBounds(190,160,320,25);
       // textAtm.setForeground(Color.);
        textAtm.setBackground(Color.white);
        l3.add(textAtm);

         button = new JButton("Deposit");
         button.setFont(new Font("Raleway",Font.BOLD,16));
         button.setBounds(440 ,283,100,25);
         button.setForeground(Color.black);
         button.setBackground(Color.white);
         button.addActionListener(this);
         l3.add(button);

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



        setSize(1500, 680);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            String amount = textAtm.getText();
            Date date = new Date();
            if (e.getSource()==button){
                if (textAtm.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter the Amount you want to Deposit");
                }else {
                    Conn c = new Conn();
                    c.statement.executeUpdate("insert into atm values('"+pin+"', '"+date+"','Deposit', '"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Rs. "+amount+" Deposited Successfully");
                    setVisible(false);
                    new main_class(pin);
                }
            }else if (e.getSource()==button2){
                setVisible(false);
                new main_class(pin);
            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Deposit("");
    }
}
