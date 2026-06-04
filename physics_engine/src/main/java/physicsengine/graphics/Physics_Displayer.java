package physicsengine.graphics;
import java.awt.Color;

import javax.swing.JFrame;

import physicsengine.dynamics.Body;
public class Physics_Displayer {
    public static void main(String[] args) {
        
        System.out.println("Starting physics engine..."); 
        displayMain(400, 200, 800, 600);
    }
    public static void displayMain(int xPosition, int yPosition, int width, int height) {
        JFrame mainFrame = new JFrame("Physics Engine"); // It helps to give it a title
        
        
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // 3. FIX: To color a JFrame, you actually have to color its "Content Pane"
        mainFrame.getContentPane().setBackground(Color.green.darker());
        mainFrame.setSize(600,300);
        mainFrame.setBounds(xPosition, yPosition, width, height);
        mainFrame.setVisible(true); 
        mainFrame.add(new Body());
        //body.setLocation(2,200);

        //body.paint();
        //Body.Paint_Circle(xPosition, yPosition, 150, 340);
    }
}