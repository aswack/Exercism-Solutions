public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double successRate = 1;
        if(0<speed&&speed<5){
            successRate=1;
        }else if(4<speed&&speed<9){
            successRate=.9;
        }else if(speed==9){
            successRate=.8;
        }else if(speed==10){
            successRate=.77;
        }else{
            System.out.println("Invalid Assembly Line Speed");
        }
        return (speed*221)*successRate;
    }

    public int workingItemsPerMinute(int speed) {
        double successRate = 1;
        if(0<speed&&speed<5){
            successRate=1;
        }else if(4<speed&&speed<9){
            successRate=.9;
        }else if(speed==9){
            successRate=.8;
        }else if(speed==10){
            successRate=.77;
        }else{
            System.out.println("Invalid Assembly Line Speed");
        }
        
        return (int)((speed*221)*successRate)/60;
    }
}
