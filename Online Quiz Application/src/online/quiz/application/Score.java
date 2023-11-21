
package online.quiz.application;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
  
   
    
    
    Score(String name, int score){
        
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);

        // Use BorderLayout to align the image and question panel
        setLayout(null);

        // Add the image to the top of the frame
        ImageIcon image1 = new ImageIcon("E:\\Lab Final\\Online Quiz Application\\src\\online\\icons\\score.png");
        Image image2 = image1.getImage().getScaledInstance(300, 200,Image.SCALE_DEFAULT);
        ImageIcon image3 = new ImageIcon(image2);
        JLabel image = new JLabel(image3);
        image.setBounds(0, 200, 300, 250);
        add(image, BorderLayout.NORTH);
        
       
        JLabel heading = new JLabel("Thank you "+ name + " for your perticpation");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(heading);
        
        JLabel scores = new JLabel("You Score is: "+ score);
        scores.setBounds(350, 200, 300, 30);
        scores.setFont(new Font("Tahoma", Font.PLAIN, 24));
        add(scores);
        
        JButton submit = new JButton("Take Again");
        submit.setBounds(350, 270, 120, 30);
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setEnabled(false);
        add(submit);
        
        setVisible(true);
         
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
        
    }
    
    public static void main(String[] args){
        new Score("user", 0);
    }
    
}
