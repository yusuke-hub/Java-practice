package academy.learnprograming;

public class EqualSumChecker {
    public static boolean hasEqualSum(int firstInt, int secondInt, int thirdInt) {
//        my solution
//        if(firstInt + secondInt == thirdInt){
//            return true;
//        } else {
//            return false;
//        }

        // tried to switch statement
        // 上記をもう少し簡単に書けないかな？
        // と思ってやってみたけど、無理だった笑
        // switch文の引数に入れる値は定数でないと、ダメ
        // 右辺をメソッドの引数を利用した計算にした場合、定数にはならないので
        // finalをつけた時点で、エラーになる

        // staticメソッドの復習
        // newを使わずに呼び出すことができるようになる
//        final int sumOfTwoInt = firstInt + secondInt;
//        switch (thirdInt) {
//            case sumOfTwoInt:
//                return true;
//            break;
//            default:
//                return false;
//        }

        return firstInt +secondInt == thirdInt;



    }
}
