package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
        int result = 4 + 5;
        System.out.println("4 + 5 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 5;
        System.out.println("9 - 5 = " + result);

        result = result * 12;
        System.out.println("4 * 12 = " + result);

        result = result / 4;
        System.out.println("48 / 4 = " + result);


        result = result % 5;  // the remainder : 剰余、余り
        System.out.println("12 % 5 = " + result);

        // abbreviation: 省略形
        result++;
        System.out.println("2 + 1 = " + result);

        result--;
        System.out.println("3 - 1 = " + result);

        result += 2;
        System.out.println("2 + 2 = " + result);

        result *= 10;
        System.out.println("4 * 10 = " + result);

        result /= 3;
        System.out.println("40 / 3 = " + result);

        result -= 2;
        System.out.println("13 - 2 = " + result);

    }
 }

