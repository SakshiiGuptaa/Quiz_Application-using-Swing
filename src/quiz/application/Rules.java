package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    String name;
    JButton back,start;
    Rules(String name)
    {
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading = new JLabel(" Welcome "+name+" to Simple Minds !");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("Viner Hand ITC",Font.BOLD,30));
        heading.setForeground(new Color(30,144,254));
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20,80,700,350);
        rules.setFont(new Font("Tahoma",Font.PLAIN,18));
        rules.setText(
                "<html>"+
                "1. You will have 15 seconds for each quiz .So, STAY FOCUSED !! "+"<br><br>"+
                "2. If you don't choose any option Then, Next quiz will auto-start."+"<br><br>"+
                "3. 50-50 Button is available to eleminate two worng option."+"<br><br>"+
                "4. It can be used only one time in whole Quiz(50-50) Then, It will be disabled ."+"<br><br>"+
                "5. Proper Time Management is required because 15 seconds is a minute time period .  "+"<br><br>"+  
                "GOOD LUCK"+        
                "<html>"        
        );
        add(rules);

        //another button back----------------
        back = new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.white);
        back.addActionListener(this);
        add(back);
        
        //Button rules-----------
        start = new JButton("Start");
        start.setBounds(400,500,100,30);
        start.setBackground(new Color(30,144,254));
        start.setForeground(Color.white);
        start.addActionListener(this);  
        add(start);
        
        setSize(800,650);
        setLocation(550,200);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==start)
        {
            setVisible(false);
            new Quiz(name);
        }
        else
        {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
     new Rules("user");   
    }
}
