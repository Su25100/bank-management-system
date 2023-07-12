package bank.management.system;

import com.mysql.cj.protocol.Resultset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.*;
public class Withdrwl extends JFrame implements ActionListener {
    String pin;
    JTextField tf1;
    JButton bt1,bt2;


    Withdrwl(String pin) {

        this.pin=pin;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel l1=new JLabel("MAXIMUM WITHDRAWAL IS RS.1,00,000");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System",Font.BOLD,16));
        l1.setBounds(460,180,700,35);
        l3.add(l1);

        JLabel l2=new JLabel("PLEASE ENTER YOUR AMOUNT");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("System",Font.BOLD,16));
        l2.setBounds(460,220,700,35);
        l3.add(l2);

        tf1=new JTextField();
        tf1.setBounds(460,260,320,25);
        tf1.setFont(new Font("Raleway",Font.BOLD,22));
        tf1.setBackground(new Color(65,125,128));
        tf1.setForeground(Color.white);
        l3.add(tf1);

        bt1=new JButton("WITHDRAWAL");
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
        if(e.getSource()==bt1) {

            try {
                String amount = tf1.getText();
                Date date = new Date();

                if (tf1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw");
                } else {
                    Connt con1 = new Connt();
                    ResultSet rs = con1.statement.executeQuery("select * from bank where pin='" + pin + "' ");
                    int balance = 0;
                    while (rs.next()) {
                        if (rs.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(rs.getString("amount"));

                        } else {
                            balance -= Integer.parseInt(rs.getString("amount"));
                        }
                    }

                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }

                    con1.statement.executeUpdate("insert into bank values('" + pin + "','" + date + "','withdrawal','" + amount + "') ");
                    JOptionPane.showMessageDialog(null, "Rs." + amount + " Debited Successfully");

                }


            } catch (Exception E) {
                E.printStackTrace();
            }
        }

        else if(e.getSource()==bt2){
            setVisible(false);
            new main_C(pin);
        }


    }



        public static void main(String[]args){
            new Withdrwl("");
    }
}
