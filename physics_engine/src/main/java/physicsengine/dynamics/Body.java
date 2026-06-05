package physicsengine.dynamics;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;
public class Body extends JPanel{
    double xvelocit = 0.1;
    public static int xfirst_position = 50,yfirstposition = 50, width = 100, height = 100;
    @Override
    public void paint(Graphics graphicss){
        super.paintComponent(graphicss);
        Graphics2D g2d = (Graphics2D) graphicss;
        
        g2d.setColor(Color.RED);
        g2d.fillOval(xfirst_position, yfirstposition, width, height);

           while (true){
            xfirst_position += xvelocit;
            xvelocit += 0.01;
            g2d.fillRect(xfirst_position, yfirstposition, width, height);
            System.out.println(xfirst_position);
        }
        
        

    }



    
    
}
