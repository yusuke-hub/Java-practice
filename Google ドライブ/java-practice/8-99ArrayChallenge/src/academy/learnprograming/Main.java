package academy.learnprograming;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] values = getIntegers(10);
        printArray(sortIntegers(values));
        Arrays.toString(sortIntegers(values));

//        ★ My Solution
//        int[] values = getIntegers(7);
//        printArray(values);
//        System.out.println(sortIntegers(values));
    }
    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integer values:\r");
        for(int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            // element 0 50
            // element 1 160
            // element 2 40

            for(int i=0; i<sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }

//    ★ My Solution
//    public static int[] getIntegers(int number) {
//        Scanner scanner = new Scanner(System.in);
//        int[] values = new int[number];
//        for(int i=0; i<values.length; i++) {
//            values[i] = scanner.nextInt();
//        }
//        for(int i=0; i<values.length; i++) {
//            System.out.println("Index" + i + " : Element" + values[i]);
//        }
//        return values;
//    }
//
//    public static void printArray(int[] values) {
//        System.out.println(Arrays.toString(values));
//    }
//
//    public static int[] sortIntegers(int[] arrays) {
//        int largerNumber;
//        int smallerNumber;
//        int smallerNumber2;
//        // なぜ引数arraysにエラーが出る？
//        // そしてなぜこの処理をreturnで返せない？
//        for(int i = arrays.length-1; i>=0; i--) {
//            if(arrays[i] > arrays[0]) {
//                largerNumber = arrays[i];
//                arrays[i] = arrays[0];
//                arrays[0] = largerNumber;
//            }
//            if(i<4) {
//                if(arrays[i]<arrays[i+1]) {
//                    smallerNumber = arrays[i];
//                    arrays[i] = arrays[i+1];
//                    arrays[i+1] = smallerNumber;
//                    if(arrays[i+1]<arrays[i+2]){
//                        smallerNumber2 = arrays[i+1];
//                        arrays[i+1] = arrays[i+2];
//                        arrays[i+2] = smallerNumber2;
//                    }
//                }
//            }
//        }
//        System.out.println(Arrays.toString(arrays));
//        return arrays;
//    }

    // int[] values = {3,4,7,6,1,8}
    // if(values[i] < values[i+1]){
    //  values[i] = value[i+1]
    //  values[i+1] = values[0]
    // }
    // 1番目と2番目を比べる
    //


}
