public class ElonsToyCar {
    
    int milesDriven = 0;
    int batteryLevel = 100;
    
    public static ElonsToyCar buy() {
        ElonsToyCar car = new ElonsToyCar();
        return car;
    }

    public String distanceDisplay() {
        return "Driven "+milesDriven+" meters";
    }

    public String batteryDisplay() {
        if(batteryLevel>0) return "Battery at "+batteryLevel+"%";
        else return "Battery empty";
    }

    public void drive() {
        if(batteryLevel>0){
            milesDriven += 20;
            batteryLevel -= 1;
        }
    }
}
