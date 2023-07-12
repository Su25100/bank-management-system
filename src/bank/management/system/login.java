package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener {
   JLabel label1,label2,label3;

    JTextField tf;
   JPasswordField  pf3;
   JButton bt1,bt2,bt3;
    login(){
         super("BANK MANAGEMENT SYSTEM");
         ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/Bank.jpg"));
         Image i2=i1.getImage().getScaledInstance(130,100, Image.SCALE_DEFAULT);
         ImageIcon i3=new ImageIcon(i2);
         JLabel image=new JLabel(i3);
         image.setBounds(350,10,90,100);
         setLayout(null);
         add(image);

         ImageIcon iii1=new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
       Image iii2=iii1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
       ImageIcon iii3=new ImageIcon(iii2);
       JLabel image1=new JLabel(iii3);
       image1.setBounds(630,350,100,100);
       setLayout(null);
       add(image1);

       label1=new JLabel("WELCOME TO ATM");
       label1.setForeground(Color.white);
       label1.setFont(new Font("Avantgarde",Font.BOLD,38));
       label1.setBounds(230,125,450,40);
        add(label1);

        label2=new JLabel("PIN:");
        label2.setFont(new Font("ralway",Font.BOLD,28));
        label2.setForeground(Color.white);
        label2.setBounds(150,250,375,30);
        add(label2);

        tf=new JTextField(15);
        tf.setBounds(325,190,230,30);
        tf.setFont(new Font("Arial",Font.BOLD,14));
        add(tf);

        label3=new JLabel("CARD:");
        label3.setFont(new Font("ralway",Font.BOLD,28));
        label3.setForeground(Color.white);
        label3.setBounds(150,190,375,30);
        add(label3);

        pf3=new JPasswordField(15);
        pf3.setBounds(325,250,230,30);
        pf3.setFont(new Font("Arial",Font.BOLD,14));
        add(pf3);

        bt1=new JButton("LOGIN");
        bt1.setFont(new Font("ARIAL",Font.BOLD,14));
        bt1.setForeground(Color.WHITE);
        bt1.setBackground(Color.BLACK);
        bt1.setBounds(300,300,100,30);
        bt1.addActionListener(this);
        add(bt1);

        bt3=new JButton("CLEAR");
        bt3.setFont(new Font("ARIAL",Font.BOLD,14));
        bt3.setForeground(Color.WHITE);
        bt3.setBackground(Color.BLACK);
        bt3.setBounds(430,300,100,30);
        bt3.addActionListener(this);
        add(bt3);


        bt2=new JButton("SIGN UP");
        bt2.setFont(new Font("ARIAL",Font.BOLD,14));
        bt2.setForeground(Color.WHITE);
        bt2.setBackground(Color.BLACK);
        bt2.setBounds(300,350,230,30);
        bt2.addActionListener(this);
        add(bt2);


       //background below code is there
       ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
       Image ii2=ii1.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);
       ImageIcon ii3=new ImageIcon(ii2);
       JLabel image2=new JLabel(ii3);
       image2.setBounds(0,0,850,480);
       setLayout(null);
       add(image2);


       //Below is a Frame adjustment code
         setSize(850,480);
         setLocation(450,200);
         setUndecorated(true);             //this line is to remove maximise,minimise,or exit button in the frame

         //whatever stuff u want to display in your frame keep the code above setVisible means setVisible should be placed at the end.
         setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try{
            if(e.getSource()==bt1){
                Connt c1=new Connt();
                String cardno = tf.getText();
                String pin = pf3.getText();
                String q="Select * from login where card_number='"+cardno+"' and pin='"+pin+"' ";
                ResultSet resultset= c1.statement.executeQuery(q);
                if(resultset.next()){
                    setVisible(false);
                    new main_C(pin);
                }

                else{
                    JOptionPane.showMessageDialog(null,"Incorrect card number or pin");
                }

            } else if(e.getSource()==bt3) {
                tf.setText("");
                pf3.setText("");

            } else if(e.getSource()==bt2) {  //button2 -signup

                new Signup();

                setVisible(false);

            }
        }

        catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[]args){
       new login();
   }
}
