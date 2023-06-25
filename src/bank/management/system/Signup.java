package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Signup extends JFrame {

    JRadioButton r1,r2;
    JTextField tname ,tfname , em ;

    JDateChooser dateChooser;

    Random ran=new Random();   //code for generating random no in form
    long f4=(ran.nextLong() % 9000L) +1000L;
    String first=" "+ Math.abs(f4);

    Signup(){
        super("APPLICATION FORM");
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/Bank.jpg"));
        Image i2=i1.getImage().getScaledInstance(130,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(25,10,100,100);
        setLayout(null);
        add(image);

         JLabel lb1=new JLabel(("APPLICATION FORM NO:"+first));
         lb1.setBounds(160,20,600,40);
         lb1.setFont(new Font("Raleway",Font.BOLD,38));
         add(lb1);

         JLabel lb2=new JLabel("Page 1");
        lb2.setBounds(330,70,600,30);
        lb2.setFont(new Font("Raleway",Font.BOLD,22));
        add(lb2);

        JLabel lb3=new JLabel("Personal Details");
        lb3.setFont(new Font("Raleway",Font.BOLD,22));
        lb3.setBounds(290,90,600,30);
        add(lb3);

        //to add columns in the personal details

        JLabel lname=new JLabel("Name");
        lname.setFont(new Font("Raleway",Font.BOLD,20));
        lname.setBounds(100,190,100,30);
        add(lname);

        tname=new JTextField();
        tname.setFont(new Font("Raleway",Font.BOLD,14));
        tname.setBounds(300,190,400,30);
        add(tname);

        JLabel lfname=new JLabel("Father's Name");
        lfname.setFont(new Font("Raleway",Font.BOLD,20));
        lfname.setBounds(100,240,200,30);
        add(lfname);

        tfname=new JTextField();
        tfname.setFont(new Font("Raleway",Font.BOLD,14));
        tfname.setBounds(300,240,400,30);
        add(tfname);

        JLabel dob=new JLabel("Date of Birth");
        dob.setFont(new Font("Raleway",Font.BOLD,20));
        dob.setBounds(100,290,200,30);
        add(dob);

        dateChooser=new JDateChooser();
        dateChooser.setBounds(300,290,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);

        JLabel g=new JLabel("Gender");
        g.setFont(new Font("Raleway",Font.BOLD,20));
        g.setBounds(100,350,200,30);
        add(g);

        r1=new JRadioButton("Male");
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,350,60,30);
        r1.setFont(new Font("Raleway",Font.BOLD,14));
        add(r1);

        r2=new JRadioButton(("Female"));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,350,90,30);
        add(r2);

        ButtonGroup bg=new ButtonGroup();
        bg.add(r1);
        bg.add(r2);

      JLabel email=new JLabel("Email");
      email.setFont((new Font("Raleway",Font.BOLD,20)));
      email.setBounds(100,400,200,30);
      add(email);

      em=new JTextField();
      em.setBounds(300,400,400,30);
      em.setFont(new Font("Raleway",Font.BOLD,20));
      add(em);








        getContentPane().setBackground(new Color(222,255,228));
        setLayout(null);
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);
    }

    public static void main(String[] args){
        new Signup();
    }
}
