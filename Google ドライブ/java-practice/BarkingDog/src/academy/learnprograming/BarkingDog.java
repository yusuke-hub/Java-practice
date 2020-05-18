package academy.learnprograming;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay) {
        if(isBarking == true){
            if(hourOfDay >= 0 && hourOfDay < 8 || hourOfDay > 22 && hourOfDay <=23) {
                return true;
            } else if(hourOfDay < 0 || hourOfDay > 23){
                return false;
            } else{
                return false;
            }
        } else return false;
    }
}
