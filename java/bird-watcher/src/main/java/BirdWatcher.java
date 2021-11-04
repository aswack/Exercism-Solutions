class BirdWatcher {
    private final int[] birdsPerDay;
    
    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }
    
    public int[] getLastWeek() {
        return birdsPerDay;
    }
    
    public int getToday() {
        if(birdsPerDay.length!=7) return 0;
        return birdsPerDay[birdsPerDay.length-1];
    }
    
    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length-1] += 1;
    }
    
    public boolean hasDayWithoutBirds() {
        for(int dailyBirds : birdsPerDay){
            if(dailyBirds==0) return true;
        }
        return false;
    }
    public int getCountForFirstDays(int numberOfDays) {
        if(numberOfDays>birdsPerDay.length) numberOfDays=birdsPerDay.length;
        int count = 0;
        for(int i=0; i<numberOfDays;i++){
            count += birdsPerDay[i];
        }
        return count;
    }
    
    public int getBusyDays() {
        int busyDay = 0;
        for(int dailyBirds : birdsPerDay ){
            if (dailyBirds>4) busyDay++;
        }
        return busyDay;
    }
}