package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import java.sql.*;
public class Signup extends JFrame implements ActionListener {

    JRadioButton r1, r2, r3, ms1, ms2, ms3;
    JTextField tname, tfname, em, adr, cty, pcd, stt;

    JDateChooser dateChooser;

    Random ran = new Random();   //code for generating random no in form
    long f4 = (ran.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(f4);

    Signup() {
        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/Bank.jpg"));
        Image i2 = i1.getImage().getScaledInstance(130, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        setLayout(null);
        add(image);

        JLabel lb1 = new JLabel(("APPLICATION FORM NO:" + first));
        lb1.setBounds(160, 20, 600, 40);
        lb1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(lb1);

        JLabel lb2 = new JLabel("Page 1");
        lb2.setBounds(340, 70, 600, 30);
        lb2.setFont(new Font("Raleway", Font.BOLD, 22));
        add(lb2);

        JLabel lb3 = new JLabel("Personal Details");
        lb3.setFont(new Font("Raleway", Font.BOLD, 22));
        lb3.setBounds(290, 100, 600, 30);
        add(lb3);

        //to add columns in the personal details

        JLabel lname = new JLabel("Name");
        lname.setFont(new Font("Raleway", Font.BOLD, 20));
        lname.setBounds(100, 190, 150, 30);
        add(lname);

        tname = new JTextField();
        tname.setFont(new Font("Raleway", Font.BOLD, 14));
        tname.setBounds(300, 190, 400, 30);
        add(tname);

        JLabel lfname = new JLabel("Father's Name");
        lfname.setFont(new Font("Raleway", Font.BOLD, 20));
        lfname.setBounds(100, 240, 200, 30);
        add(lfname);

        tfname = new JTextField();
        tfname.setFont(new Font("Raleway", Font.BOLD, 14));
        tfname.setBounds(300, 240, 400, 30);
        add(tfname);

        JLabel dob = new JLabel("Date of Birth");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 290, 200, 30);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 290, 400, 30);
        dateChooser.setForeground(new Color(105, 105, 105));
        add(dateChooser);

        JLabel g = new JLabel("Gender");
        g.setFont(new Font("Raleway", Font.BOLD, 20));
        g.setBounds(100, 350, 200, 30);
        add(g);

        r1 = new JRadioButton("Male");
        r1.setBackground(new Color(222, 255, 228));
        r1.setBounds(300, 350, 60, 30);
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(r1);

        r2 = new JRadioButton(("Female"));
        r2.setBackground(new Color(222, 255, 228));
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBounds(450, 350, 100, 30);
        add(r2);

        r3 = new JRadioButton(("Transgender"));
        r3.setBackground(new Color(222, 255, 228));
        r3.setFont(new Font("Raleway", Font.BOLD, 14));
        r3.setBounds(600, 350, 130, 30);
        add(r3);


        ButtonGroup bg = new ButtonGroup();
        bg.add(r1);
        bg.add(r2);
        bg.add(r3);

        JLabel email = new JLabel("Email");
        email.setFont((new Font("Raleway", Font.BOLD, 20)));
        email.setBounds(100, 400, 200, 30);
        add(email);

        em = new JTextField();
        em.setBounds(300, 400, 400, 30);
        em.setFont(new Font("Raleway", Font.BOLD, 14));
        add(em);


        JLabel ms = new JLabel("Marital Status");
        ms.setFont((new Font("Raleway", Font.BOLD, 19)));
        ms.setBounds(100, 440, 200, 30);
        add(ms);

        ms1 = new JRadioButton("Married");
        ms1.setBackground(new Color(222, 255, 228));
        ms1.setBounds(300, 440, 80, 30);
        ms1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(ms1);

        ms2 = new JRadioButton(("Unmarried"));
        ms2.setBackground(new Color(222, 255, 228));
        ms2.setBounds(450, 440, 100, 30);
        ms2.setFont(new Font("Raleway", Font.BOLD, 14));
        add(ms2);

        ms3 = new JRadioButton(("Other"));
        ms3.setBackground(new Color(222, 255, 228));
        ms3.setBounds(600, 440, 100, 30);
        ms3.setFont(new Font("Raleway", Font.BOLD, 14));
        add(ms3);

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(ms1);
        bg1.add(ms2);
        bg1.add(ms3);

        JLabel addr = new JLabel("Address");
        addr.setFont((new Font("Raleway", Font.BOLD, 20)));
        addr.setBounds(100, 490, 200, 30);
        add(addr);

        adr = new JTextField();
        adr.setBounds(300, 490, 400, 30);
        adr.setFont(new Font("Raleway", Font.BOLD, 14));
        add(adr);


        JLabel ct = new JLabel("City");
        ct.setFont((new Font("Raleway", Font.BOLD, 20)));
        ct.setBounds(100, 540, 200, 30);
        add(ct);

        cty = new JTextField();
        cty.setBounds(300, 540, 400, 30);
        cty.setFont(new Font("Raleway", Font.BOLD, 14));
        add(cty);

        JLabel pc = new JLabel("Pin Code");
        pc.setFont((new Font("Raleway", Font.BOLD, 20)));
        pc.setBounds(100, 590, 200, 30);
        add(pc);

        pcd = new JTextField();
        pcd.setBounds(300, 590, 400, 30);
        pcd.setFont(new Font("Raleway", Font.BOLD, 14));
        add(pcd);

        JLabel st = new JLabel("State");
        st.setFont((new Font("Raleway", Font.BOLD, 20)));
        st.setBounds(100, 640, 200, 30);
        add(st);

        stt = new JTextField();
        stt.setBounds(300, 640, 400, 30);
        stt.setFont(new Font("Raleway", Font.BOLD, 14));
        add(stt);

        JButton bt = new JButton("Next");
        bt.setBounds(620, 710, 90, 30);
        bt.setBackground(Color.BLACK);
        bt.setForeground(Color.WHITE);
        bt.addActionListener(this);
        add(bt);


        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String lname = tname.getText();
        String lfname = tfname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();

        String g = null;
        if (r1.isSelected()) {
            g = "male";
        } else if (r2.isSelected()) {
            g = "Female";
        } else {
            g = "Transgender";
        }

        String email = em.getText();
        String addr = adr.getText();

        String ms = null;
        if (ms1.isSelected()) {
            ms = "married";
        } else if (ms2.isSelected()) {
            ms = "unmarried";
        } else {
            ms = "other";
        }

        String ct = cty.getText();
        String pc = pcd.getText();
        String st = stt.getText();


        try {
            if (tname.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter your name");
            } else if (tfname.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter the father's name");
            } else if (((JTextField) dateChooser.getDateEditor().getUiComponent()).getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please select the date of birth");
            } else if (!r1.isSelected() && !r2.isSelected() && !r3.isSelected()) {
                JOptionPane.showMessageDialog(null, "Please select a gender");
            } else if (em.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter an email address");
            } else if (adr.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter an address");
            } else if (!ms1.isSelected() && !ms2.isSelected() && !ms3.isSelected()) {
                JOptionPane.showMessageDialog(null, "Please select a marital status");
            } else if (cty.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter the city name");
            } else if (pcd.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter the pincode");
            } else if (stt.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter the state");
            } else {
                Connt con1 = new Connt();
                String q = "INSERT INTO signup VALUES('" + formno + "','" + lname + "','" + lfname + "','" + dob + "','" + g + "','" + email + "','" + ms + "','" + addr + "','" + ct + "','" + pc + "','" + st + "')";
                Statement statement = con1.connection.createStatement();
                con1.statement = statement;

                con1.statement.executeUpdate(q);
                new Signup2();
                setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }

    public static void main(String[] args){

        new Signup();
    }
}
