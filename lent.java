import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//DATE LIBRARY`s
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  

class lent extends JFrame{
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
				neww();
                           }
                        });







    f.setResizable(false);
    f.setSize(750,500);
    f.setLayout(null);
    f.setVisible(true);
}


//NEW LENT FUNCTION ()



public static void neww(){

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
JTextField nt2=new JTextField("CUSTOEMR NAME");
nt2.setHorizontalAlignment(JTextField.CENTER);
    nt2.setBounds(10,50,150,30);
 f.add(nt2);


//CONTACT
JTextField nt4=new JTextField("CONTACT");
    nt4.setBounds(220,50,150,30);
nt4.setHorizontalAlignment(JTextField.CENTER);
 f.add(nt4);


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



    f.setResizable(false);
    f.setSize(750,500);
    f.setLayout(null);
    f.setVisible(true);

}


}
