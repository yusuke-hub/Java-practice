package academy.learnprograming;

// getLargestPrime という名前のメソッドを、
// integer 型の 1 つのパラメータとして number という名前で記述します。
// 数値が負数であったり、素数が存在しない場合、
// このメソッドは無効な値を示すために -1 を返す必要があります。

//このメソッドは、与えられた数の最大素因数を計算してそれを返す必要があります。

//ヒント: 0 と 1 は素数とはみなされないので、素数を含むことはできません。
// 素数:約数がその数と1の２つだけ

// 1, numberの約数を見つける
// 2, その中から素数を見つける
// 3, 見つけた素数をかけていく

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(15));
    }
    public static int getLargestPrime(int number) {
//        if(number < 0){
//            return -1;
//        } else {
//            int divisor;
//            ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
//            for(int i = 1; i < number + 1; i++){
//                if(number % i == 0){
//                    divisor = i;
//                    for(int i2 = 1; i2 < divisor + 1; i2++){
//                        if((i2 != 1) && (i2 != divisor)){
//                            if(divisor % i2 == 0){
//                                continue;
//                            } else {
//                                primeNumbers.add(divisor);
//                            }
//                        }
//
//                    }
//                }
//            }
//            System.out.println(primeNumbers);
//            return 1;
//
//        }
        if (number < 2) {
            return -1;
        }
        //      number i
        // 2周目 15 3
        // 3     5 4
        // 4     1 5
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                System.out.println(number);
                number /= i;
                i--;
            }
        }
        return number;
    }
}
