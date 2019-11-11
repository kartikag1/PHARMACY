import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class k extends JFrame {

public static void main(String args[])
{
try {
 JFrame f= new JFrame("TextField Example");
 JTextField t1,t2;
    t1=new JTextField("");
    t1.setBounds(50,100, 200,30);
    t2=new JTextField("");
    t2.setBounds(50,150, 200,30);
    f.add(t2);




    JButton b=new JButton("kkk");
    b.setBounds(50,200,95,30);
    f.add(b);
    b.addActionListener( new ActionListener()
                       {
                           public void actionPerformed(ActionEvent e)
                           {String s1=t1.getText();
                             String s2 = t2.getText();

                             System.out.println(s1+s2);

                           }
                        });



f.add(t1);
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);

}catch(Exception e)
{
    System.out.println("ERROR :- " + e);
}

}

}
