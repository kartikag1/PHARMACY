//to run this :

//javac pharmacyy.java

//java -cp ".;sqlite-jdbc-3.27.2.1.jar" pharmacyy

// code for special customer = special12









// packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.sql.*;

// class decleration
class pharmacyy1 extends JFrame {
 public static void main(String args[]) {
  
  
  // database setup ------------------------------------------------->
  Connection c = null;
  Statement stmt = null;
  String sql;
  try {
   Class.forName("org.sqlite.JDBC");
   c = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/db/kartikkkk.db");
   c.setAutoCommit(false);
   System.out.println("Opened database successfully");
   // creating tables

   stmt = c.createStatement();
   sql = "CREATE TABLE IF NOT EXISTS BILLS(CUSTOMER_NAME TEXT NOT NULL,DOCTOR_NAME TEXT,AGE INT,CONTACT INT,PRODUCT1 TEXT,QTY1 INT,RATE1 INT,PRODUCT2 TEXT,QTY2 INT,RATE2 INT,PRODUCT3 TEXT,QTY3 INT,RATE3 INT,PRODUCT4 TEXT,QTY4 INT,RATE4 INT,BILL_DATE TEXT,SPECIAL_CODE TEXT)";
   stmt.executeUpdate(sql);
   stmt = c.createStatement();
   sql = "CREATE TABLE IF NOT EXISTS APPARATUS(CUSTOMER_NAME TEXT NOT NULL,CONTACT INT,PRODUCT1 TEXT,QTY1 INT,RATE1 INT,PRODUCT2 TEXT,QTY2 INT,RATE2 INT,PRODUCT3 TEXT,QTY3 INT,RATE3 INT,PRODUCT4 TEXT,QTY4 INT,RATE4 INT,FROM_DATE TEXT,TO_DATE TEXT)";
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
  } catch (Exception e) {
   System.err.println(e.getClass().getName() + ": " + e.getMessage());
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
    JFrame f = new JFrame("PHARMACY MANAGEMENT");
    f.setTitle("BILL GENERATION");
    //DATE

    JTextField t15 = new JTextField("");
    t15.setBounds(5, 10, 150, 30);

    //DATE ACTION HH:mm:ss
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy ");
    LocalDateTime now = LocalDateTime.now();
    t15.setText(dtf.format(now));
    t15.setEditable(false);
    t15.setHorizontalAlignment(JTextField.CENTER);
    f.add(t15);

    //CUSTOMER NAME
    JTextField t2 = new JTextField("CUSTOMER NAME");
    t2.setHorizontalAlignment(JTextField.CENTER);
    t2.setBounds(10, 50, 150, 30);
    f.add(t2);


    //AGE
    JTextField t3 = new JTextField("AGE");
    t3.setBounds(170, 50, 40, 30);
    t3.setHorizontalAlignment(JTextField.CENTER);
    f.add(t3);


    //CONTACT
    JTextField t4 = new JTextField("CONTACT");
    t4.setBounds(220, 50, 150, 30);
    t4.setHorizontalAlignment(JTextField.CENTER);
    f.add(t4);


    //DOCTOR NAME
    JTextField t5 = new JTextField("DR ");
    t5.setBounds(380, 50, 150, 30);
    t5.setHorizontalAlignment(JTextField.CENTER);
    f.add(t5);


    //PRODUCTS
    JTextField t6 = new JTextField("PRODUCTS");
    t6.setBounds(220, 100, 150, 30);
    t6.setEditable(false);
    t6.setHorizontalAlignment(JTextField.CENTER);
    f.add(t6);

    //NAME
    JTextField t7 = new JTextField("NAME");
    t7.setBounds(50, 150, 150, 30);
    t7.setEditable(false);
    t7.setHorizontalAlignment(JTextField.CENTER);
    f.add(t7);

    //RATE
    JTextField t8 = new JTextField("RATE");
    t8.setBounds(220, 150, 150, 30);
    t8.setEditable(false);
    t8.setHorizontalAlignment(JTextField.CENTER);
    f.add(t8);

    //QTY
    JTextField t9 = new JTextField("QTY");
    t9.setBounds(390, 150, 150, 30);
    t9.setEditable(false);
    t9.setHorizontalAlignment(JTextField.CENTER);
    f.add(t9);

    //ENTRY 1
    JTextField t10 = new JTextField("");
    t10.setBounds(50, 200, 150, 30);
    t10.setHorizontalAlignment(JTextField.CENTER);
    f.add(t10);

    //ENTRY 1
    JTextField t11 = new JTextField("");
    t11.setBounds(220, 200, 150, 30);
    t11.setHorizontalAlignment(JTextField.CENTER);
    f.add(t11);

    //ENTRY 1
    JTextField t12 = new JTextField("");
    t12.setBounds(390, 200, 150, 30);
    t12.setHorizontalAlignment(JTextField.CENTER);
    f.add(t12);

    //ENTRY 2
    JTextField t13 = new JTextField("");
    t13.setBounds(50, 250, 150, 30);
    t13.setHorizontalAlignment(JTextField.CENTER);
    f.add(t13);

    //ENTRY 2
    JTextField t14 = new JTextField("");
    t14.setBounds(220, 250, 150, 30);
    t14.setHorizontalAlignment(JTextField.CENTER);
    f.add(t14);

    //ENTRY 2
    JTextField t16 = new JTextField("");
    t16.setBounds(390, 250, 150, 30);
    t16.setHorizontalAlignment(JTextField.CENTER);
    f.add(t16);


    //ENTRY 3
    JTextField t161 = new JTextField("");
    t161.setBounds(50, 300, 150, 30);
    t161.setHorizontalAlignment(JTextField.CENTER);
    f.add(t161);

    //ENTRY 3
    JTextField t17 = new JTextField("");
    t17.setBounds(220, 300, 150, 30);
    t17.setHorizontalAlignment(JTextField.CENTER);
    f.add(t17);

    //ENTRY 3
    JTextField t18 = new JTextField("");
    t18.setBounds(390, 300, 150, 30);
    t18.setHorizontalAlignment(JTextField.CENTER);
    f.add(t18);

    //ENTRY 4
    JTextField t19 = new JTextField("");
    t19.setBounds(50, 350, 150, 30);
    t19.setHorizontalAlignment(JTextField.CENTER);
    f.add(t19);

    //ENTRY 4
    JTextField t20 = new JTextField("");
    t20.setBounds(220, 350, 150, 30);
    t20.setHorizontalAlignment(JTextField.CENTER);
    f.add(t20);

    //ENTRY 4
    JTextField t21 = new JTextField("");
    t21.setBounds(390, 350, 150, 30);
    t21.setHorizontalAlignment(JTextField.CENTER);
    f.add(t21);

    //NUMBERING 4

    JTextField t22 = new JTextField("4");
    t22.setBounds(10, 350, 30, 30);
    t22.setEditable(false);
    t22.setHorizontalAlignment(JTextField.CENTER);
    f.add(t22);

    //NUMBERING 3

    JTextField t23 = new JTextField("3");
    t23.setBounds(10, 300, 30, 30);
    t23.setEditable(false);
    t23.setHorizontalAlignment(JTextField.CENTER);
    f.add(t23);


    //NUMBERING 2 

    JTextField t24 = new JTextField("2");
    t24.setBounds(10, 250, 30, 30);
    t24.setEditable(false);
    t24.setHorizontalAlignment(JTextField.CENTER);
    f.add(t24);


    //NUMBERING 1

    JTextField t25 = new JTextField("1");
    t25.setBounds(10, 200, 30, 30);
    t25.setEditable(false);
    t25.setHorizontalAlignment(JTextField.CENTER);
    f.add(t25);

    //SPECIAL CUSTOMER
    JLabel t262 = new JLabel("SPECIAL CUSTOMER");
    t262.setBounds(10, 450, 150, 30);
    t262.setHorizontalAlignment(JTextField.CENTER);
    f.add(t262);
    JTextField t26 = new JTextField("");
    t26.setBounds(10, 500, 150, 30);
    t26.setHorizontalAlignment(JTextField.CENTER);
    f.add(t26);






    //EXIT
    JButton b4 = new JButton("CONFIRM");
    b4.setBounds(500, 450, 150, 30);
    f.add(b4);

    //action listen exit

    b4.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent e) {
      f.dispose();
      Connection c = null;
      Statement stmt = null;
      String sql;
      String namevalue = t2.getText();
      String agevalue = t3.getText();
      if (agevalue == "AGE") {
       agevalue = "0";
      }
      String contactvalue = t4.getText();
      if (contactvalue == "CONTACT") {
       contactvalue = "0";
      }
      String doctorvalue = t5.getText();
      if (doctorvalue == "DR") {
       doctorvalue = "-";
      }
      String namevalue1 = t10.getText();
      if (namevalue1 == "") {
       namevalue1 = "-";
      }
      String ratevalue1 = t11.getText();
      if (ratevalue1 == "") {
       ratevalue1 = "0";
      }
      String qtyvalue1 = t12.getText();
      if (qtyvalue1 == "") {
       qtyvalue1 = "0";
      }
      String namevalue2 = t13.getText();
      if (namevalue2 == "") {
       namevalue2 = "-";
      }
      String ratevalue2 = t14.getText();
      if (ratevalue2 == "") {
       ratevalue2 = "0";
      }
      String qtyvalue2 = t16.getText();
      if (qtyvalue2 == "") {
       qtyvalue2 = "0";
      }
      String namevalue3 = t161.getText();
      if (namevalue3 == "") {
       namevalue3 = "-";
      }
      String ratevalue3 = t17.getText();
      if (ratevalue3 == "") {
       ratevalue3 = "0";
      }
      String qtyvalue3 = t18.getText();
      if (qtyvalue3 == "") {
       qtyvalue3 = "0";
      }
      String namevalue4 = t19.getText();
      if (namevalue4 == "") {
       namevalue4 = "-";
      }
      String ratevalue4 = t20.getText();
      if (ratevalue4 == "") {
       ratevalue4 = "0";
      }
      String qtyvalue4 = t21.getText();
      if (qtyvalue4 == "") {
       qtyvalue4 = "0";
      }
      String specialcode = t26.getText();
      System.out.println("specialcode" + specialcode);

      System.out.println("specialcode" + specialcode);
      int tp1, tp2, tp3, tp4, total, disc = 0, totalconst;
      try {
       Class.forName("org.sqlite.JDBC");
       c = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/db/kartikkkk.db");
       c.setAutoCommit(false);
       System.out.println("Opened database successfully");
       stmt = c.createStatement();
       sql = "INSERT INTO BILLS(CUSTOMER_NAME,DOCTOR_NAME,AGE,CONTACT,PRODUCT1,RATE1,QTY1,PRODUCT2,RATE2,QTY2,PRODUCT3,RATE3,QTY3,PRODUCT4,RATE4,QTY4,BILL_DATE,SPECIAL_CODE)VALUES (" + "'" + namevalue + "'" + "," + "'" + doctorvalue + "'" + "," + Integer.parseInt(agevalue) + "," + Integer.parseInt(contactvalue) + "," + "'" + namevalue1 + "'" + "," + Integer.parseInt(ratevalue1) + "," + Integer.parseInt(qtyvalue1) + "," + "'" + namevalue2 + "'" + "," + Integer.parseInt(ratevalue2) + "," + Integer.parseInt(qtyvalue2) + "," + "'" + namevalue3 + "'" + "," + Integer.parseInt(ratevalue3) + "," + Integer.parseInt(qtyvalue3) + ",'" + namevalue4 + "'," + Integer.parseInt(ratevalue4) + "," + Integer.parseInt(qtyvalue4) + "," + "'" + dtf.format(now) + "'," + "'" + specialcode + "'" + ");"; //sql = "INSERT INTO BILLS VALUES("+namevalue+","+doctorvalue+","+Integer.parseInt(agevalue)+","+Integer.parseInt(contactvalue)+","+namevalue1+","+Integer.parseInt(ratevalue1)+","+Integer.parseInt(qtyvalue1)+","+namevalue2+","+Integer.parseInt(ratevalue2)+","+Integer.parseInt(qtyvalue2)+","+namevalue3+","+Integer.parseInt(ratevalue3)+","+Integer.parseInt(qtyvalue3)+","+namevalue4+","+Integer.parseInt(ratevalue4)+","+Integer.parseInt(qtyvalue4)+","+dtf.format(now)+");";
       stmt.executeUpdate(sql);
       System.out.println("Added Bill Data-------------------------------------------------------------------------------------------");
       System.out.println("customer name= " + namevalue);
       System.out.println("doctor name= " + doctorvalue);
       System.out.println("Age= " + agevalue);
       System.out.println("contact= " + contactvalue);
       System.out.println("product 1= " + namevalue1 + "	" + ratevalue1 + "	" + qtyvalue1);
       System.out.println("product 2= " + namevalue2 + "	" + ratevalue2 + "	" + qtyvalue2);
       System.out.println("product 3= " + namevalue3 + "	" + ratevalue3 + "	" + qtyvalue3);
       System.out.println("product 4= " + namevalue4 + "	" + ratevalue4 + "	" + qtyvalue4);
       tp1 = (Integer.parseInt(ratevalue1)) * (Integer.parseInt(qtyvalue1));
       tp2 = (Integer.parseInt(ratevalue2)) * (Integer.parseInt(qtyvalue2));
       tp3 = (Integer.parseInt(ratevalue3)) * (Integer.parseInt(qtyvalue3));
       tp4 = (Integer.parseInt(ratevalue4)) * (Integer.parseInt(qtyvalue4));
       totalconst = tp1 + tp2 + tp3 + tp4;
       total = tp1 + tp2 + tp3 + tp4;
       disc = 0;
       if (specialcode == "special12") {
        disc = 10 * total;
        disc = disc / 100;
       }
       total = total - disc;
       System.out.println(tp1 + " " + tp2 + " " + tp3 + " " + tp4 + " " + total);
       // ADD HERE CONFIRMATION SCREEN AND PDF GENERATION

       JFrame f121 = new JFrame("Bill");

       //DATE

       JTextField bt15 = new JTextField("");
       bt15.setBounds(5, 10, 150, 30);

       //DATE ACTION HH:mm:ss
       DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy ");
       LocalDateTime now = LocalDateTime.now();
       bt15.setText(dtf.format(now));
       bt15.setEditable(false);
       bt15.setHorizontalAlignment(JTextField.CENTER);
       f121.add(bt15);

       //CUSTOMER NAME
       JTextField bt2 = new JTextField(namevalue);
       bt2.setHorizontalAlignment(JTextField.CENTER);
       bt2.setEditable(false);
       bt2.setBounds(10, 50, 150, 30);
       f121.add(bt2);


       //AGE
       JTextField bt3 = new JTextField(agevalue);
       bt3.setBounds(170, 50, 40, 30);
       bt3.setEditable(false);
       bt3.setHorizontalAlignment(JTextField.CENTER);
       f121.add(bt3);


       //CONTACT
       JTextField bt4 = new JTextField(contactvalue);
       bt4.setBounds(220, 50, 150, 30);
       bt4.setEditable(false);
       bt4.setHorizontalAlignment(JTextField.CENTER);
       f121.add(bt4);


       //DOCTOR NAME
       JTextField bt5 = new JTextField(doctorvalue);
       bt5.setBounds(380, 50, 150, 30);
       bt5.setEditable(false);
       bt5.setHorizontalAlignment(JTextField.CENTER);
       f121.add(bt5);


       //PRODUCTS
       JTextField bt6 = new JTextField("PRODUCTS");
       bt6.setBounds(220, 100, 150, 30);
       bt6.setEditable(false);
       bt6.setHorizontalAlignment(JTextField.CENTER);
       f121.add(bt6);

       //NAME
       JTextField bt7 = new JTextField("NAME");
       bt7.setBounds(50, 150, 150, 30);
       bt7.setEditable(false);
       bt7.setHorizontalAlignment(JTextField.CENTER);
       f121.add(bt7);

       //RATE
       JTextField bt8 = new JTextField("RATE");
       bt8.setBounds(220, 150, 150, 30);
       bt8.setEditable(false);
       bt8.setHorizontalAlignment(JTextField.CENTER);
       f121.add(bt8);

       //QTY
       JTextField bt9 = new JTextField("QTY");
       bt9.setBounds(390, 150, 150, 30);
       bt9.setEditable(false);
       bt9.setHorizontalAlignment(JTextField.CENTER);
       f121.add(bt9);

       //Total
       JTextField bt90 = new JTextField("TOTAL");
       bt90.setBounds(560, 150, 150, 30);
       bt90.setEditable(false);
       bt90.setHorizontalAlignment(JTextField.CENTER);
       f121.add(bt90);

       //ENTRY 1
       JTextField bt10 = new JTextField(namevalue1);
       bt10.setBounds(50, 200, 150, 30);
       bt10.setEditable(false);
       bt10.setHorizontalAlignment(JTextField.CENTER);
       f121.add(bt10);

       //ENTRY 1
       JTextField bt11 = new JTextField(ratevalue1);
       bt11.setBounds(220, 200, 150, 30);
       bt11.setEditable(false);
       bt11.setHorizontalAlignment(JTextField.CENTER);
       f121.add(bt11);

       //ENTRY 1
       JTextField bt12 = new JTextField(qtyvalue1);
       bt12.setBounds(390, 200, 150, 30);
       bt12.setEditable(false);
       bt12.setHorizontalAlignment(JTextField.CENTER);
       f121.add(bt12);

       //multiply 1
       JTextField bt30 = new JTextField(Integer.toString(tp1));
       bt30.setBounds(560, 200, 150, 30);
       bt30.setEditable(false);
       bt30.setHorizontalAlignment(JTextField.CENTER);
       f121.add(bt30);

       //ENTRY 2
       JTextField bt13 = new JTextField(namevalue2);
       bt13.setBounds(50, 250, 150, 30);
       bt13.setEditable(false);
       bt13.setHorizontalAlignment(JTextField.CENTER);
       f121.add(bt13);

       //ENTRY 2
       JTextField bt14 = new JTextField(ratevalue2);
       bt14.setBounds(220, 250, 150, 30);
       bt14.setEditable(false);
       bt14.setHorizontalAlignment(JTextField.CENTER);
       f121.add(bt14);

       //ENTRY 2
       JTextField bt16 = new JTextField(qtyvalue2);
       bt16.setBounds(390, 250, 150, 30);
       bt16.setEditable(false);
       bt16.setHorizontalAlignment(JTextField.CENTER);
       f121.add(bt16);

       //multiply 2
       JTextField bt31 = new JTextField(Integer.toString(tp2));
       bt31.setBounds(560, 250, 150, 30);
       bt31.setEditable(false);
       bt31.setHorizontalAlignment(JTextField.CENTER);
       f121.add(bt31);


       //ENTRY 3
       JTextField bt161 = new JTextField(namevalue3);
       bt161.setBounds(50, 300, 150, 30);
       bt161.setEditable(false);
       bt161.setHorizontalAlignment(JTextField.CENTER);
       f121.add(bt161);

       //ENTRY 3
       JTextField bt17 = new JTextField(ratevalue3);
       bt17.setBounds(220, 300, 150, 30);
       bt17.setEditable(false);
       bt17.setHorizontalAlignment(JTextField.CENTER);
       f121.add(bt17);

       //ENTRY 3
       JTextField bt18 = new JTextField(qtyvalue3);
       bt18.setBounds(390, 300, 150, 30);
       bt18.setEditable(false);
       bt18.setHorizontalAlignment(JTextField.CENTER);
       f121.add(bt18);

       //multiply 3
       JTextField bt32 = new JTextField(Integer.toString(tp3));
       bt32.setBounds(560, 300, 150, 30);
       bt32.setEditable(false);
       bt32.setHorizontalAlignment(JTextField.CENTER);
       f121.add(bt32);

       //ENTRY 4
       JTextField bt19 = new JTextField(namevalue4);
       bt19.setBounds(50, 350, 150, 30);
       bt19.setEditable(false);
       bt19.setHorizontalAlignment(JTextField.CENTER);
       f121.add(bt19);

       //ENTRY 4
       JTextField bt20 = new JTextField(ratevalue4);
       bt20.setBounds(220, 350, 150, 30);
       bt20.setEditable(false);
       bt20.setHorizontalAlignment(JTextField.CENTER);
       f121.add(bt20);

       //ENTRY 4
       JTextField bt21 = new JTextField(qtyvalue4);
       bt21.setBounds(390, 350, 150, 30);
       bt21.setEditable(false);
       bt21.setHorizontalAlignment(JTextField.CENTER);
       f121.add(bt21);

       //multiply 4
       JTextField bt33 = new JTextField(Integer.toString(tp4));
       bt33.setBounds(560, 350, 150, 30);
       bt33.setEditable(false);
       bt33.setHorizontalAlignment(JTextField.CENTER);
       f121.add(bt33);

       //NUMBERING 4

       JTextField bt22 = new JTextField("4");
       bt22.setBounds(10, 350, 30, 30);
       bt22.setEditable(false);
       bt22.setHorizontalAlignment(JTextField.CENTER);
       f121.add(bt22);

       //NUMBERING 3

       JTextField bt23 = new JTextField("3");
       bt23.setBounds(10, 300, 30, 30);
       bt23.setEditable(false);
       bt23.setHorizontalAlignment(JTextField.CENTER);
       f121.add(bt23);


       //NUMBERING 2 

       JTextField bt24 = new JTextField("2");
       bt24.setBounds(10, 250, 30, 30);
       bt24.setEditable(false);
       bt24.setHorizontalAlignment(JTextField.CENTER);
       f121.add(bt24);


       //NUMBERING 1

       JTextField bt25 = new JTextField("1");
       bt25.setBounds(10, 200, 30, 30);
       bt25.setEditable(false);
       bt25.setHorizontalAlignment(JTextField.CENTER);
       f121.add(bt25);

       //Amount

       JTextField bt26 = new JTextField("AMOUNT");
       bt26.setBounds(390, 500, 150, 30);
       bt26.setEditable(false);
       bt26.setHorizontalAlignment(JTextField.CENTER);
       f121.add(bt26);

       //cost
       JTextField t38 = new JTextField("TOTAL");
       t38.setBounds(390, 400, 150, 30);
       t38.setEditable(false);
       t38.setHorizontalAlignment(JTextField.CENTER);
       JTextField bt38 = new JTextField(Integer.toString(totalconst));
       bt38.setBounds(560, 400, 150, 30);
       bt38.setEditable(false);
       bt38.setHorizontalAlignment(JTextField.CENTER);
       f121.add(bt38);
       f121.add(t38);

       //Total 
       JTextField bt34 = new JTextField(Integer.toString(total));
       bt34.setBounds(560, 500, 150, 30);
       bt34.setEditable(false);
       bt34.setHorizontalAlignment(JTextField.CENTER);
       f121.add(bt34);

       //Discount
       JTextField t35 = new JTextField("DISCOUNT");
       t35.setBounds(390, 450, 150, 30);
       t35.setEditable(false);
       t35.setHorizontalAlignment(JTextField.CENTER);
       JTextField bt35 = new JTextField(Integer.toString(disc));
       bt35.setBounds(560, 450, 150, 30);
       bt35.setEditable(false);
       bt35.setHorizontalAlignment(JTextField.CENTER);
       f121.add(bt35);
       f121.add(t35);

       JButton b44 = new JButton("PRINT");
       b44.setBounds(560, 600, 150, 30);
       f121.add(b44);



       f121.setSize(800, 800);
       f121.setLayout(null);
       f121.setVisible(true);

       stmt.close();
       c.commit();
       c.close();


      } catch (Exception ee) {
       System.err.println(ee.getClass().getName() + ": " + ee.getMessage());
       System.exit(0);
      }
     }
    });



    f.setSize(850, 700);
    f.setLayout(null);
    f.setVisible(true);
   }
  });
  JButton b1 = new JButton("Apparatus");
  b1.setBounds(190, 380, 180, 100);
  b1.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    JFrame f = new JFrame("PHARMACY MANAGEMENT");
    f.setTitle("BILL GENERATION");
    //DATE

    JTextField t1 = new JTextField("");
    t1.setBounds(5, 10, 150, 30);

    //DATE ACTION HH:mm:ss
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy ");
    LocalDateTime now = LocalDateTime.now();
    t1.setText(dtf.format(now));


    t1.setEditable(false);
    t1.setHorizontalAlignment(JTextField.CENTER);
    f.add(t1);


    //MANAGE LENT
    JButton l1 = new JButton("MANAGE LENT APPARATUS");
    l1.setBounds(200, 150, 300, 100);
    f.add(l1);


    //NEW LENDING
    JButton l2 = new JButton("NEW LENDING");
    l2.setBounds(200, 300, 300, 100);
    f.add(l2);

    l2.addActionListener(new ActionListener() {
     public void actionPerformed(ActionEvent e) {
      f.dispose();
      JFrame f = new JFrame("PHARMACY MANAGEMENT");
      f.setTitle("LENT APPARATUS");
      //DATE

      JTextField t1 = new JTextField("");
      t1.setBounds(5, 10, 150, 30);

      //DATE ACTION HH:mm:ss
      DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy ");
      LocalDateTime now = LocalDateTime.now();
      t1.setText(dtf.format(now));
      t1.setEditable(false);
      t1.setHorizontalAlignment(JTextField.CENTER);
      f.add(t1);

      //CUSTOMER NAME
      JTextField nt2 = new JTextField("CUSTOMER NAME");
      nt2.setHorizontalAlignment(JTextField.CENTER);
      nt2.setBounds(10, 50, 150, 30);
      f.add(nt2);


      //CONTACT
      JTextField nt4 = new JTextField("CONTACT");
      nt4.setBounds(160, 50, 150, 30);
      nt4.setHorizontalAlignment(JTextField.CENTER);
      f.add(nt4);

      //date from 
      JTextField dt1 = new JTextField("DATE FROM");
      dt1.setBounds(310, 50, 150, 30);
      dt1.setHorizontalAlignment(JTextField.CENTER);
      f.add(dt1);

      //date to
      JTextField dt2 = new JTextField("DATE TO");
      dt2.setBounds(460, 50, 150, 30);
      dt2.setHorizontalAlignment(JTextField.CENTER);
      f.add(dt2);



      //APPARATUS
      JTextField nt6 = new JTextField("APPARATUS");
      nt6.setBounds(300, 100, 150, 30);
      nt6.setEditable(false);
      nt6.setHorizontalAlignment(JTextField.CENTER);
      f.add(nt6);

      //NAME
      JTextField nt7 = new JTextField("NAME");
      nt7.setBounds(50, 150, 150, 30);
      nt7.setEditable(false);
      nt7.setHorizontalAlignment(JTextField.CENTER);
      f.add(nt7);

      //RATE
      JTextField nt8 = new JTextField("RATE");
      nt8.setBounds(220, 150, 150, 30);
      nt8.setEditable(false);
      nt8.setHorizontalAlignment(JTextField.CENTER);
      f.add(nt8);

      //QTY
      JTextField nt9 = new JTextField("QTY");
      nt9.setBounds(390, 150, 150, 30);
      nt9.setEditable(false);
      nt9.setHorizontalAlignment(JTextField.CENTER);
      f.add(nt9);

      //ENTRY 1
      JTextField nt10 = new JTextField("");
      nt10.setBounds(50, 200, 150, 30);
      nt10.setHorizontalAlignment(JTextField.CENTER);
      f.add(nt10);

      //ENTRY 1
      JTextField nt11 = new JTextField("");
      nt11.setBounds(220, 200, 150, 30);
      nt11.setHorizontalAlignment(JTextField.CENTER);
      f.add(nt11);

      //ENTRY 1
      JTextField nt12 = new JTextField("");
      nt12.setBounds(390, 200, 150, 30);
      nt12.setHorizontalAlignment(JTextField.CENTER);
      f.add(nt12);

      //ENTRY 2
      JTextField nt13 = new JTextField("");
      nt13.setBounds(50, 250, 150, 30);
      nt13.setHorizontalAlignment(JTextField.CENTER);
      f.add(nt13);

      //ENTRY 2
      JTextField nt14 = new JTextField("");
      nt14.setBounds(220, 250, 150, 30);
      nt14.setHorizontalAlignment(JTextField.CENTER);
      f.add(nt14);

      //ENTRY 2
      JTextField nt15 = new JTextField("");
      nt15.setBounds(390, 250, 150, 30);
      nt15.setHorizontalAlignment(JTextField.CENTER);
      f.add(nt15);


      //ENTRY 3
      JTextField nt16 = new JTextField("");
      nt16.setBounds(50, 300, 150, 30);
      nt16.setHorizontalAlignment(JTextField.CENTER);
      f.add(nt16);

      //ENTRY 3
      JTextField nt17 = new JTextField("");
      nt17.setBounds(220, 300, 150, 30);
      nt17.setHorizontalAlignment(JTextField.CENTER);
      f.add(nt17);

      //ENTRY 3
      JTextField nt18 = new JTextField("");
      nt18.setBounds(390, 300, 150, 30);
      nt18.setHorizontalAlignment(JTextField.CENTER);
      f.add(nt18);

      //ENTRY 4
      JTextField nt19 = new JTextField("");
      nt19.setBounds(50, 350, 150, 30);
      nt19.setHorizontalAlignment(JTextField.CENTER);
      f.add(nt19);

      //ENTRY 4
      JTextField nt20 = new JTextField("");
      nt20.setBounds(220, 350, 150, 30);
      nt20.setHorizontalAlignment(JTextField.CENTER);
      f.add(nt20);

      //ENTRY 4
      JTextField nt21 = new JTextField("");
      nt21.setBounds(390, 350, 150, 30);
      nt21.setHorizontalAlignment(JTextField.CENTER);
      f.add(nt21);

      //NUMBERING 4

      JTextField nt22 = new JTextField("4");
      nt22.setBounds(10, 350, 30, 30);
      nt22.setEditable(false);
      nt22.setHorizontalAlignment(JTextField.CENTER);
      f.add(nt22);

      //NUMBERING 3

      JTextField nt23 = new JTextField("3");
      nt23.setBounds(10, 300, 30, 30);
      nt23.setEditable(false);
      nt23.setHorizontalAlignment(JTextField.CENTER);
      f.add(nt23);


      //NUMBERING 2 

      JTextField nt24 = new JTextField("2");
      nt24.setBounds(10, 250, 30, 30);
      nt24.setEditable(false);
      nt24.setHorizontalAlignment(JTextField.CENTER);
      f.add(nt24);


      //NUMBERING 1

      JTextField nt25 = new JTextField("1");
      nt25.setBounds(10, 200, 30, 30);
      nt25.setEditable(false);
      nt25.setHorizontalAlignment(JTextField.CENTER);
      f.add(nt25);



      //EXIT
      JButton nb4 = new JButton("CONFIRM");
      nb4.setBounds(500, 450, 150, 30);
      f.add(nb4);

      nb4.addActionListener(new ActionListener() {
       public void actionPerformed(ActionEvent e) {
        Connection c = null;
        Statement stmt = null;
        String sql;
        String namevaluee = nt2.getText();
        String contactvaluee = nt4.getText();
        String namevaluee1 = nt10.getText();
        String ratevaluee1 = nt11.getText();
        String qtyvaluee1 = nt12.getText();
        String namevaluee2 = nt13.getText();
        String ratevaluee2 = nt14.getText();
        String qtyvaluee2 = nt15.getText();
        String namevaluee3 = nt16.getText();
        String ratevaluee3 = nt17.getText();
        String qtyvaluee3 = nt18.getText();
        String namevaluee4 = nt19.getText();
        String ratevaluee4 = nt20.getText();
        String qtyvaluee4 = nt21.getText();
        String dt_from = dt1.getText();
        String dt_to = dt2.getText();

        try {
         Class.forName("org.sqlite.JDBC");
         c = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/db/kartikkkk.db");
         c.setAutoCommit(false);
         System.out.println("Opened database successfully");
         stmt = c.createStatement();
         sql = "INSERT INTO APPARATUS(CUSTOMER_NAME,CONTACT,PRODUCT1,RATE1,QTY1,PRODUCT2,RATE2,QTY2,PRODUCT3,RATE3,QTY3,PRODUCT4,RATE4,QTY4,FROM_DATE,TO_DATE)VALUES (" + "'" + namevaluee + "'" + "," + Integer.parseInt(contactvaluee) + "," + "'" + namevaluee1 + "'" + "," + Integer.parseInt(ratevaluee1) + "," + Integer.parseInt(qtyvaluee1) + "," + "'" + namevaluee2 + "'" + "," + Integer.parseInt(ratevaluee2) + "," + Integer.parseInt(qtyvaluee2) + "," + "'" + namevaluee3 + "'" + "," + Integer.parseInt(ratevaluee3) + "," + Integer.parseInt(qtyvaluee3) + ",'" + namevaluee4 + "'," + Integer.parseInt(ratevaluee4) + "," + Integer.parseInt(qtyvaluee4) + "," + "'" + dt_from + "'," + "'" + dt_to + "'" + ");";
         stmt.executeUpdate(sql);
         System.out.println("Added New Apparatus");

         // ADD HERE CONFIRMATION SCREEN AND PDF GENERATION



         stmt.close();
         c.commit();
         c.close();
        } catch (Exception ee) {
         System.err.println(ee.getClass().getName() + ": " + ee.getMessage());
         System.exit(0);
        }
       }
      });


      f.setSize(850, 700);
      f.setLayout(null);
      f.setVisible(true);

     }
    });
    f.setSize(850, 700);
    f.setLayout(null);
    f.setVisible(true);
   }
  });


  JButton b2 = new JButton("Admin");

  b2.setBounds(190, 530, 180, 100);
  b2.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    ff.dispose();
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
      f2.setSize(800, 900);
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
    f1.setSize(800, 800);
    f1.setLayout(null);
    f1.setVisible(true);
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
