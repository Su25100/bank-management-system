package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {

    String pin;
    JLabel l2;
    JButton bt1;
    JTextField tf1;


    BalanceEnquiry(String pin){

        this.pin=pin;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);


        JLabel l1=new JLabel("Your current balance is Rs ");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System",Font.BOLD,16));
        l1.setBounds(430,180,700,35);
        l3.add(l1);

        l2=new JLabel();
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("System",Font.BOLD,16));
        l2.setBounds(430,220,400,35);
        l3.add(l2);

        bt1=new JButton("BACK");
        bt1.setBounds(700,406,150,35);
        bt1.setBackground(new Color(65,125,128));
        bt1.setForeground(Color.WHITE);
        bt1.addActionListener(this);
        l3.add(bt1);



        int balance=0;
        try{
            Connt c1=new Connt();
            ResultSet rs=c1.statement.executeQuery("Select * from bank where pin='"+pin+"'") ;
            while (rs.next()) {
                if(rs.getString("type").equals("Deposit")){
                    balance+=Integer.parseInt(rs.getString("amount"));

                }

                else{
                    balance-=Integer.parseInt(rs.getString("amount"));
                }
            }
        }
        catch (Exception E){
            E.printStackTrace();
        }

        l2.setText(""+balance);


        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public  void actionPerformed(ActionEvent e){
    setVisible(false);
    new main_C(pin);

    }

    public static  void main(String[]args){
        new BalanceEnquiry("");
    }
}
