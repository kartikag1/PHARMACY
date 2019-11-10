import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;
class pharmacyy extends JFrame
{
    public static void main(String args[])
    {
        JFrame f = new JFrame("Pharmacy Management");
        JLabel l =new JLabel("Pharmacy Management");
        Font f12 = new Font("TimesRoman",Font.ITALIC,25);
        l.setFont(f12);
        l.setBounds(150,10,450,250);
        JButton b = new JButton("Generate Bills");
        b.setBounds(190,230,180,100);
        
        JButton b1 = new JButton("Apparatus");
        b1.setBounds(190,380,180,100);
        JButton b2 = new JButton("Admin");
        b2.setBounds(190,530,180,100);
        b2.addActionListener( new ActionListener()
        {
           public void actionPerformed(ActionEvent e)
             {
                  f.dispose();
                  JFrame f1= new JFrame("Login"); 
                  JLabel l2 = new JLabel("Login");
                  Font f12 = new Font("TimesRoman",Font.ITALIC,45);
                  l2.setFont(f12);
                  l2.setBounds(210,10,800,120);
                  JLabel UName = new JLabel("Admin Id:");
                      //admin no textfield
                      JTextField U1Name = new JTextField(20);
                       //
                  UName.setLabelFor(U1Name);
                  UName.setBounds(50,100,200,100);
                  U1Name.setBounds(250,135, 250,35);
                  JLabel UPass = new JLabel("Password :");
                      //shop password textfield
                  JPasswordField U1Pass = new JPasswordField(20);
                      //
                  UPass.setLabelFor(U1Pass);
                  UPass.setBounds(50,200,200,100);
                  U1Pass.setBounds(250,235, 250,35);
                  Font f121 = new Font("TimesRoman",Font.ITALIC,25);
                  UName.setFont(f121);
                  UPass.setFont(f121);
                  JButton b4 = new JButton("Login");
                  b4.setBounds(210,350,120,60);
                  b4.addActionListener( new ActionListener()
                  {
                     public void actionPerformed(ActionEvent e)
                         {
                               f1.dispose();
                               JFrame f2 = new JFrame("Admin");
                               f2.setSize(600,800);
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
                  f1.setSize(600,600);
                  f1.setLayout(null);  
                  f1.setVisible(true);
              }
         });
        f.add(b);
        f.add(b1);
        f.add(b2);
        f.add(l);
        f.setLayout(null);
        f.setSize(600,800);
        f.setVisible(true);
    }
}