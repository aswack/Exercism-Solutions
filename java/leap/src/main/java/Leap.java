class Leap {

    boolean isLeapYear(int year) {
        if(year%4==0){
            if(!(year%400==0)&&year%100==0){
                return false;
            }else{
                return true;
            }
        }else{
            return false;
        }
    }
}
