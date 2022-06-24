/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graphics;
import java.awt.*;
import javax.swing.*;
        class myGraphics extends Component
        {     
            
           
public void paint (Graphics g)
{
     
    Graphics2D g2 = (Graphics2D)g;
   
g2.setBackground(Color.yellow);
    BasicStroke a =new BasicStroke(10.0f,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND);
g2.setStroke(a);

g2.drawLine(210, 210, 310, 210);

g2.drawRect(10, 10, 130, 100);
g2.setColor(Color.blue);
g2.fillRect(100, 90, 100, 50);
g2.setColor(Color.BLACK);
g2.drawRect(120, 120, 170, 140);
g2.setColor(Color.MAGENTA);
g2.setColor(Color.WHITE);
g2.fillOval(25, 200, 70, 30);


}
}

/**
 *
 * @author hab67
 */
public class Graphicsproject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        myGraphics mg=new myGraphics();
        JFrame f= new JFrame("Graphics Example");
       
        f.add(mg);
        f.setVisible(true);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // TODO code application logic here
    }
    
}
