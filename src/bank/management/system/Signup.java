package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import javax.swing.plaf.basic.BasicBorders;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class Signup extends JFrame implements ActionListener {
    JDateChooser dateChooser;
    JRadioButton r1, r2, r3, r4, r5;
    JTextField textName,textFather,textEmail,textAdd, textCity,textPin,textState;

    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000l) + 1000l;
    String first = " " + Math.abs(first4);

    Signup() {
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(80, 80, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 100, 100);
        add(image);

        JLabel jlabel = new JLabel("APPLICATION FORM NO." + first);
        jlabel.setBounds(140, 20, 500, 30);
        jlabel.setFont(new Font("Raleway", Font.BOLD, 33));
        jlabel.setBackground(Color.black);
        jlabel.setForeground(Color.white);
        add(jlabel);


        JLabel jlabel2 = new JLabel("Page:1 Personal Details -");
        jlabel2.setBounds(230, 60, 500, 30);
        jlabel2.setFont(new Font("Raleway", Font.BOLD, 25));
        jlabel2.setBackground(Color.black);
        jlabel2.setForeground(Color.white);
        add(jlabel2);

        JLabel jlabelName = new JLabel("Name :");
        jlabelName.setFont(new Font("Raleway", Font.BOLD, 20));
        jlabelName.setBounds(60, 110, 100, 30);
        jlabelName.setBackground(Color.black);
        jlabelName.setForeground(Color.white);
        add(jlabelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(270, 110, 300, 30);
        textName.setBackground(Color.white);
        add(textName);

        JLabel jLabelFather = new JLabel("Father's Name :");
        jLabelFather.setFont(new Font("Raleway", Font.BOLD, 20));
        jLabelFather.setBounds(60, 160, 150, 25);
        jLabelFather.setForeground(Color.white);
        jLabelFather.setBackground(Color.black);
        add(jLabelFather);

        textFather = new JTextField();
        textFather.setFont(new Font("Raleway", Font.BOLD, 14));
        textFather.setBounds(270, 160, 300, 30);
        textFather.setForeground(Color.black);
        textFather.setBackground(Color.white);
        add(textFather);

        JLabel jLabelGender = new JLabel("Gender :");
        jLabelGender.setFont(new Font("Raleway", Font.BOLD, 20));
        jLabelGender.setBounds(60, 200, 150, 25);
        jLabelGender.setForeground(Color.white);
        jLabelGender.setBackground(Color.black);
        add(jLabelGender);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBounds(270, 210, 60, 25);
        r1.setBackground(Color.white);
        r1.setForeground(Color.black);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBounds(490, 210, 80, 25);
        r2.setBackground(Color.white);
        r2.setForeground(Color.black);
        add(r2);


        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel jLabelDob = new JLabel("Date of Birth :");
        jLabelDob.setFont(new Font("Raleway", Font.BOLD, 20));
        jLabelDob.setBounds(60, 250, 150, 25);
        jLabelDob.setForeground(Color.white);
        jLabelDob.setBackground(Color.black);
        add(jLabelDob);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(270, 250, 300, 30);
        add(dateChooser);

        JLabel jLabelEmail = new JLabel("Email Address :");
        jLabelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        jLabelEmail.setBounds(60, 300, 150, 25);
        jLabelEmail.setForeground(Color.white);
        jLabelEmail.setBackground(Color.black);
        add(jLabelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        textEmail.setBounds(270, 300, 300, 30);
        textEmail.setForeground(Color.black);
        textEmail.setBackground(Color.white);
        add(textEmail);


        JLabel jLabelMarital = new JLabel("Marital Status :");
        jLabelMarital.setFont(new Font("Raleway", Font.BOLD, 20));
        jLabelMarital.setBounds(60, 350, 150, 25);
        jLabelMarital.setForeground(Color.white);
        jLabelMarital.setBackground(Color.black);
        add(jLabelMarital);


        r3 = new JRadioButton("Married");
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBounds(268, 350, 80, 25);
        r3.setBackground(Color.white);
        r3.setForeground(Color.black);
        add(r3);


        r4 = new JRadioButton("Unmarried");
        r4.setFont(new Font("Raleway", Font.BOLD, 14));
        r4.setBounds(370, 350, 100, 25);
        r4.setBackground(Color.white);
        r4.setForeground(Color.black);
        add(r4);


        r5 = new JRadioButton("Other");
        r5.setFont(new Font("Raleway", Font.BOLD, 14));
        r5.setBounds(492, 350, 80, 25);
        r5.setBackground(Color.white);
        r5.setForeground(Color.black);
        add(r5);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(r3);
        buttonGroup1.add(r4);
        buttonGroup1.add(r5);


        JLabel jLabelAdd = new JLabel("Address :");
        jLabelAdd.setFont(new Font("Raleway", Font.BOLD, 20));
        jLabelAdd.setBounds(60, 400, 150, 25);
        jLabelAdd.setForeground(Color.white);
        jLabelAdd.setBackground(Color.black);
        add(jLabelAdd);


        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway", Font.BOLD, 14));
        textAdd.setBounds(270, 400, 300, 30);
        textAdd.setForeground(Color.black);
        textAdd.setBackground(Color.white);
        add(textAdd);


        JLabel jLabelCity = new JLabel("City :");
        jLabelCity.setFont(new Font("Raleway", Font.BOLD, 20));
        jLabelCity.setBounds(60, 450, 150, 25);
        jLabelCity.setForeground(Color.white);
        jLabelCity.setBackground(Color.black);
        add(jLabelCity);


        textCity = new JTextField();
        textCity.setFont(new Font("Raleway", Font.BOLD, 14));
        textCity.setBounds(270, 450, 300, 30);
        textCity.setForeground(Color.black);
        textCity.setBackground(Color.white);
        add(textCity);


        JLabel jLabelPin = new JLabel("Pin Code :");
        jLabelPin.setFont(new Font("Raleway", Font.BOLD, 20));
        jLabelPin.setBounds(60, 500, 150, 25);
        jLabelPin.setForeground(Color.white);
        jLabelPin.setBackground(Color.black);
        add(jLabelPin);


        textPin = new JTextField();
        textPin.setFont(new Font("Raleway", Font.BOLD, 14));
        textPin.setBounds(270, 500, 300, 30);
        textPin.setForeground(Color.black);
        textPin.setBackground(Color.white);
        add(textPin);


        JLabel jLabelState = new JLabel("State :");
        jLabelState.setFont(new Font("Raleway", Font.BOLD, 20));
        jLabelState.setBounds(60, 550, 150, 25);
        jLabelState.setForeground(Color.white);
        jLabelState.setBackground(Color.black);
        add(jLabelState);


        textState = new JTextField();
        textState.setFont(new Font("Raleway", Font.BOLD, 14));
        textState.setBounds(270, 550, 300, 30);
        textState.setForeground(Color.black);
        textState.setBackground(Color.white);
        add(textState);

        JButton Next = new JButton("next");
        Next.setFont(new Font("Raleway", Font.BOLD, 15));
        Next.setBounds(580, 600, 80, 30);
        Next.setBackground(Color.black);
        Next.setForeground(Color.white);
        Next.addActionListener(this);

        add(Next);


        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg1.jpg"));
        Image iii2 = iii1.getImage().getScaledInstance(850, 800, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(200, 40, 750, 600);
        add(iiimage);


        setSize(700, 680);
        setLocation(270, 5);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String fname = textFather.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected()) {
            gender = "Male";
        } else if (r2.isSelected()) {
            gender = "Female";
        }
        String email = textEmail.getText();
        String marital = null;
        if (r3.isSelected()) {
            marital = "Married";
        } else if (r4.isSelected()) {
            marital = "Unmarried";
        } else if (r5.isSelected()) {
            marital = "Other";
        }

        String address = textAdd.getText();
        String city = textCity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();

        try {
            if (textName.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill all the fields");
            } else {
                Conn c = new Conn();
                String q = "insert into signup values('" + first+ "', '" + name + "','" + fname + "','" + dob + "','" + gender + "','" + email + "','" + marital + "', '" + address + "', '" + city + "','" + pincode + "','" + state + "' )";
                c.statement.executeUpdate(q);
                new Signup2(first);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup();
    }
}


