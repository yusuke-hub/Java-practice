package academy.learnprograming;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(findMin(readIntegers(3)));
    }

    public static int[] readIntegers(int count) {
        int[] integers = new int[count];
        System.out.println("Enter " + count + " integers");
        for(int i=0; i<count; i++) {
            integers[i] = scanner.nextInt();
            System.out.println((i+1) + " number is " + integers[i]);
        }
        return integers;
    }

    public static int findMin(int[] array) {
        int minimum = array[0];
        for(int i=0; i<=array.length-1; i++) {
            if(minimum > array[i]) {
                minimum = array[i];
            }
        }
        System.out.println("Minimum Element is " + minimum);
        return minimum;
    }
}
