import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//DATE LIBRARY`s
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  

class manage extends JFrame{
public static void main(String args[])
{
JFrame f= new JFrame("PHARMACY MANAGEMENT");
f.setTitle("MANAGE LENT APPARATUS");
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

//HEADING

JLabel h1=new JLabel("MANAGE LENT APPARATUS");
    h1.setBounds(250,10,450,30);
    h1.setHorizontalAlignment(JTextField.CENTER);
Font f1 = new Font("TimesRoman",Font.BOLD,20);
    h1.setFont(f1);
    f.add(h1);

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
JLabel e1=new JLabel("name1");
    e1.setBounds(50,200,150,30);
    e1.setHorizontalAlignment(JTextField.CENTER);
    f.add(e1);

//ENTRY 1
JLabel e2=new JLabel("RATE1");
    e2.setBounds(220,200,150,30);
    e2.setHorizontalAlignment(JTextField.CENTER);
 f.add(e2);

//ENTRY 1
JLabel e3=new JLabel("QTY1");
    e3.setBounds(390,200,150,30);
    e3.setHorizontalAlignment(JTextField.CENTER);
 f.add(e3);

//ENTRY 2
JLabel e4=new JLabel("NAME2");
    e4.setBounds(50,250,150,30);
    e4.setHorizontalAlignment(JTextField.CENTER);
    f.add(e4);

//ENTRY 2
JLabel e5=new JLabel(" RATE 2");
    e5.setBounds(220,250,150,30);
    e5.setHorizontalAlignment(JTextField.CENTER);
 f.add(e5);

//ENTRY 2
JLabel e6=new JLabel("QTY 2 ");
   e6.setBounds(390,250,150,30);
    e6.setHorizontalAlignment(JTextField.CENTER);
 f.add(e6);


//ENTRY 3
JLabel e7=new JLabel("NAME 3");
    e7.setBounds(50,300,150,30);
    e7.setHorizontalAlignment(JTextField.CENTER);
    f.add(e7);

//ENTRY 3
JLabel e8=new JLabel("RATE 3");
    e8.setBounds(220,300,150,30);
    e8.setHorizontalAlignment(JTextField.CENTER);
 f.add(e8);

//ENTRY 3
JLabel e9=new JLabel(" QTY3");
    e9.setBounds(390,300,150,30);
    e9.setHorizontalAlignment(JTextField.CENTER);
 f.add(e9);

//ENTRY 4
JLabel e10=new JLabel("NAME 4");
    e10.setBounds(50,350,150,30);
    e10.setHorizontalAlignment(JTextField.CENTER);
    f.add(e10);

//ENTRY 4
JLabel e11=new JLabel("RATE 4");
    e11.setBounds(220,350,150,30);
    e11.setHorizontalAlignment(JTextField.CENTER);
 f.add(e11);

//ENTRY 4
JLabel e12=new JLabel(" QTY 4");
    e12.setBounds(390,350,150,30);
    e12.setHorizontalAlignment(JTextField.CENTER);
 f.add(e12);

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


//DELETE BUTTONS
//DEL 1
JButton b1=new JButton("DELETE");
    b1.setBounds(560,200,100,30);
    b1.setHorizontalAlignment(JTextField.CENTER);
 f.add(b1);
//DEL 2
JButton b2=new JButton("DELETE");
    b2.setBounds(560,250,100,30);
    b2.setHorizontalAlignment(JTextField.CENTER);
 f.add(b2);

//DEL 3
JButton b3=new JButton("DELETE");
    b3.setBounds(560,300,100,30);
    b3.setHorizontalAlignment(JTextField.CENTER);
 f.add(b3);
// DEL 4
JButton b4=new JButton("DELETE");
    b4.setBounds(560,350,100,30);
    b4.setHorizontalAlignment(JTextField.CENTER);
 f.add(b4);







//EXIT
    JButton b5=new JButton("CONFIRM");
    b5.setBounds(500,450,150,30);
    f.add(b5);

//action listen exit

b4.addActionListener( new ActionListener()
                       {
                           public void actionPerformed(ActionEvent e)
                           {

                           }
                        });
	

    f.setResizable(false);
    f.setSize(750,500);
    f.setLayout(null);
    f.setVisible(true);
}
}
