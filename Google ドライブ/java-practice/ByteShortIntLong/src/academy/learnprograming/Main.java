// ファイルの実行 Ctrl + R
// 置換 Ctrl + L

package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;
        // Wrapper Class
        // 基本データ型の値を持つ事ができ、様々な便利なメソッドを用意したクラスが用意されているクラス
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);

        // Overflow ⇄ Underflow
        // 決められたデータ型の範囲をオーバーしてしまう事
        System.out.println("Busted MAX Value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN Value = " + (myMinIntValue - 1));
        int myMaxIntTest = 2_147_483_647;

        // byte型
        // 8ビット / -128 - 127
        byte myMinByteValue = Byte .MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value =" + myMinByteValue);
        System.out.println("Byte Maximum Value =" + myMaxByteValue);

        // short型
        // 16ビット / -32768 - 32767
        short myMinShortValue = Short .MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value =" + myMinShortValue);
        System.out.println("Short Maximum Value =" + myMaxShortValue);

        // Long型
        // 64ビット / -9223372036854775807 - 9223372036854775808
        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value =" + myMinLongValue);
        System.out.println("Long Maximum Value =" + myMaxLongValue);
        // 桁数が長い値を代入する時、末尾にLをいれる
        // 小文字のlだと1と混乱するのでL
        short bigLongLiteralValue = 32767;

        // Casting
        // Javaでは全ての数字をデフォルトでIntとして扱う
        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue / 2);
        short myNewShortValue = (short) (myMinShortValue / 2);

        int chalIntValue = 60;
        byte chalByteValue = 120;
        short chalShortValue = 4820;
        long chalLongValue = (long)((chalIntValue + chalByteValue + chalShortValue) * 10);
        System.out.println(chalLongValue);

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        // long型に関しては、Castingの例外
        // Javaが右辺を自動的にlong型と評価してくれるので、LとしなくてもOK
        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        System.out.println(longTotal);

        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
    }
}
