package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
        printFactors(12);
    }
    public static void printFactors(int number){
        if(number < 1){
            System.out.println("Invalid Value");
        }
        int factor = number;
        for(int i = 1; i < number + 1; i++){
            if(number % i == 0){
                System.out.println(i);
            }
        }
    }
}
