package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
    }

//    public static int sumFirstAndLastDigit(int number){
//        if(number < 0){
//            return -1;
//        } else if(number == 0){
//            return 0;
//        } else if (number < 10 && number != 0){
//            return number * 2;
//        }
//
//        int lastDigit = number % 10;
//        while(number > 0){
//            number /= 10;
//            if(number < 10 || number == 0){
//                break;
//            }
//        }
//        return lastDigit + number;
//    }
    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int lastDigit = number % 10;
        while (number > 9) {
            number /= 10;
        }
        return lastDigit + number;
    }
}
