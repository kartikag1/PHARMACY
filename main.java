import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//DATE LIBRARY`s
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  

class main extends JFrame{
public static void main(String args[])
{
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

//CUSTOMER NAME
JTextField t2=new JTextField("CUSTOEMR NAME");
t2.setHorizontalAlignment(JTextField.CENTER);
    t2.setBounds(10,50,150,30);
 f.add(t2);


//AGE
JTextField t3=new JTextField("AGE");
    t3.setBounds(170,50,40,30);
t3.setHorizontalAlignment(JTextField.CENTER);
 f.add(t3);


//CONTACT
JTextField t4=new JTextField("CONTACT");
    t4.setBounds(220,50,150,30);
t4.setHorizontalAlignment(JTextField.CENTER);
 f.add(t4);


//DOCTOR NAME
JTextField t5=new JTextField("DR ");
    t5.setBounds(380,50,150,30);
t5.setHorizontalAlignment(JTextField.CENTER);
 f.add(t5);


//PRODUCTS
JTextField t6=new JTextField("PRODUCTS");
    t6.setBounds(300,100,150,30);
    t6.setEditable(false);
t6.setHorizontalAlignment(JTextField.CENTER);
 f.add(t6);

//NAME
JTextField t7=new JTextField("NAME");
    t7.setBounds(50,150,150,30);
    t7.setEditable(false);
t7.setHorizontalAlignment(JTextField.CENTER);
 f.add(t7);

//RATE
JTextField t8=new JTextField("RATE");
    t8.setBounds(220,150,150,30);
    t8.setEditable(false);
t8.setHorizontalAlignment(JTextField.CENTER);
 f.add(t8);

//QTY
JTextField t9=new JTextField("QTY");
    t9.setBounds(390,150,150,30);
    t9.setEditable(false);
t9.setHorizontalAlignment(JTextField.CENTER);
 f.add(t9);

//ENTRY 1
JTextField t10=new JTextField("");
    t10.setBounds(50,200,150,30);
    t10.setHorizontalAlignment(JTextField.CENTER);
    f.add(t10);

//ENTRY 1
JTextField t11=new JTextField("");
    t11.setBounds(220,200,150,30);
    t11.setHorizontalAlignment(JTextField.CENTER);
 f.add(t11);

//ENTRY 1
JTextField t12=new JTextField("");
    t12.setBounds(390,200,150,30);
    t12.setHorizontalAlignment(JTextField.CENTER);
 f.add(t12);

//ENTRY 2
JTextField t13=new JTextField("");
    t13.setBounds(50,250,150,30);
    t13.setHorizontalAlignment(JTextField.CENTER);
    f.add(t13);

//ENTRY 2
JTextField t14=new JTextField("");
    t14.setBounds(220,250,150,30);
    t14.setHorizontalAlignment(JTextField.CENTER);
 f.add(t14);

//ENTRY 2
JTextField t15=new JTextField("");
    t15.setBounds(390,250,150,30);
    t15.setHorizontalAlignment(JTextField.CENTER);
 f.add(t15);


//ENTRY 3
JTextField t16=new JTextField("");
    t16.setBounds(50,300,150,30);
    t16.setHorizontalAlignment(JTextField.CENTER);
    f.add(t16);

//ENTRY 3
JTextField t17=new JTextField("");
    t17.setBounds(220,300,150,30);
    t17.setHorizontalAlignment(JTextField.CENTER);
 f.add(t17);

//ENTRY 3
JTextField t18=new JTextField("");
    t18.setBounds(390,300,150,30);
    t18.setHorizontalAlignment(JTextField.CENTER);
 f.add(t18);

//ENTRY 4
JTextField t19=new JTextField("");
    t19.setBounds(50,350,150,30);
    t19.setHorizontalAlignment(JTextField.CENTER);
    f.add(t19);

//ENTRY 4
JTextField t20=new JTextField("");
    t20.setBounds(220,350,150,30);
    t20.setHorizontalAlignment(JTextField.CENTER);
 f.add(t20);

//ENTRY 4
JTextField t21=new JTextField("");
    t21.setBounds(390,350,150,30);
    t21.setHorizontalAlignment(JTextField.CENTER);
 f.add(t21);

//NUMBERING 4

JTextField t22=new JTextField("4");
    t22.setBounds(10,350,30,30);
t22.setEditable(false);
    t22.setHorizontalAlignment(JTextField.CENTER);
 f.add(t22);

//NUMBERING 3

JTextField t23=new JTextField("3");
    t23.setBounds(10,300,30,30);
t23.setEditable(false);
    t23.setHorizontalAlignment(JTextField.CENTER);
 f.add(t23);


//NUMBERING 2 

JTextField t24=new JTextField("2");
    t24.setBounds(10,250,30,30);
t24.setEditable(false);
    t24.setHorizontalAlignment(JTextField.CENTER);
 f.add(t24);


//NUMBERING 1

JTextField t25=new JTextField("1");
    t25.setBounds(10,200,30,30);
    t25.setEditable(false);
    t25.setHorizontalAlignment(JTextField.CENTER);
 f.add(t25);

//SPECIAL CUSTOMER

JTextField t26=new JTextField("SPECIAL CUSTOMER");
    t26.setBounds(10,450,150,30);
    t26.setHorizontalAlignment(JTextField.CENTER);
  f.add(t26);






//EXIT
    JButton b4=new JButton("CONFIRM");
    b4.setBounds(500,450,150,30);
    f.add(b4);

//action listen exit

b4.addActionListener( new ActionListener()
                       {
                           public void actionPerformed(ActionEvent e)
                           {

                           }
                        });
	


    f.setSize(750,500);
    f.setLayout(null);
    f.setVisible(true);
}
}
