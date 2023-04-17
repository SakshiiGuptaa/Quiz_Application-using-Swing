package quiz.application;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Score extends JFrame implements ActionListener{
    Score(String name , int score)
    {
        setBounds(600,250,750,550);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        
        //For image 
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(10,200,300,250);
        add(image);
        
        JLabel heading = new JLabel("Thank You "+name +" for playing Simple Minds!");
        heading.setBounds(45,45,700,50);
        heading.setFont(new Font("COMIC SANS MS",Font.BOLD,26));
        add(heading);
        
        JLabel lblscore = new JLabel("Your Score is : "+score);
        lblscore.setBounds(350,200,300,50);
        lblscore.setFont(new Font("Cursive",Font.BOLD,26));
        add(lblscore);
          
        JButton Submit = new JButton("Play Again");
        Submit.setFont(new Font("Tahoma",Font.PLAIN,14));
        Submit.setBounds(380,270,200,40);
        Submit.setBackground(new Color(30,144,255));
        Submit.setForeground(Color.white);
        Submit.addActionListener(this);
        add(Submit);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login();
    }
    
    public static void main(String[] args) {
        new Score("user",0);
    }
}
