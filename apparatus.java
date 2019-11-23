import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.sql.*;

class apparatus extends JFrame {
public apparatus(){


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

      //--------------------------------------------------------------------
      JFrame f= new JFrame("PHARMACY MANAGEMENT");
f.setTitle("BILL GENERATION");
//DATE

JTextField t1=new JTextField("");
    t1.setBounds(5,10,150,30);
   
//DATE ACTION HH:mm:ss
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy ");  
   LocalDateTime now = LocalDateTime.now();  
   t1.setText(dtf.format(now));


t1.setEditable(false);
t1.setHorizontalAlignment(JTextField.CENTER);
 f.add(t1);


//MANAGE LENT
  JButton l1=new JButton("MANAGE LENT APPARATUS");
    l1.setBounds(200,150,300,100);
    f.add(l1);


//NEW LENDING
  JButton l2=new JButton("NEW LENDING");
    l2.setBounds(200,300,300,100);
    f.add(l2);

l2.addActionListener( new ActionListener()
                       {
                           public void actionPerformed(ActionEvent e)
                           { f.dispose();
                                JFrame f= new JFrame("PHARMACY MANAGEMENT");
f.setTitle("LENT APPARATUS");
//DATE

JTextField t1=new JTextField("");
    t1.setBounds(5,10,150,30);
   
//DATE ACTION HH:mm:ss
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy ");  
   LocalDateTime now = LocalDateTime.now();  
   t1.setText(dtf.format(now));
t1.setEditable(false);
t1.setHorizontalAlignment(JTextField.CENTER);
 f.add(t1);

//CUSTOMER NAME
JTextField nt2=new JTextField("CUSTOMER NAME");
nt2.setHorizontalAlignment(JTextField.CENTER);
    nt2.setBounds(10,50,150,30);
 f.add(nt2);


//CONTACT
JTextField nt4=new JTextField("CONTACT");
    nt4.setBounds(160,50,150,30);
nt4.setHorizontalAlignment(JTextField.CENTER);
 f.add(nt4);

//date from 
 JTextField dt1=new JTextField("DATE FROM");
    dt1.setBounds(310,50,150,30);
    dt1.setHorizontalAlignment(JTextField.CENTER);
    f.add(dt1);

//date to
 JTextField dt2=new JTextField("DATE TO");
    dt2.setBounds(460,50,150,30);
    dt2.setHorizontalAlignment(JTextField.CENTER);
    f.add(dt2);



//APPARATUS
JTextField nt6=new JTextField("APPARATUS");
    nt6.setBounds(300,100,150,30);
    nt6.setEditable(false);
nt6.setHorizontalAlignment(JTextField.CENTER);
 f.add(nt6);

//NAME
JTextField nt7=new JTextField("NAME");
    nt7.setBounds(50,150,150,30);
    nt7.setEditable(false);
nt7.setHorizontalAlignment(JTextField.CENTER);
 f.add(nt7);

//RATE
JTextField nt8=new JTextField("RATE");
    nt8.setBounds(220,150,150,30);
    nt8.setEditable(false);
nt8.setHorizontalAlignment(JTextField.CENTER);
 f.add(nt8);

//QTY
JTextField nt9=new JTextField("QTY");
    nt9.setBounds(390,150,150,30);
    nt9.setEditable(false);
nt9.setHorizontalAlignment(JTextField.CENTER);
 f.add(nt9);

//ENTRY 1
JTextField nt10=new JTextField("");
    nt10.setBounds(50,200,150,30);
    nt10.setHorizontalAlignment(JTextField.CENTER);
    f.add(nt10);

//ENTRY 1
JTextField nt11=new JTextField("");
    nt11.setBounds(220,200,150,30);
    nt11.setHorizontalAlignment(JTextField.CENTER);
 f.add(nt11);

//ENTRY 1
JTextField nt12=new JTextField("");
    nt12.setBounds(390,200,150,30);
    nt12.setHorizontalAlignment(JTextField.CENTER);
 f.add(nt12);

//ENTRY 2
JTextField nt13=new JTextField("");
    nt13.setBounds(50,250,150,30);
    nt13.setHorizontalAlignment(JTextField.CENTER);
    f.add(nt13);

//ENTRY 2
JTextField nt14=new JTextField("");
    nt14.setBounds(220,250,150,30);
    nt14.setHorizontalAlignment(JTextField.CENTER);
 f.add(nt14);

//ENTRY 2
JTextField nt15=new JTextField("");
    nt15.setBounds(390,250,150,30);
    nt15.setHorizontalAlignment(JTextField.CENTER);
 f.add(nt15);


//ENTRY 3
JTextField nt16=new JTextField("");
    nt16.setBounds(50,300,150,30);
    nt16.setHorizontalAlignment(JTextField.CENTER);
    f.add(nt16);

//ENTRY 3
JTextField nt17=new JTextField("");
    nt17.setBounds(220,300,150,30);
    nt17.setHorizontalAlignment(JTextField.CENTER);
 f.add(nt17);

//ENTRY 3
JTextField nt18=new JTextField("");
    nt18.setBounds(390,300,150,30);
    nt18.setHorizontalAlignment(JTextField.CENTER);
 f.add(nt18);

//ENTRY 4
JTextField nt19=new JTextField("");
    nt19.setBounds(50,350,150,30);
    nt19.setHorizontalAlignment(JTextField.CENTER);
    f.add(nt19);

//ENTRY 4
JTextField nt20=new JTextField("");
    nt20.setBounds(220,350,150,30);
    nt20.setHorizontalAlignment(JTextField.CENTER);
 f.add(nt20);

//ENTRY 4
JTextField nt21=new JTextField("");
    nt21.setBounds(390,350,150,30);
    nt21.setHorizontalAlignment(JTextField.CENTER);
 f.add(nt21);

//NUMBERING 4

JTextField nt22=new JTextField("4");
    nt22.setBounds(10,350,30,30);
nt22.setEditable(false);
    nt22.setHorizontalAlignment(JTextField.CENTER);
 f.add(nt22);

//NUMBERING 3

JTextField nt23=new JTextField("3");
    nt23.setBounds(10,300,30,30);
nt23.setEditable(false);
    nt23.setHorizontalAlignment(JTextField.CENTER);
 f.add(nt23);


//NUMBERING 2 

JTextField nt24=new JTextField("2");
    nt24.setBounds(10,250,30,30);
nt24.setEditable(false);
    nt24.setHorizontalAlignment(JTextField.CENTER);
 f.add(nt24);


//NUMBERING 1

JTextField nt25=new JTextField("1");
    nt25.setBounds(10,200,30,30);
    nt25.setEditable(false);
    nt25.setHorizontalAlignment(JTextField.CENTER);
 f.add(nt25);



//EXIT
    JButton nb4=new JButton("CONFIRM");
    nb4.setBounds(500,450,150,30);
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

        try{
             Class.forName("org.sqlite.JDBC");
         c = DriverManager.getConnection("jdbc:sqlite:C:/sqlite/db/kartikkkk.db");
         c.setAutoCommit(false);
         System.out.println("Opened database successfully");
         stmt = c.createStatement();
         sql = "INSERT INTO APPARATUS(CUSTOMER_NAME,CONTACT,PRODUCT1,RATE1,QTY1,PRODUCT2,RATE2,QTY2,PRODUCT3,RATE3,QTY3,PRODUCT4,RATE4,QTY4,FROM_DATE,TO_DATE)VALUES ("+"'"+namevaluee+"'"+","+Integer.parseInt(contactvaluee)+","+"'"+namevaluee1+"'"+","+Integer.parseInt(ratevaluee1)+","+Integer.parseInt(qtyvaluee1)+","+"'"+namevaluee2+"'"+","+Integer.parseInt(ratevaluee2)+","+Integer.parseInt(qtyvaluee2)+","+"'"+namevaluee3+"'"+","+Integer.parseInt(ratevaluee3)+","+Integer.parseInt(qtyvaluee3)+",'"+namevaluee4+"',"+Integer.parseInt(ratevaluee4)+","+Integer.parseInt(qtyvaluee4)+","+"'"+dt_from+"',"+"'"+dt_to+"'"+");";        
         stmt.executeUpdate(sql);  
         System.out.println("Added New Apparatus");

         // ADD HERE CONFIRMATION SCREEN AND PDF GENERATION



         stmt.close();
         c.commit();
         c.close();
     } catch ( Exception ee ) {
         System.err.println( ee.getClass().getName() + ": " + ee.getMessage() );
         System.exit(0);
      }}
    });


    f.setSize(850,700);
    f.setLayout(null);
    f.setVisible(true);

                           }
                        });
    f.setSize(850,700);
    f.setLayout(null);
    f.setVisible(true);
}

}