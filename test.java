import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class test extends JFrame{
public static void main(String args[])
{
JFrame f= new JFrame("PHARMACY MANAGEMENT");
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
