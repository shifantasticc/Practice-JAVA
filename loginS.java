import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class loginS extends JFrame
{
    JLabel l1,l2,l3,l4;
    JTextField t1;
    JPasswordField t2;
    JButton b1, b2;

loginS(String s1){
super(s1);
}
loginS(){
}
void setComponents()
{
    Cursor c1 = new Cursor(Cursor.HAND_CURSOR);
    Font f1 = new Font("Poppins", Font.BOLD, 28);

    l1=new JLabel("WELCOME TO LOGIN PAGE");
    l1.setFont(f1);
    l1.setForeground(Color.RED);

    l2=new JLabel("USERNAME");
    l3=new JLabel("PASSWORD");
    l4=new JLabel();
    t1=new JTextField();
    t2=new JPasswordField();
    b1=new JButton("Login");
    b2=new JButton("Clear");

    setLayout(null);
    add(l1);
    add(l2);
    add(l3);
    add(l4);
    add(t1);
    add(t2);
    add(b1);
    add(b2);

    l1.setBounds(25,30,400,30);   //Title
    l2.setBounds(100,100,100,30);  //username
    l3.setBounds(100,200,100,30);  //password
    l4.setBounds(100,350,200,30);
    t1.setBounds(250,100,100,30); //username field
    t2.setBounds(250,200,100,30); //password field
    b1.setBounds(100,300,100,30); //login button
    b1.setCursor(c1);

    b2.setBounds(250,300,100,30); //clear button

    b1.addActionListener(new Login());
    b2.addActionListener(new Clear());
}

public static void main(String []args)
{

loginS s1 = new loginS("WELCOME TO X");
s1.setSize(450,500);
s1.setVisible(true);
s1.setComponents(); //userdefiend func
s1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

class Login implements ActionListener
{
    public void actionPerformed(ActionEvent e1)
    {
        String s1 =t1.getText();
        String s2 =t2.getText();

        if(s1.equals("shifa") && s2.equals("shaikh"))
        {
            l4.setText("login successful");
        }
        else {
            l4.setText("login failed");
        }
    }
}

class Clear implements ActionListener
{
    public void actionPerformed(ActionEvent e1)
    {
        t1.setText("");
        t2.setText("");
    }
}
}
 
