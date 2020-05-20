package academy.learnprograming;

public class DecimalComparator {
//    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2){
//        // 小数点以下3桁以上、同じ数字であればtrue
//        // そうでなければfalseを返す
//        // d1, d2 < 0, Math.round(d1 - d2) = 0 true
//        // d1, d2 > 0, d1 - d2 != 0, d2 - d1 != 0 false
//        // d1 = d2, true
//        // Math.round(d1 + d2) = 0
//        int roundMinusSum = (int) Math.round(d1 - d2);
//        int roundPlusSum = (int) Math.round(d1 + d2);
//
//        if (d1 == d2) {
//            System.out.println("equal");
//            return true;
//        } else if((d1 > 0 && d2 > 0) && (d1 - d2 != 0 || d2 - d1 != 0)){
//            System.out.println("??");
//            if(d1 - d2 < 0.009 || d2 - d1 < 0.009){
//                return true;
//            } else if(d1 - d2 > 0.01 || d2 - d1 < 0.09){
//                return false;
//            }
//            return true;
//        } else if(roundMinusSum == 0){
//            if (d1 < 0 && d2 < 0 || d1 > 0 && d2 > 0) {
//                return true;
//            }
//            System.out.println("roundMinusSum");
//        } else if (roundPlusSum == 0){
//            if(d1 == 0 && d2 == 0){
//                return true;
//            }
//            System.out.println("roundPlusSum");
//            return false;
//        }
//        System.out.println("None");
//        return false;
//    }
     // top recommended solution
       public static boolean areEqualByThreeDecimalPlaces(double myFirstDouble, double mySecondDouble){
        int myFirstCheck = (int)(myFirstDouble * 1000);
        int mySecondCheck = (int)(mySecondDouble * 1000);
        if(myFirstCheck - mySecondCheck == 0){

            return true;
        } else

            return false;

    }
}
