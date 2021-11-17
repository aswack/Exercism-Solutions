public class ExperimentalRemoteControlCar implements RemoteControlCar {
    private final int SPEED = 20;
    private int distanceTravelled = 0;
    
    public void drive() {
        distanceTravelled += SPEED;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }
}
