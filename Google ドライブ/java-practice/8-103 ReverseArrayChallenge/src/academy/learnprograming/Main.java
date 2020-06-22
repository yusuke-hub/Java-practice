package academy.learnprograming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = { 1, 5, 3, 7, 11, 9, 15};

        System.out.println("Array = " + Arrays.toString(array));

        reverse(array);

        System.out.println("Reversed array = " + Arrays.toString(array));
//	    int[] array = {1,2,3,4,5};
//	    reverse(array);
    }

    private static void reverse(int[] array) {

        int maxIndex = array.length -1;
        int halfLength = array.length / 2; // 2で割らないと、2回反転させることになるので結局要素の順番は変わらない
        for(int i=0; i< halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex -i];
            array[maxIndex - i] = temp;
        }
    }
//    ★ My Coding
// 反転後の配列を代入するための変数を用意
// 最後から始まるインデックス
// 最初から始まるインデックス
//    private static void reverse(int[] array) {
//        int[] reversedArray = Arrays.copyOf(array, array.length);
//        int reversedInt = 0;
//        int count = 0;
//
//        while(count < array.length) {
//            for(int i=array.length-1; i>=0; i--) {
//                reversedInt = array[i];
//                reversedArray[count] = reversedInt;
//                count++;
//            }
//        }
//        System.out.println(Arrays.toString(reversedArray));
//    }
}
