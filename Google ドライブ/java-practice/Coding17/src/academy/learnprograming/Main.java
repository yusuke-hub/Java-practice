package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(23456));
    }
    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }
        int evenDigitSum = 0;
        while(number > 9){
            int lastDigit = number % 10;
            if(lastDigit % 2 == 0){
                evenDigitSum += lastDigit;
            }
            number /= 10;
        }
        if(number % 2 == 0){
            evenDigitSum += number;
        }

        return evenDigitSum;
    }

    // 回答例
//    public static int getEvenDigitSum(int number) {
//
//        if(number < 0) {
//            return -1;
//        }
//
//        int sum = 0;
//        int isItEven = 0;
//        while(number > 0) {
//            isItEven = number%10;
//            if(isItEven % 2 ==0) {
//                sum += isItEven;
//            }
//            number /= 10;
//        }
//        return sum;
//    }
}
