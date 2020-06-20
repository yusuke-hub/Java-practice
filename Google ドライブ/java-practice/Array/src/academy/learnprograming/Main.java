package academy.learnprograming;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        for(int i=0; i<myIntegers.length; i++) {
            System.out.println("Element " + i + ", typed value was " + myIntegers[i]);
        }
        System.out.println(getAverage(myIntegers));
    }
    // コマンドライン上で指定した数だけ、数字を入力して出力する
    public static int[] getIntegers(int number) {
        System.out.println("Enter " + number + " integer values.\r");
        int[] values = new int[number];

        for(int i= 0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    // 入力した数の平均を取得する
    public static double getAverage(int[] array) {
        int sum = 0;
        for(int i=0; i< array.length; i++) {
            sum += array[i];
        }
        return (double) sum / (double)array.length;
    }

}
