import javax.swing.*;  
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.LineBorder;
class shop extends JFrame
{  
    public static void main(String args[])
    {
              JButton b1,b2,b3;
              JLabel l1;
              JFrame f= new JFrame("Shop Managment"); 
              l1=new JLabel("Pharmacy",JLabel.CENTER);
              Font f1 = new Font("TimesRoman",Font.BOLD,45);
              l1.setForeground(Color.red);
              l1.setFont(f1);
              JPanel panel=new JPanel();
              JLabel SName = new JLabel("Shop Id:");
              //shop no textfield
               JTextField S1Name = new JTextField(20);
               //
               SName.setLabelFor(S1Name);
              SName.setBounds(150,100,100,100);
              S1Name.setBounds(50, 50, 100, 20);
              JLabel SPass = new JLabel("Password :");
              //shop password textfield
              JTextField S1Pass = new JTextField(20);
              //
              SPass.setLabelFor(S1Pass);
              SName.setFont(f1);
              SPass.setFont(f1);
              b1 = new JButton("Generate bills");
              b2 = new JButton("Apparatus");
              b3 = new JButton("Admin");
              b3.addActionListener( new ActionListener()
              {
                  public void actionPerformed(ActionEvent e)
                  {
                      f.dispose();
                      JFrame f1= new JFrame("Login"); 
                      JLabel l2 = new JLabel("Login");
                      Font f12 = new Font("TimesRoman",Font.BOLD,25);
                      l2.setFont(f12);
                      l2.setBounds(170,10,100,100);
                      JLabel AName = new JLabel("Admin Id:");
                      //admin no textfield
                      JTextField A1Name = new JTextField(20);
                       //
                       AName.setLabelFor(A1Name);
                      AName.setBounds(50,100,200,100);
                      A1Name.setBounds(250,135, 250,35);
                      JLabel APass = new JLabel("Password :");
                      //shop password textfield
                      JTextField A1Pass = new JTextField(20);
                      //
                      APass.setLabelFor(A1Pass);
                      APass.setBounds(50,200,200,100);
                      A1Pass.setBounds(250,235, 250,35);
                      AName.setFont(f12);
                      APass.setFont(f12);
                      JButton b4 = new JButton("Login");
                      b4.setBounds(210,350,120,60);
                       b4.addActionListener( new ActionListener()
                       {
                           public void actionPerformed(ActionEvent e)
                           {
                               if(A1Name=="Admin" && A1Pass=="Admin")
                               {
                                // close all previous screens and open another screen containing buttons do not close this screen:-
                                //generate bill --> link to normal bill generation screen
                                //manage lent apparatus --> link to normal lent apparatus screen
                                //stock management --> new screen for stock
                                //due payments --> new screen for payments
                                //employee shifts --> new screen for managing employees
                                //generate balance sheet button --> new screen containing formatted balance sheet further to generate PDF and also integrate mailing system
                               }
                               else
                               {
                                // open login screen again for re-attempt
                               }
                           }
                        });
                      f1.add(l2);
                      f1.add(AName);
                      f1.add(A1Name);
                      f1.add(APass);
                      f1.add(A1Pass);
                      f1.add(b4);
                      f1.setSize(600,600);
                      f1.setLayout(null);  
                      f1.setVisible(true);
                    }
                });
               
              b1.setBounds(30,200,125,100);
              b2.setBounds(30,350,125,100);
              b3.setBounds(30,500,125,100);
              
              f.add(b1);
              f.add(b2);
              f.add(b3);
              f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              Color c = new Color(0,100,255);
              f.getContentPane().setBackground(c);
              
            
              panel.setBounds(175,40,600,650);
              panel.setBackground(Color.green);
              panel.add(l1);
              panel.add(SName);
              panel.add(S1Name);
              panel.add(SPass);
              panel.add(S1Pass);
              
              f.add(panel);
              f.setSize(800,800);
              f.setMinimumSize(new Dimension(800, 0));
                  f.setMaximumSize(new Dimension(800, 800));
              f.setLayout(null);  
                  f.setVisible(true);  
               
                }
            }
   
