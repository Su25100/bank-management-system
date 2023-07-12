package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class Deposit extends JFrame implements ActionListener {

    String pin;
    JTextField tf1;
    JButton bt1,bt2;
    Deposit(String pin)
    {
        this.pin=pin;

        //designing ATM simulator

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel l1=new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT:");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System",Font.BOLD,16));
        l1.setBounds(460,180,400,35);
        l3.add(l1);


        tf1=new JTextField();
        tf1.setBounds(460,230,320,25);
        tf1.setFont(new Font("Raleway",Font.BOLD,22));
        tf1.setBackground(new Color(65,125,128));
        tf1.setForeground(Color.white);
        l3.add(tf1);

        bt1=new JButton("DEPOSIT");
        bt1.setBounds(700,362,150,35);
        bt1.setBackground(new Color(65,125,128));
        bt1.setForeground(Color.WHITE);
        bt1.addActionListener(this);
        l3.add(bt1);

        bt2=new JButton("BACK");
        bt2.setBounds(700,406,150,35);
        bt2.setForeground(Color.WHITE);
        bt2.setBackground(new Color(65,125,128));
        bt2.addActionListener(this);
        l3.add(bt2);



        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public  void actionPerformed(ActionEvent e) {
        try{
            String amount=tf1.getText();

            Date date=new Date();

            if(e.getSource()==bt1){
                if(tf1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter the amount you want to Deposit");
                }
                else{
                    Connt c1=new Connt();
                    c1.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Rs."+amount+" Deposited successfully");
                    setVisible(false);
                    new main_C(pin);
                }
            } else if (e.getSource()==bt2) {
                setVisible(false);

            }
        }
        catch(Exception E){
            E.printStackTrace();
        }

    }
    public static void main(String[]args){
        new Deposit("");

    }
}
