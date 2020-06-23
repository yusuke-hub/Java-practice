package academy.learnprograming;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // StringBuilder
        // 内部に連結した文字列を蓄えるメモリ領域(バッファ)を持っている
            // 1, append()メソッドを読んでバッファに文字列を追加する(必要に応じた回数を呼び出す)
            // 2, 最後に1回toString()を呼び、完成した連結済みの文字列を取り出す
            // * 本来であれば、バッファに文字列を追加するためであれば
            // 戻り値はvoidで良いはずだが、以下のような呼び出し方(メソッドチェーン）を実現するために、自分自身を戻り値として返すようになっている
            // sb.append("hello").append("java").append("world");

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 10000; i++) {
            sb.append("Java");
        }
        String s = sb.toString();
        System.out.println(s);

        String str = "こんにちはJava";
        char[] data1 = str.toCharArray();
        System.out.println(Arrays.toString(data1));

    }
}
