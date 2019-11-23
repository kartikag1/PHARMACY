//to run this :

//javac pharmacyy.java

//java -cp ".;sqlite-jdbc-3.27.2.1.jar" pharmacyy










import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.sql.*;
class pharmacyy extends JFrame {
 public pharmacyy() {
    // database setup ------------------------------------------------->
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
      // --------------------------------------------------------------------------------------------->





// frontend ------------------------------------------------------------------------------------------->
  JFrame ff = new JFrame("Pharmacy Management");
  JLabel l = new JLabel("Pharmacy Management");
  Font f12 = new Font("TimesRoman", Font.ITALIC, 25);
  l.setFont(f12);
  l.setBounds(150, 10, 450, 250);
  JButton b = new JButton("Generate Bills");
  b.setBounds(190, 230, 180, 100);
  b.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {

    ff.dispose();

// generate constructor called ================================================>>>>>>>>>>>>>>>

    generate obj = new generate();
   }
  });
  JButton b1 = new JButton("Apparatus");
  b1.setBounds(190, 380, 180, 100);
  b1.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    ff.dispose();
    apparatus app_obj = new apparatus();
    
   }
  });



  JButton b2 = new JButton("Admin");
  
  b2.setBounds(190, 530, 180, 100);
  b2.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    ff.dispose();
    admin admin_obj = new admin();
    
   }
  });
  ff.add(b);
  ff.add(b1);
  ff.add(b2);
  ff.add(l);
  ff.setLayout(null);
  ff.setSize(600, 800);
  ff.setVisible(true);
 }
}
