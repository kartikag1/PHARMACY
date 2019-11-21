import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//DATE LIBRARY`s
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 

class test extends JFrame{
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

//HEADING

JLabel l1=new JLabel("Pharmacy",JLabel.CENTER);
              Font f1 = new Font("TimesRoman",Font.BOLD,45);
              l1.setForeground(Color.red);
              l1.setFont(f1);
		f.add(l1);

/*  JTextField t2=new JTextField("PHARMACY");
    t2.setBounds(5,10,150,30);
	Font f1 = new Font("TimesRoman",Font.BOLD,45);
              t2.setFont(f1); */


//pehla button
JButton b1=new JButton("Generate Bill");
    b1.setBounds(50,100,200,30);
    f.add(b1);

//doosra
    JButton b2=new JButton("Lent Apparatus");
    b2.setBounds(275,100,200,30);
    f.add(b2);

//teesra
    JButton b3=new JButton("Admin Login");
    b3.setBounds(500,100,150,30);
    f.add(b3);

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
