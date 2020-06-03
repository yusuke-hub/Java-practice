package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
//        int sum = 0;
//        for(int number = 1; number <= 1000; number++){
//            if(number % 3 == 0 || number % 5 == 0){
//                System.out.println(number);
//                sum += number;
//                if(sum >= 10000){
//                    break;
//                }
//            }
//        }
//        System.out.println(sum);
        int count = 0;
        int sum = 0;

        for(int i=1; i<= 1000; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                count++;
                sum += i;
                System.out.println("Found number = " + i);
            }
            if(count == 5){
                break;
            }
        }
        System.out.println("Sum = " + sum);
    }
}
