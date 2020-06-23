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

    // 正規表現の活用
    // 1 *: 直前の文字の0回以上の繰り返しを意味する
    // 2 .: 任意の１文字
    // 3 指定回数の繰り返し
        // {n}: 直前の文字のn回の繰り返し
        // {n,}: 直前の文字のn回以上の繰り返し
        // {n,m}: 直前の文字のn回以上m回以下の繰り返し
        // ?: 直前の文字の0回または1回の繰り返し
        // +: 直前の文字の1回以上の繰り返し
    // 4 []: []ないのどれか1文字に当てはまる
    // 5 [-]: -記号の両端にある文字を含む範囲の任意の1文字を含む
    // 6 ^: 文字列の先頭 ＄: 文字列の末尾


    // ＄d: いずれかの数字 [0-9]
    // ＄w: 英字、数字、アンダーバー [a-zA-Z_0-9]
    // ＄s: 空白文字
    // 入力チェック判定を行うメソッド → めっちゃ大変!
    boolean isValidPlayerName(String name) {
        if(name.length() != 8) {
            return false;
        }
        char first = name.charAt(0);
        if(!(first >= 'A' && first <= 'Z')) {
            return false;
        }
        for(int i = 1; i < 8; i++) {
            char c = name.charAt(i);
            if(!(c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9')) {
                return false;
            }
        }
        return true;
    }

    boolean isValidPlayerName2(String name) {
        return name.matches("[A-Z][A-Z0-9]{7}");
    }


}
