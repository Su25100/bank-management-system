package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
public class Pinchange extends JFrame implements ActionListener {

    JButton bt1,bt2;
    JPasswordField p1,p2;
    JTextField tf1;
    String pin;
    Pinchange(String pin){

        this.pin=pin;

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2=i1.getImage().getScaledInstance(1550,830, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel l3=new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel l1=new JLabel("CHANGE YOUR PIN");
        l1.setForeground(Color.WHITE);
        l1.setFont(new Font("System",Font.BOLD,16));
        l1.setBounds(430,180,400,35);
        l3.add(l1);

        JLabel l2=new JLabel("NEW PIN:");
        l2.setForeground(Color.WHITE);
        l2.setFont(new Font("System",Font.BOLD,16));
        l2.setBounds(430,220,150,35);
        l3.add(l2);

        p1=new JPasswordField();
        p1.setBounds(600,220,180,25);
        p1.setFont(new Font("Raleway",Font.BOLD,22));
        p1.setBackground(new Color(65,125,128));
        p1.setForeground(Color.white);
        l3.add(p1);


        JLabel lb3=new JLabel("RE-ENTER NEW PIN:");
        lb3.setForeground(Color.WHITE);
        lb3.setFont(new Font("System",Font.BOLD,16));
        lb3.setBounds(430,250,400,35);
        l3.add(lb3);

        p2=new JPasswordField();
        p2.setBounds(600,255,180,25);
        p2.setFont(new Font("Raleway",Font.BOLD,22));
        p2.setBackground(new Color(65,125,128));
        p2.setForeground(Color.white);
        l3.add(p2);


        bt1=new JButton("CHANGE");
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
    public  void actionPerformed(ActionEvent e){

        try{
        String pin1=p1.getText();
        String pin2=p2.getText();

        if(!pin1.equals(pin2)){
            JOptionPane.showMessageDialog(null,"Entered pin does not match");
            return;
        }
        if(e.getSource()==bt1){
            if(p1.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Enter New Pin");
               return;
            }
            if(p2.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Re-enter New Pin");
            return;
            }

            Connt c=new Connt();
            String q1="update bank set pin= '"+pin1+"' where pin= '"+pin+"'   ";
            String q2="update login set pin= '"+pin1+"' where pin= '"+pin+"'   ";
            String q3="update signup3 set pin= '"+pin1+"' where pin= '"+pin+"'   ";

            c.statement.executeUpdate(q1);
            c.statement.executeUpdate(q2);
            c.statement.executeUpdate(q3);

            JOptionPane.showMessageDialog(null,"Pin changed Successfully");
            setVisible(false);
            new main_C(pin);

        }
            else if (e.getSource()==bt2) {
            new main_C(pin);
            setVisible(false);

        }


        }

        catch(Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[]args){
        new Pinchange("");
    }

}
