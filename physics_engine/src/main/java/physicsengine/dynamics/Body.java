package physicsengine.dynamics;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

import physicsengine.Physics.Velocity;
public class Body extends JPanel{
    
    public static int xfirst_position = 50,yfirstposition = 50, width = 100, height = 100;
    @Override
    public void paint(Graphics graphicss){
        super.paintComponent(graphicss);
        Graphics2D g2d = (Graphics2D) graphicss;
        double x_velocity = Velocity.set_velocity(xfirst_position);
        double y_velocity = Velocity.set_velocity(yfirstposition);
        g2d.setColor(Color.RED);
        g2d.fillOval(xfirst_position, yfirstposition, width, height);

        for (int i = 0; i < 100; i++) {
            try {
                //Thread.sleep(5000);
                //g2d.translate(x_velocity, y_velocity);
                System.out.println("x:"+x_velocity+"y:"+y_velocity);
            } catch (Exception e) {
            }
            
        }
        
        

    }



    
    
}
