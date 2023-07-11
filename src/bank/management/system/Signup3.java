package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {

    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;

    JButton bt1,bt2;
    String formno;

    Signup3(String formno){

        this.formno=formno;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/Bank.jpg"));
        Image i2 = i1.getImage().getScaledInstance(110, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 140, 100);
        add(image);


        JLabel lb1 = new JLabel(("Page 3:"));
        lb1.setBounds(320, 40, 400, 40);
        lb1.setFont(new Font("Raleway", Font.BOLD, 22));
        add(lb1);

        JLabel lb2 = new JLabel(("Account Details:"));
        lb2.setBounds(320, 60, 600, 40);
        lb2.setFont(new Font("Raleway", Font.BOLD, 22));
        add(lb2);

        JLabel lb3 = new JLabel(("Account Type:"));
        lb3.setBounds(100, 140, 200, 30);
        lb3.setFont(new Font("Raleway", Font.BOLD, 18));
        add(lb3);

        r1= new JRadioButton("Saving account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBounds(100,180,150,30);
        r1.setBackground(new Color(215,252,252));
        add(r1);

        r2= new JRadioButton("Recurring Deposit Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBounds(330,220,250,30);
        r2.setBackground(new Color(215,252 ,252));
        add(r2);

        r3= new JRadioButton("Fixed Deposit Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBounds(330,180,330,30);
        r3.setBackground(new Color(215,252 ,252));
        add(r3);

        r4=new JRadioButton("Current Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(new Color(215,252,252));
        r4.setBounds(100,220,200,30);
        add(r4);

        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);
        bg.add(r4);

        JLabel lb4= new JLabel(("Card number:"));
        lb4.setBounds(100, 280, 200, 30);
        lb4.setFont(new Font("Raleway", Font.BOLD, 18));
        add(lb4);

        JLabel lb5= new JLabel("(Your 16-digit Card number)");
        lb5.setBounds(100, 316, 200, 30);
        lb5.setFont(new Font("Raleway", Font.BOLD,12));
        add(lb5);

        JLabel lb6= new JLabel("XXXX-XXXX-XXXX-4841");
        lb6.setBounds(330, 280, 400, 30);
        lb6.setFont(new Font("Raleway",Font.BOLD,18));
        add(lb6);

        JLabel lb7= new JLabel("(It would appear on atm card/cheque Book and Statements)");
        lb7.setBounds(330, 320, 400, 20);
        lb7.setFont(new Font("Raleway", Font.BOLD, 12));
        add(lb7);

        JLabel lb8= new JLabel("PIN:");
        lb8.setBounds(100, 370, 200, 30);
        lb8.setFont(new Font("Raleway",Font.BOLD,18));
        add(lb8);

        JLabel lb9= new JLabel("XXXX");
        lb9.setBounds(330, 370, 200, 30);
        lb9.setFont(new Font("Raleway",Font.BOLD,18));
        add(lb9);

        JLabel lb10= new JLabel("(4-digit Password)");
        lb10.setBounds(100, 400, 200, 20);
        lb10.setFont(new Font("Raleway", Font.BOLD,12));
        add(lb10);

        JLabel lb11= new JLabel("Service Required:");
        lb11.setBounds(100, 450, 200, 30);
        lb11.setFont(new Font("Raleway", Font.BOLD,18));
        add(lb11);

        c1= new JCheckBox("ATM CARD");
        c1.setBounds(100,496,200,30);
        c1.setFont(new Font("Raleway",Font.BOLD,15));
        c1.setBackground(new Color(215,252,252));
        add(c1);

        c2= new JCheckBox("Internet Banking");
        c2.setBounds(300,495,200,30);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBackground(new Color(215,252,252));
        add(c2);

        c3= new JCheckBox("E-statement");
        c3.setBounds(100,530,200,30);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBackground(new Color(215,252,252));
        add(c3);

        c4= new JCheckBox("EMAIL Alerts");
        c4.setBounds(500,495,200,30);
        c4.setFont(new Font("Raleway",Font.BOLD,15));
        c4.setBackground(new Color(215,252,252));
        add(c4);

        c5= new JCheckBox("Mobile Banking");
        c5.setBounds(300,530,200,30);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBackground(new Color(215,252,252));
        add(c5);

        c6= new JCheckBox("Cheque Book");
        c6.setBounds(500,531,250,30);
        c6.setFont(new Font("Raleway",Font.BOLD,15));
        c6.setBackground(new Color(215,252,252));
        add(c6);


        c7 = new JCheckBox("I hereby declares that the above entered details correct to the best of my knowledge.",true);
        c7.setBounds(100,600,550,30);
        c7.setFont(new Font("Raleway",Font.BOLD,13));
        c7.setBackground(new Color(215,252,252));
        add(c7);


        JLabel lb12 = new JLabel(("Form No:"));
        lb12.setBounds(650, 10, 80, 30);
        lb12.setFont(new Font("Raleway", Font.BOLD, 18));
        add(lb12);


        JLabel lb13 = new JLabel((formno));
        lb13.setBounds(700, 10, 60, 30);
        lb13.setFont(new Font("Raleway", Font.BOLD, 18));
        add(lb13);



        bt1 = new JButton("Submit");
        bt1.setBounds(300, 650, 100, 30);
        bt1.setBackground(Color.black);
        bt1.setForeground(Color.white);
        bt1.addActionListener(this);
        add(bt1);


        bt2 = new JButton("Cancel");
        bt2.setBounds(440, 650, 100, 30);
        bt2.setBackground(Color.black);
        bt2.setForeground(Color.white);
        bt2.addActionListener(this);
        add(bt2);



        setLayout(null);
        setSize(850,800);
        setLocation(400,20);
        getContentPane().setBackground(new Color(215,252,252));
        setVisible(true);

    }


    @Override
    public  void actionPerformed(ActionEvent e){
     String atype=null;
     if(r1.isSelected()){
         atype="saving account";
     }
     else if(r2.isSelected()){
         atype="recurring Account";
     }
     else if(r3.isSelected()){
         atype="Fixed account";
     }
     else if(r4.isSelected()){
         atype="current account";
     }

     //for generating pin using Random class
     Random ran=new Random();
     long first7=(ran.nextLong()% 90000000L) + 1409963000000000L ;
     String cardno=""+ Math.abs(first7);

     long first3=(ran.nextLong() % 9000L)+ 1000L;
     String pin="" + Math.abs(first3);

     String sr="";
     if(c1.isSelected()){
         sr=sr+"ATM CARD";
     }
     else if (c2.isSelected()) {
         sr=sr+"Internet Banking";
     }
     else if (c3.isSelected()) {
         sr=sr+"Mobile Banking";
     } else if (c4.isSelected()) {
         sr=sr+"E-statement";
     } else if (c5.isSelected()) {
         sr+="EMAIL alerts";
     }
     else if(c6.isSelected())
     {
         sr+="cheque book";
     }

     try{
         if(e.getSource()==bt1) {
             if (atype.equals("")) {
                 JOptionPane.showMessageDialog(null, "Fill all the fields");
             } else {
                 Connt con1 = new Connt();
                 String q = "insert into Signup3 values('" + formno + "','" + atype + "','" + cardno + "','" + pin + "','" + sr + "')";
                 con1.statement.executeUpdate(q);

                 String q1 = "insert into login values('" + formno + "','" + cardno + "','" + pin + "')";
                 con1.statement.executeUpdate(q1);

                 JOptionPane.showMessageDialog(null,"Card No:"+cardno+"\n Pin:"+pin+" ");
                setVisible(false);
             }
         }

         else if(e.getSource()==bt2){
            System.exit(0);
         }


     }
     catch(Exception E){
         E.printStackTrace();
     }

    }



    public static void main(String[]args){

        new Signup3("");

    }
}
