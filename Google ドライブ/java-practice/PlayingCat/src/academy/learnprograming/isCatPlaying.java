package academy.learnprograming;

public class isCatPlaying {
    public static boolean isCatPlaying(boolean summer, int temperature){
        if((summer == true) && ((temperature < 25) || (temperature > 45))){
            return false;
        }else if((summer == false) && ((temperature < 25) || (temperature > 35))){
            return false;
        }else {
            return true;
        }
    }
}
