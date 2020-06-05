package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,23));
    }
    public static boolean hasSharedDigit(int num1, int num2){
        // mnum2 solution1
//        int anotherNum1;
//        int anotherNum2;
//        if((num1 >= 10 && num1 <= 99) && (num2 >= 10 && num2 <= 99)){
//            while(num1 != 0){
//                num1 /= 10;
//                anotherNum1 = num1 % 10;
//                while(num2 != 0) {
//                    num2 /= 10;
//                    anotherNum2 = num2 % 10;
//                    if (anotherNum1 != anotherNum2) {
//                        continue;
//                    }
//                    return true;
//                }
//            }
//        }
//        return false;
        
        // mnum2 solution2
//        if((num1 > 9 && num1 < 100) || (num2 > 9 && num2 < 100)){
//            return false;
//        }
//        int num1Digit;
//        int num2Digit;
//        while(num1 > 0){
//            num1 /= 10;
//            num1Digit = num1 % 10;
//            while(num2 > 0){
//                num2 /= 10;
//                num2Digit = num2 % 10;
//                if(num1Digit == num2Digit){
//                    return true;
//                }
//            }
//        }
//        return false;
        
        // 回答例
        if((num1 > 99) || (num1 < 10) || (num2 > 99) || (num2 < 10)) {
            return false;
        }else {
            return((num1/10 == num2/10)||(num1/10 == num2 % 10)||(num2/10 == num1 % 10)||(num1%10 == num2%10));
        }        
    }
}
