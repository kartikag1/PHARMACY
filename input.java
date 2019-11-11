import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class k extends JFrame {

public static void main(String args[])
{
try {
 JFrame f= new JFrame("TextField Example");
 JTextField t1;
    t1=new JTextField("");
    t1.setBounds(50,100, 200,30);

    JButton b=new JButton("kkk");
    b.setBounds(50,200,95,30);
    f.add(b);
    b.addActionListener( new ActionListener()
                       {
                           public void actionPerformed(ActionEvent e)
                           {String s1=t1.getText();
                            System.out.println(s1);

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
