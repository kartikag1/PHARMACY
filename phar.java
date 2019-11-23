import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.sql.*;

class phar extends JFrame {
 public static void main(String args[]) {
  Connection c = null;
      Statement stmt = null;
      String sql;
      
      try {
         Class.forName("org.sqlite.JDBC");
         c = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/db/kartikkk.db");
         c.setAutoCommit(false);
         System.out.println("Opened database successfully");
         // creating tables

         stmt = c.createStatement();
          sql = "CREATE TABLE IF NOT EXISTS BILLS(CUSTOMER_NAME TEXT NOT NULL,DOCTOR_NAME TEXT,AGE INT,CONTACT INT,PRODUCT1 TEXT,QTY1 INT,RATE1 INT,PRODUCT2 TEXT,QTY2 INT,RATE2 INT,PRODUCT3 TEXT,QTY3 INT,RATE3 INT,PRODUCT4 TEXT,QTY4 INT,RATE4 INT,BILL_DATE TEXT,SPECIAL_CODE TEXT)"; 
         stmt.executeUpdate(sql);
         stmt = c.createStatement();
          sql = "CREATE TABLE IF NOT EXISTS APPARATUS(ID INT PRIMARY KEY NOT NULL,CUSTOMER_NAME TEXT NOT NULL,CONTACT INT NOT NULL,PRODUCT1 TEXT,QTY1 INT,RATE1 INT,PRODUCT2 TEXT,QTY2 INT,RATE2 INT,PRODUCT3 TEXT,QTY3 INT,RATE3 INT,PRODUCT4 TEXT,QTY4 INT,RATE4 INT,FROM_DATE DATE,TO_DATE DATE)"; 
         stmt.executeUpdate(sql);
         stmt = c.createStatement();
          sql = "CREATE TABLE IF NOT EXISTS SUPERUSER(ID TEXT PRIMARY KEY NOT NULL,PASSWORD TEXT NOT NULL)"; 
         stmt.executeUpdate(sql);
         stmt = c.createStatement();
          sql = "CREATE TABLE IF NOT EXISTS STOCK(ID TEXT PRIMARY KEY NOT NULL,PRODUCT_NAME TEXT NOT NULL,QUANTITY INT NOT NULL)";
         stmt.executeUpdate(sql);
         stmt = c.createStatement();
          sql = "CREATE TABLE IF NOT EXISTS PAYMENTS(ID TEXT PRIMARY KEY NOT NULL,PRODUCT_NAME TEXT NOT NULL,QUANTITY INT NOT NULL)";
         stmt.executeUpdate(sql);

           stmt.close();
         c.commit();
         c.close();
      } catch ( Exception e ) {
         System.err.println( e.getClass().getName() + ": " + e.getMessage() );
         System.exit(0);
      }
      System.out.println("PROJECT WORKING FINE");

 //---------------------------------------------
 	JFrame f1 = new JFrame("Login");
    JLabel l2 = new JLabel("Login");
    Font f12 = new Font("TimesRoman", Font.ITALIC, 45);
    l2.setFont(f12);
    l2.setBounds(210, 10, 800, 120);
    JLabel UName = new JLabel("EMPLOYEE ID :");
    //admin no textfield
    JTextField U1Name = new JTextField(20);
    //
    UName.setLabelFor(U1Name);
    UName.setBounds(50, 100, 200, 100);
    U1Name.setBounds(250, 135, 250, 35);
    JLabel UPass = new JLabel("PASSWORD :");
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
      //pharmacy object==============================================================================>
      pharmacyy pharmacyy_main = new pharmacyy();
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