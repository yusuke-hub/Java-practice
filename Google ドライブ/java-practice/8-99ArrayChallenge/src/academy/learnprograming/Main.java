package academy.learnprograming;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] values = getIntegers(5);
        printArray(values);
    }

    public static int[] getIntegers(int number) {
        Scanner scanner = new Scanner(System.in);
        int[] values = new int[number];
        for(int i=0; i<values.length; i++) {
            values[i] = scanner.nextInt();
        }
        for(int i=0; i<values.length; i++) {
            System.out.println("Index" + i + " : Element" + values[i]);
        }
        return values;
    }

    public static void printArray(int[] values) {
        System.out.println(Arrays.toString(values));
    }

//    public static int[] sortIntegers(int[] arrays) {
//        // なぜ引数arraysにエラーが出る？
//        // そしてなぜこの処理をreturnで返せない？
//
//    }

}
