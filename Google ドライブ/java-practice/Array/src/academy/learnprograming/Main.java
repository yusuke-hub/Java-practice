package academy.learnprograming;

public class Main {

    public static void main(String[] args) {

        int[] myIntArray = new int[25]; // {1,2,,3,4,5,6,7,8,9,10}
//        myIntArray[0] = 45;
//        myIntArray[1] = 476;
//        myIntArray[5] = 50;

        // myIntArrayの箇所を30にするとエラーになる
        // 配列へのアクセスは存在する要素のみなので、要素が存在しない
        // インデックスを指定するとエラーになる
        for(int i=0; i<myIntArray.length; i++) {
            myIntArray[i] = i*10;
        }
        printArray(myIntArray);
    }
    // 配列を引数にしたメソッドを定義する
    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}
