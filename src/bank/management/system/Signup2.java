package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {

    JComboBox  comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField pancard,adhar;
    JRadioButton rb1,rb2,rb3,rb4;

    JButton btn1;
    String formno;
    Signup2(String first){
        super("APPLICATION FORM");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/Bank.jpg"));
        Image i2 = i1.getImage().getScaledInstance(110, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 120, 100);
        add(image);

       // to add form no same that of signup page 1
        this.formno=formno;

        JLabel lb1 = new JLabel(("Page 2:"));
        lb1.setBounds(300, 30, 600, 40);
        lb1.setFont(new Font("Raleway", Font.BOLD, 22));
        add(lb1);

        JLabel lb2 = new JLabel(("Additional Details:"));
        lb2.setBounds(300, 60, 600, 40);
        lb2.setFont(new Font("Raleway", Font.BOLD, 22));
        add(lb2);

        JLabel lb3 = new JLabel(("Religion:"));
        lb3.setBounds(100, 120, 100, 30);
        lb3.setFont(new Font("Raleway", Font.BOLD, 18));
        add(lb3);

        String []religion={"Hindu","Muslim","sikh","Catholicism","Buddhism","Other"};
        comboBox=new JComboBox(religion);
        comboBox.setBackground(Color.WHITE);
        comboBox.setFont(new Font ("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel lb4 = new JLabel(("Category:"));
        lb4.setBounds(100, 170, 100, 30);
        lb4.setFont(new Font("Raleway", Font.BOLD, 18));
        add(lb4);

        String []category={"General","OBC","SC","ST","Other"};
        comboBox2 = new JComboBox(category);
        //comboBox.setBackground(new Color(252,208,76));  Have replace this code with setbackground
        comboBox2.setBackground(Color.WHITE);
        comboBox2.setFont(new Font ("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,170,320,30);
        add(comboBox2);

        JLabel lb5 = new JLabel(("Income:"));
        lb5.setBounds(100, 220, 100, 30);
        lb5.setFont(new Font("Raleway", Font.BOLD, 18));
        add(lb5);

        String []income={"NULL","<1,50,000","<2,50,000","5,00,000","upto 10,00,000","Above 10,00,000"};
        comboBox3 = new JComboBox(income);
        //comboBox.setBackground(new Color(252,208,76));  Have replace this code with setbackground
        comboBox3.setBackground(Color.WHITE);
        comboBox3.setFont(new Font ("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,220,320,30);
        add(comboBox3);

        JLabel lb6 = new JLabel(("Education :"));
        lb6.setBounds(100, 270, 190, 30);
        lb6.setFont(new Font("Raleway", Font.BOLD, 18));
        add(lb6);

        String [] eduqual={"Non-graduate","graduate","postgraduate","Doctorate","other"};
        comboBox4 = new JComboBox(eduqual);
        //comboBox.setBackground(new Color(252,208,76));   Have replace this code with setbackground
        comboBox4.setBackground(Color.WHITE);
        comboBox4.setFont(new Font ("Raleway",Font.BOLD,14));
        comboBox4.setBounds(350,270,320,30);
        add(comboBox4);

        JLabel lb7 = new JLabel(("Occupation:"));
        lb7.setBounds(100, 320, 130, 30);
        lb7.setFont(new Font("Raleway", Font.BOLD, 18));
        add(lb7);

        String []occ={"Salaried","self-employed","Buisness","Student","Retired","Others"};
        comboBox5 = new JComboBox(occ);
        //comboBox.setBackground(new Color(252,208,76));   Have replace this code with setbackground
        comboBox5.setBackground(Color.WHITE);
        comboBox5.setFont(new Font ("Raleway",Font.BOLD,14));
        comboBox5.setBounds(350,320,320,30);
        add(comboBox5);

        JLabel lb8 = new JLabel(("Pan No:"));
        lb8.setBounds(100, 370, 130, 30);
        lb8.setFont(new Font("Raleway", Font.BOLD, 18));
        add(lb8);

        pancard = new JTextField();
        pancard.setBounds(350,370, 320, 30);
        pancard.setFont(new Font("Raleway", Font.BOLD, 14));
        add(pancard);

        JLabel lb9 = new JLabel(("Adhar No:"));
        lb9.setBounds(100, 420, 130, 30);
        lb9.setFont(new Font("Raleway", Font.BOLD, 18));
        add(lb9);

        adhar = new JTextField();
        adhar.setBounds(350,420, 320, 30);
        adhar.setFont(new Font("Raleway", Font.BOLD, 14));
        add(adhar);

        JLabel lb10 = new JLabel(("Senior Citizen:"));
        lb10.setBounds(100, 470, 180, 30);
        lb10.setFont(new Font("Raleway", Font.BOLD, 18));
        add(lb10);

        rb1 = new JRadioButton("YES");
        rb1.setBackground(new Color(252, 208, 76));
        rb1.setBounds(350, 470, 100, 30);
        rb1.setFont(new Font("Raleway", Font.BOLD, 14));
        add(rb1);

        rb2 = new JRadioButton(("NO"));
        rb2.setBackground(new Color(252, 208, 76));
        rb2.setFont(new Font("Raleway", Font.BOLD, 14));
        rb2.setBounds(460,470, 100, 30);
        add(rb2);

        ButtonGroup bg = new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);

        JLabel lb11 = new JLabel(("Existing Account:"));
        lb11.setBounds(100, 520, 180, 30);
        lb11.setFont(new Font("Raleway", Font.BOLD, 18));
        add(lb11);

        rb3 = new JRadioButton("YES");
        rb3.setBackground(new Color(252, 208, 76));
        rb3.setBounds(350, 520, 100, 30);
        rb3.setFont(new Font("Raleway", Font.BOLD, 14));
        add(rb3);

        rb4 = new JRadioButton("NO");
        rb4.setBackground(new Color(252, 208, 76));
        rb4.setBounds(460, 520, 100, 30);
        rb4.setFont(new Font("Raleway", Font.BOLD, 14));
        add(rb4);

        ButtonGroup bg1 = new ButtonGroup();
        bg1.add(rb3);
        bg1.add(rb4);

        JLabel lb12 = new JLabel(("Form No:"));
        lb12.setBounds(650, 10, 80, 30);
        lb12.setFont(new Font("Raleway", Font.BOLD, 18));
        add(lb12);

        JLabel lb13 = new JLabel((formno));
        lb13.setBounds(700, 10, 60, 30);
        lb13.setFont(new Font("Raleway", Font.BOLD, 18));
        add(lb13);


        //button code below

        btn1 = new JButton("Next");
        btn1.setBounds(600, 640, 100, 30);
        btn1.setBackground(Color.white);
        btn1.setForeground(Color.black);
        btn1.addActionListener(this);
        add(btn1);


        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        getContentPane().setBackground(new Color(252,208,76));
        setVisible(true);
    }

    @Override
    public  void actionPerformed(ActionEvent e){
         String rel=(String)comboBox.getSelectedItem();
         String categ=(String)comboBox2.getSelectedItem();
         String  inc=(String)comboBox3.getSelectedItem();
         String edu=(String)comboBox4.getSelectedItem();
         String occ=(String)comboBox5.getSelectedItem();

         String pan=pancard.getText();
         String adhr=adhar.getText();

         String  sc=" ";
         if(rb1.isSelected()){
             sc="Yes";
         }
         else{
             sc="No";
         }

         String eacc=" ";
         if(rb2.isSelected()){
             eacc="Yes";
         }
         else{
             eacc="No";
         }

         try{
             if(pancard.getText().equals(" ") || adhar.getText().equals(" ")){

                 JOptionPane.showMessageDialog(null,"Fill all the fields");
             }

             else{
                 Connt c1=new Connt();
                 String q="insert into Signup2 values('"+formno+"','"+rel+"','"+categ+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+adhr+"','"+sc+"','"+eacc+"')";
                 c1.statement.executeUpdate(q);

                 new Signup3();
                 setVisible(false);
             }
         }
         catch(Exception E){
             E.printStackTrace();
         }



    }

    public static void main(String[] args) {
           new Signup2("");
    }
}