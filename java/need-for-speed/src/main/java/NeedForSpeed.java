class NeedForSpeed {
    private int battery;
    private int distanceDriven;
    private int speed;
    private int batteryDrain;
    
    public NeedForSpeed(int speed, int batteryDrain){
        battery = 100;
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }
    
    public boolean batteryDrained() {
        return battery<1;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (battery-batteryDrain>=0){
            distanceDriven += speed;
            battery -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        NeedForSpeed nitro = new NeedForSpeed(50, 4);
        return nitro;
    }

    public int getSpeed(){
        return speed;
    }

    public int getBattery(){
        return battery;
    }

    public int getDrain(){
        return batteryDrain;
    }
}

class RaceTrack {
    private int distance;
    
    public RaceTrack(int distance){
        this.distance = distance;
    }
    
    public boolean carCanFinish(NeedForSpeed car) {
        int battery = car.getBattery();
        int drain = car.getDrain();
        int speed = car.getSpeed();
        int maxDistance = (battery/drain)*speed;

        return maxDistance>=distance;
    }
}