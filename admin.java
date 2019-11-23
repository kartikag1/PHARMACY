
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.sql.*;


class admin extends JFrame {

public admin()


{

JFrame f1 = new JFrame("Login");
    JLabel l2 = new JLabel("Login");
    Font f12 = new Font("TimesRoman", Font.ITALIC, 45);
    l2.setFont(f12);
    l2.setBounds(210, 10, 800, 120);
    JLabel UName = new JLabel("Admin Id:");
    //admin no textfield
    JTextField U1Name = new JTextField(20);
    //
    UName.setLabelFor(U1Name);
    UName.setBounds(50, 100, 200, 100);
    U1Name.setBounds(250, 135, 250, 35);
    JLabel UPass = new JLabel("Password :");
    //shop password textfield
    JPasswordField U1Pass = new JPasswordField(20);
    //
    String x = U1Name.getText();
    UPass.setLabelFor(U1Pass);
    UPass.setBounds(50, 200, 200, 100);
    U1Pass.setBounds(250, 235, 250, 35);
    Font f121 = new Font("TimesRoman", Font.ITALIC, 25);
    UName.setFont(f121);
    UPass.setFont(f121);
    JButton b4 = new JButton("Login");
    b4.setBounds(210, 350, 120, 60);
    b4.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent e) {
      f1.dispose();
      JFrame f2 = new JFrame("Admin");
      //String s = l22.setText(U1Name.getText());
      JLabel l22 = new JLabel("");
      l22.setBounds(70, 30, 70, 100);
      f2.add(l22);
      f2.setSize(600, 800);
      f2.setLayout(null);
      f2.setVisible(true);
     }
    });
    f1.add(l2);
    f1.add(UName);
    f1.add(U1Name);
    f1.add(UPass);
    f1.add(U1Pass);
    f1.add(b4);
    f1.setSize(600, 600);
    f1.setLayout(null);
    f1.setVisible(true);






}




}