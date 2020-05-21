package academy.learnprograming;

public class TeenNumberChecker {
    public static boolean hasTeen(int age1, int age2, int age3) {
        int [] ages = {age1, age2, age3};
        int i;
        for (i = 0; i < ages.length; i++){
            if(ages[i] >= 13 && ages[i] <= 19) {
                return true;
            }
        }
        return false;
    }
    public static boolean isTeen(int age4) {
        if(age4 >= 13 && age4 <= 19) {
            return true;
        }else {
            return false;
        }
    }
//    most upvoted solution
//    public static boolean hasTeen(int nr1, int nr2, int nr3){
//        return isTeen(nr1) || isTeen(nr2) || isTeen(nr3);
//    }
//
//    public static boolean isTeen(int nr1){
//        return (nr1 >= 13 && nr1 <= 19);
//    }
}
