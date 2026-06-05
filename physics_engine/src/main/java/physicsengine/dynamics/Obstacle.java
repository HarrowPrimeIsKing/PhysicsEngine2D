package physicsengine.dynamics;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JLabel;

public class Obstacle extends JLabel {
    public static int x_position = 100,y_position = 400,width = 300, height= 100;
    int velocit = 10;

    @Override
    public void paint(Graphics graphicsObstacle){
        Graphics2D g2d = (Graphics2D) graphicsObstacle;
        
        g2d.setColor(Color.gray);
        g2d.drawRect(x_position, y_position, width, height);
        while (true){
            x_position += velocit;
            velocit += 10;
            g2d.fillRect(x_position, y_position, width, height);
        }
        


    }
    
}
