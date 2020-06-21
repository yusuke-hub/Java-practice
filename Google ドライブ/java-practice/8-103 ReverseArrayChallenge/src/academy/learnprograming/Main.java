package academy.learnprograming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] array = {1,2,3,4,5};
	    reverse(array);
    }

    // 反転後の配列を代入するための変数を用意
    // 最後から始まるインデックス
    // 最初から始まるインデックス
    private static void reverse(int[] array) {
        int[] reversedArray = Arrays.copyOf(array, array.length);
        int reversedInt = 0;
        int count = 0;

        while(count < array.length) {
            for(int i=array.length-1; i>=0; i--) {
                reversedInt = array[i];
                reversedArray[count] = reversedInt;
                count++;
            }
        }
        System.out.println(Arrays.toString(reversedArray));
    }
}
