package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
        // メソッドに返り値を書くだけでは、
        // コンソールへ出力されない
        // 宣言した変数に、返り値を代入して、出力命令を出す
        long miles = SpeedConverter.toMilesPerHour(1.5);
        System.out.println("Miles = " + miles);
        SpeedConverter.printConversion(3.5);
    }


}
