package physicsengine.Physics;
public class Velocity {

    public static double set_velocity(double velocity){
        
        double deltatime = System.currentTimeMillis();
        velocity = (velocity *deltatime)/2;
        return velocity;
        
        


    }
    
}
