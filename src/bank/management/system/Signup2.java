package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener  {

    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13;
    JTextField textPan,textAadhar;
    JRadioButton r1,r2, e1,e2;
    JButton next;
    String first;
    Signup2(String first){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(90,5,100,100);
        add(image);

        this.first = first;

        l1 = new JLabel("Page 2 :-");
        l1.setFont(new Font("Raleway", Font.BOLD,30));
        l1.setBounds(340,10,600,40);
        l1.setBackground(Color.black);
        l1.setForeground(Color.white);
        add(l1);

        l2 = new JLabel("Additonal Details");
        l2.setFont(new Font("Raleway", Font.BOLD,25));
        l2.setBounds(300,50,600,40);
        l2.setBackground(Color.black);
        l2.setForeground(Color.white);
        add(l2);

        l3 = new JLabel("Religion :");
        l3.setFont(new Font("Raleway", Font.BOLD,18));
        l3.setBounds(70,120,100,30);
        l3.setBackground(Color.black);
        l3.setForeground(Color.white);
        add(l3);

        String religion[] = {"Hindu","Muslim","Sikh", "Christian", "Other"};
        comboBox = new JComboBox(religion);
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(300,120,320,30);
        add(comboBox);

        l4 = new JLabel("Category : ");
        l4.setFont(new Font("Raleway", Font.BOLD,18));
        l4.setBounds(70,170,100,30);
        l4.setBackground(Color.black);
        l4.setForeground(Color.white);
        add(l4);

        String Category [] = {"General","OBC","SC", "ST", "Other"};
        comboBox2 = new JComboBox(Category);
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(300,170,320,30);
        add(comboBox2);

        l5 = new JLabel("Income : ");
        l5.setFont(new Font("Raleway", Font.BOLD,18));
        l5.setBounds(70,220,100,30);
        l5.setBackground(Color.black);
        l5.setForeground(Color.white);
        add(l5);

        String income [] = {"Null","<1,50,000","<2,50,000", "5,00,000", "Uptp 10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(300,220,320,30);
        add(comboBox3);

        l6 = new JLabel("Educational : ");
        l6.setFont(new Font("Raleway", Font.BOLD,18));
        l6.setBounds(70,280,150,30);
        l6.setBackground(Color.black);
        l6.setForeground(Color.white);
        add(l6);

        String educational [] = {"Non-Graduate","Graduate","Post-Graduate", "Doctrate", "Others"};
        comboBox4 = new JComboBox(educational);
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox4.setBounds(300,280,320,30);
        add(comboBox4);


        l7 = new JLabel("Occupation : ");
        l7.setFont(new Font("Raleway", Font.BOLD,18));
        l7.setBounds(70,340,150,30);
        l7.setBackground(Color.black);
        l7.setForeground(Color.white);
        add(l7);

        String Occupation [] = {"Salaried","Self-Employed","Business", "Student", "Retired", "Other"};
        comboBox5 = new JComboBox(Occupation);
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox5.setBounds(300,340,320,30);
        add(comboBox5);

        l8 = new JLabel("PAN Number : ");
        l8.setFont(new Font("Raleway", Font.BOLD,18));
        l8.setBounds(70,390,150,30);
        l8.setBackground(Color.black);
        l8.setForeground(Color.white);
        add(l8);

        textPan = new JTextField();
        textPan.setFont(new Font("Raleway", Font.BOLD,18));
        textPan.setBounds(300,390,320,30);
        add(textPan);

        l9 = new JLabel("Aadhar Number : ");
        l9.setFont(new Font("Raleway", Font.BOLD,18));
        l9.setBounds(70,440,180,30);
        l9.setBackground(Color.black);
        l9.setForeground(Color.white);
        add(l9);

        textAadhar = new JTextField();
        textAadhar.setFont(new Font("Raleway", Font.BOLD,18));
        textAadhar.setBounds(300,440,320,30);
        add(textAadhar);


        l10 = new JLabel("Senior Citizen : ");
        l10.setFont(new Font("Raleway", Font.BOLD,18));
        l10.setBounds(70,490,180,30);
        l10.setBackground(Color.black);
        l10.setForeground(Color.white);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setFont(new Font("Raleway", Font.BOLD,14));
        r1.setBounds(300,490,100,30);
        r1.setBackground(Color.black);
        r1.setForeground(Color.white);
        add(r1);
        r2 = new JRadioButton("No");
        r2.setFont(new Font("Raleway", Font.BOLD,14));
        r2.setBounds(460,490,100,30);
        r2.setBackground(Color.black);
        r2.setForeground(Color.white);
        add(r2);

        ButtonGroup b1 = new ButtonGroup();
        b1.add(r1);
        b1.add(r2);

        l11 = new JLabel("Existing Account : ");
        l11.setFont(new Font("Raleway", Font.BOLD,18));
        l11.setBounds(70,540,180,30);
        l11.setBackground(Color.black);
        l11.setForeground(Color.white);
        add(l11);

        e1 = new JRadioButton("Yes");
        e1.setFont(new Font("Raleway", Font.BOLD,14));
        e1.setBounds(300,540,100,30);
        e1.setBackground(Color.black);
        e1.setForeground(Color.white);
        add(e1);
        e2 = new JRadioButton("No");
        e2.setFont(new Font("Raleway", Font.BOLD,14));
        e2.setBounds(460,540,100,30);
        e2.setBackground(Color.black);
        e2.setForeground(Color.white);
        add(e2);

        ButtonGroup b2 = new ButtonGroup();
        b2.add(e1);
        b2.add(e2);

        l12 = new JLabel("Form No : "+first);
        l12.setFont(new Font("Raleway", Font.BOLD,14));
        l12.setBounds(550,10,160,30);
        //l12.setBackground(Color.black);
        l12.setForeground(Color.white);
        add(l12);



        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setBackground(Color.WHITE);
        next.setForeground(Color.BLACK);
        next.setBounds(570,600,100,30);
        next.addActionListener(this);
        add(next);

        ImageIcon iii22 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg11.jpg"));
        Image iii33 = iii22.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
        ImageIcon iii44 = new ImageIcon(iii33);
        JLabel iiimage = new JLabel(iii44);
        iiimage.setBounds(0, 5, 800, 700);
        add(iiimage);


        setLayout(null);
        setSize(700,680);
        setLocation(270,5);
        setVisible(true);
    }


     @Override
    public void actionPerformed(ActionEvent e) {

         String rel = (String) comboBox.getSelectedItem();
         String cate = (String) comboBox2.getSelectedItem();
         String inc = (String) comboBox3.getSelectedItem();
         String edu = (String) comboBox4.getSelectedItem();
         String occ = (String) comboBox5.getSelectedItem();

         String pan = textPan.getText();
         String addhar = textAadhar.getText();

         String scitizen = " ";
         if (r1.isSelected()){
             scitizen = "Yes";
         } else if (r2.isSelected()) {
             scitizen ="No";
         }

         String eAccount = " ";
         if (e1.isSelected()){
             eAccount = "Yes";
         } else if (e2.isSelected()) {
             eAccount = "No";
         }

         try{
             if (textPan.getText().equals("") || textAadhar.getText().equals("")){
                 JOptionPane.showMessageDialog(null,"Fill all the fields");
             } else {
                 if (e.getSource() == next) {
                     // move to Signup3
                     setVisible(false);
                     new Signup3(first);
                 }
                 Conn c = new Conn();
                 String q1 = "insert into Signuptow values('"+first+"', '"+rel+"', '"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+addhar+"','"+scitizen+"','"+eAccount+"')";
                 c.statement.executeUpdate(q1);




             }


         } catch (Exception E){
             E.printStackTrace();
         }

    }

    public static void main(String[] args) {
        new Signup2("");
    }
}
