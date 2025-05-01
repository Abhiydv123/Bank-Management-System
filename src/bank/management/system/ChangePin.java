package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangePin extends JFrame implements ActionListener {
    JLabel jlabel,jlabel1,jlabel2;
    JButton button1,button2;
    JPasswordField p,p1;
    String pin;

    ChangePin(String pin){
        this.pin = pin;

        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image iii2 = iii1.getImage().getScaledInstance(1300,640,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel l5 = new JLabel(iii3);
        l5.setBounds(180,0,950,640);
        add(l5);

        jlabel = new JLabel("CHANGE YOUR PIN ");
        jlabel.setForeground(Color.white);
        jlabel.setFont(new Font("Raleway",Font.BOLD,20));
        jlabel.setBounds(260,108,400,35);
        l5.add(jlabel);

        jlabel1 = new JLabel("NEW PIN : ");
        jlabel1.setForeground(Color.white);
        jlabel1.setFont(new Font("Raleway",Font.BOLD,16));
        jlabel1.setBounds(190,150,400,35);
        l5.add(jlabel1);


        p = new JPasswordField();
        p.setFont(new Font("Raleway",Font.BOLD,16));
        p.setBounds(325,150,180,25);
        // textAtm.setForeground(Color.);
        p.setBackground(Color.white);
        l5.add(p);


        jlabel2 = new JLabel("CONFIRM PIN : ");
        jlabel2.setForeground(Color.white);
        jlabel2.setFont(new Font("Raleway",Font.BOLD,16));
        jlabel2.setBounds(190,180,400,35);
        l5.add(jlabel2);




        p1= new JPasswordField();
        p1.setFont(new Font("Raleway",Font.BOLD,16));
        p1.setBounds(325,185,180,25);
        // textAtm.setForeground(Color.);
        p1.setBackground(Color.white);
        l5.add(p1);

        button1 = new JButton("CHANGE");
        button1.setFont(new Font("Raleway",Font.BOLD,16));
        button1.setBounds(425 ,280,120,25);
        button1.setForeground(Color.black);
        button1.setBackground(Color.white);
        button1.addActionListener(this);
        l5.add(button1);

        button2 = new JButton("Back");
        button2.setFont(new Font("Raleway",Font.BOLD,16));
        button2.setBounds(425,317,120,25);
        button2.setForeground(Color.black);
        button2.setBackground(Color.white);
        button2.addActionListener(this);
        l5.add(button2);



        ImageIcon iiii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg10.jpg"));
        Image iiii2 = iiii1.getImage().getScaledInstance(1500,680,Image.SCALE_DEFAULT);
        ImageIcon iiii3 = new ImageIcon(iiii2);
        JLabel l6 = new JLabel(iiii3);
        l6.setBounds(0,0,1500,680);
        add(l6);

        setSize(1500,680);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{

            String pin1 = p.getText();
            String pin2 = p1.getText();

            if (!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null,"Entered PIN does not match");
                return;
            }
            if (e.getSource()==button1){
                if (p.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Enter New PIN");
                    return;
                }
                if (p1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Re-Enter New PIN");
                    return;
                }

                Conn c = new Conn();
                String q1 = "update atm set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q2 = "update Login set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q3 = "update Signupthree set pin = '"+pin1+"' where pin = '"+pin+"'";

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null,"PIN changed successfully");
                setVisible(false);
                new main_class(pin);

            } else if (e.getSource()==button2) {
                new main_class(pin);
                setVisible(false);
            }


        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new ChangePin("");
    }
}
