package academy.learnprograming;

public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        if(number < 0){
            number *= -1;
        }

        int remainder = 0;
        int sum = 0;
        int reverse = number;

        while(number != 0){
            remainder = number % 10;
            sum = (sum * 10) + remainder;
            number = number / 10;
        }
        if(reverse != sum){
            return false;
        }
        return true;
    }
}
