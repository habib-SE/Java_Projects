/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guiprogram;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 *
 * @author HABIB UR REHMAN
 */
public class GUIprogram extends JFrame {
    JFrame f;
    public GUIprogram(){
        new JFrame();
        JLabel userL=new JLabel("User Name:");
        userL.setBounds(20,70,80,20);
        JTextField userF=new JTextField();
        userF.setBounds(20,100,150,20);
        JLabel passL=new JLabel("Possword:");
        passL.setBounds(20,130,80,20);
        JTextField passF=new JTextField();
        passF.setBounds(20,160,150,20);
         JButton buttonLogin=new JButton("Login");
      buttonLogin.setBounds(20,190,72,20);
      JButton buttonClose=new JButton("Close");
      buttonClose.setBounds(98,190,72,20);
        this.add(userL);
        this.add(userF);
 this.add(passL);
 this.add(passF);
 this.add(buttonLogin);
 this.add(buttonClose);
  this.setLocation(200,100);
      this.setLayout(null);
      this.setSize(400,500);
      this.setVisible(true);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      buttonClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
                
            }
        });
          buttonLogin.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent e){
       
          JOptionPane.showMessageDialog(null,"you have loged in");
        }
        
     });
        
        
    }
            

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new GUIprogram();
        
        // TODO code application logic here
    }

    
    
}
