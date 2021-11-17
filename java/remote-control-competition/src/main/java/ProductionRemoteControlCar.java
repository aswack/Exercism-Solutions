class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
    private int numberofVictories;
    private final int SPEED = 10;
    private int distanceTravelled = 0;
    
    public void drive() {
        distanceTravelled += SPEED;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public int getNumberOfVictories() {
        return numberofVictories;
    }

    public void setNumberOfVictories(int numberofVictories) {
        this.numberofVictories = numberofVictories;
    }

    public int compareTo(ProductionRemoteControlCar car) {
        if (this.numberofVictories == car.getNumberOfVictories()) {
            return 0;
        } else if (this.numberofVictories > car.getNumberOfVictories()) {
            return 1;
        } else {
            return -1;
        }
    }
}