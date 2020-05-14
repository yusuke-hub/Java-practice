package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
        // char型
        // 2byte, 16bits
        // 格納できるのは1文字のみ
        // 囲むのはシングルクオテーション
	    char myChar = 'D';

	    // Unicode → unicode-table
        // 異なる言語や文書を変換する為の国際規格
         char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyrightChar = '\u003D';
        System.out.println(myCopyrightChar);
        boolean myTrueBooleanValue =  true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;
    }
}
