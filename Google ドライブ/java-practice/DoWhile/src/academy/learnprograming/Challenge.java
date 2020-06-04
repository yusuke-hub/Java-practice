package academy.learnprograming;

public class Challenge {


    public static boolean isEventNumber(int number){
        while(number % 2 == 0){
            return true;
        }
        return false;
    }
    public static boolean isEvenNumber2(int number){
        if((number % 2) == 0){
            return true;
        } else {
            return false;
        }
    }

}
