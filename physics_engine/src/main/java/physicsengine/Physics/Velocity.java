package physicsengine.Physics;
import javax.swing.Timer;
public class Velocity {

    public static double set_velocity(double velocity){
        
        Timer timer = new Timer(0, null);
        double deltatime = System.nanoTime();
        velocity = (velocity *deltatime)/2;
        return velocity;


    }
    
}
