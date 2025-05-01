package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentListener;
import java.sql.ResultSet;

public class mini extends JFrame implements ActionListener {
    JButton button;
    String pin;
    mini(String pin){

        JLabel label1 = new JLabel();

        label1.setBounds(20,100,400,400);
        label1.setFont(new Font("Raleway",Font.BOLD,14));
        label1.setBackground(Color.BLACK);
        label1.setForeground(Color.WHITE);
        add(label1);

        JLabel label2 = new JLabel("Transaction Details -");
        label2.setFont(new Font("System", Font.BOLD,20));
        label2.setBounds(100,20,200,20);
        label2.setBackground(Color.BLACK);
        label2.setForeground(Color.WHITE);
        add(label2);

        JLabel label3 = new JLabel();
        label3.setFont(new Font("Raleway",Font.BOLD,15));
        label3.setBounds(20,75,300,20);
        label3.setBackground(Color.BLACK);
        label3.setForeground(Color.WHITE);
        add(label3);

        JLabel label4 = new JLabel();
        label4.setFont(new Font("Raleway",Font.BOLD,16));
        label4.setBounds(20,460,300,20);
        label4.setBackground(Color.BLACK);
        label4.setForeground(Color.WHITE);
        add(label4);

        try{
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("select * from Login where pin = '"+pin+"'");
            while (resultSet.next()){
                label3.setText("Card Number:  "+ resultSet.getString("card_Number").substring(0,4) + "XXXXXXXX"+ resultSet.getString("card_Number").substring(12));
            }
        }catch (Exception e ){
            e.printStackTrace();
        }

        try{
            int balance =0;
            Conn c = new Conn();
            ResultSet resultSet = c.statement.executeQuery("select * from atm where pin = '"+pin+"'");
            while (resultSet.next()){

                label1.setText(label1.getText() + "<html>"+resultSet.getString("date")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("type")+"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+resultSet.getString("amount")+ "<br><br><html>");

                if (resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
            label4.setText("Your Total Balance is Rs : "+balance);
        }catch (Exception e){
            e.printStackTrace();
        }

        button = new JButton("Exit");
        button.setBounds(20,550,100,25);
        button.addActionListener(this);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        add(button);

        ImageIcon iiii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg22.jpg"));
        Image iiii2 = iiii1.getImage().getScaledInstance(450,600,Image.SCALE_DEFAULT);
        ImageIcon iiii3 = new ImageIcon(iiii2);
        JLabel l6 = new JLabel(iiii3);
        l6.setBounds(0,10,450,600);
        add(l6);


        setSize(450,650);
        setLocation(430,30);
        setLayout(null);

        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);

    }

    public static void main(String[] args) {
        new mini("");
    }
}
