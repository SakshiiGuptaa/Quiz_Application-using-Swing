
package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    JButton rules,back;
    JTextField tfname;
    Login()
    {
        getContentPane().setBackground(Color.white);
        setLayout(null);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image = new JLabel(i1);
        image.setBounds(0,0,600,500);
        add(image);
        
        JLabel heading = new JLabel("Simple Minds");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,40));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
        JLabel name = new JLabel("Enter your name :");
        name.setBounds(810,150,300,20);
        name.setFont(new Font("Mongolian baiti",Font.BOLD,18));
        name.setForeground(new Color(30,144,254));
        add(name);
        
        tfname = new JTextField();
        tfname.setBounds(735,200,300,25);
        tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
        add(tfname);
        
        //Button rules-----------
        rules = new JButton("Rules");
        rules.setBounds(735,270,125,30);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.white);
        rules.addActionListener(this);
        add(rules);
        
        //another button back----------------
        back = new JButton("Back");
        back.setBounds(915,270,125,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);
        
        setBounds(400,300,1200,500);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == rules)
        {
          String name =tfname.getText();
          setVisible(false);
          new Rules(name);
        }
        else if (ae.getSource() == back)
        {
            setVisible(false);
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
