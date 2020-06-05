package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));
        System.out.println(isValid(34));
    }
    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if(num1 < 10 || num1 > 1000 || num2 < 10 || num2 > 1000 || num3 < 10 || num3 > 1000){
            return false;
        }
        if(num1 % 10 == num2 % 10 || num1 % 10 == num3 % 10 || num2 % 10 == num3 % 10){
            return true;
        }
        return false;
    }
    public static boolean isValid(int num4){
        if(num4 < 10 || num4 > 1000){
            return false;
        }
        return true;
    }

}
