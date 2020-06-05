package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(16, 54));
        System.out.println(getGreatestCommonDivisor(10, 30));
        System.out.println(getGreatestCommonDivisor(465, 360));
    }
    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10){
            return -1;
        }

        int remainder;
        int greatestCommonDivisor = 0;

        if(first > second){
            while(second > 0){
                remainder = first % second;
                if(remainder == 0){
                    return second;
                }
                second %= remainder;
                greatestCommonDivisor = remainder;
            }
        } else {
            while(first > 0){
                remainder = second % first;
                if(remainder == 0){
                    return first;
                }
                first %= remainder;
                greatestCommonDivisor = remainder;
            }
        }
        return greatestCommonDivisor;
    }

    // 回答例
    // 芸術的すぎます
    // 双方の数字が等しくなるまで、大きい数を小さい数でひたすら引いていく
//    public static int getGreatestCommonDivisor(int first, int second) {
//
//        if (first < 10 || second < 10) {
//            return -1;
//        }
//        while (first != second) {
//            if (first > second)
//                first = first - second;
//            else {
//                second = second - first;
//            }
//        }
//        return second;
//    }

}
