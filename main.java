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
    t2.setBounds(10,50,150,30);
 f.add(t2);
//AGE
JTextField t3=new JTextField("AGE");
    t3.setBounds(170,50,40,30);
 f.add(t3);
//CONTACT
JTextField t4=new JTextField("CONTACT");
    t4.setBounds(220,50,150,30);
 f.add(t4);
//DOCTOR NAME
JTextField t5=new JTextField("DR ");
    t5.setBounds(380,50,150,30);
 f.add(t5);
//PRODUCTS
JTextField t6=new JTextField("PRODUCTS");
    t6.setBounds(300,100,150,30);
    t6.setEditable(false);
t6.setHorizontalAlignment(JTextField.CENTER);
 f.add(t6);
//EXIT
    JButton b4=new JButton("EXIT");
    b4.setBounds(500,450,150,30);
    f.add(b4);

//action listen exit

b4.addActionListener( new ActionListener()
                       {
                           public void actionPerformed(ActionEvent e)
                           {f.dispose();

                           }
                        });
	


    f.setSize(750,500);
    f.setLayout(null);
    f.setVisible(true);
}
}
