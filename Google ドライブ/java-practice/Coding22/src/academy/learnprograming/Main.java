package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
    }
//    public static boolean isPerfectNumber(int number){
//        if(number < 1){
//            return false;
//        }
//        int divisor = 1;
//        int sumOfDivisors = 1;
//        while(divisor < number){
//            divisor++;
//            if(number % divisor == 0){
//                sumOfDivisors += divisor;
//                if(sumOfDivisors == number){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    public static boolean isPerfectNumber(int number){
        if(number < 1){
            return false;
        } else{
            int sumOfDivisors = 0;
            for(int d = 1; d < number; d++){
                if(number % d == 0){
                    sumOfDivisors += d;
                }
            }
            return number == sumOfDivisors;
        }
    }
}
