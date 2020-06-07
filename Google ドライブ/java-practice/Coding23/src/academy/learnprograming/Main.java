package academy.learnprograming;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;

// numberという名前のintパラメータを持つ numberToWordsというメソッドを書きます。
//このメソッドは、渡された数値を数字の単語を使って出力しなければなりません。
//数値が負の場合は、'Invalid Value'と表示します。
//数字を単語としてprintするには、以下の手順に従います。

//1. 余り演算子を使用して、指定された数字の最後の桁を抽出します。
//2. ステップ 1 で見つけた桁の値を単語に変換します。
    // その数字には、0,1,2,3,4,5,6,7,8,9 の10の値があります。各桁に対応する単語を表示します。
    // 例えば、0 の場合は "Zero"、1 の場合は "One" と表示します。
//3.数字から最後の一桁を削除します。
//4. 数字が0になるまで、手順2から4を繰り返します。

// 上記のロジックは正しいのですが、現在の状態では逆順に単語がprintされてしまいます。
// 例えば、数字が234の場合、上記のロジックでは「Two Three Four」ではなく「Four Three Two」という出力になります。
// この問題を克服するために、逆引きと呼ばれる第二の方法を書きます。

//reverseメソッドは、1つのintパラメータを持ち、逆数(Int)を返すようにします。
    // 例えば、渡された数字が234であれば、逆数は432になります。reverseメソッドは負の数も反転させなければなりません。

//単語を正しい順序で表示するには、 numberToWords メソッドの中にある reverse メソッドを使用します。

//もう一つ注意しなければならないのは、先頭にゼロを含む逆数です(例えば、100の逆数は001です)。
// 上記の numberToWords メソッドのロジックでは "One" と表示されますが、これは正しくありません。本来は「One Zero Zero」と表示されるべきです。
// この問題を解決するには、getDigitCountという3番目のメソッドを書きます。

//getDigitCountメソッドは、numberと呼ばれる1つのintパラメータを持ち、その数字の中の桁数を返します。
// numberが負の場合は、無効な値を示すために-1を返します。
//例えば、数値が100の場合、100は3桁(1,0,0)なので、getDigitCountメソッドは3を返します。

//HINT:forループを使用して、数値を反転させた後にゼロを表示します。先ほどの例のように、100を反転させると1になりますが、 numberToWordsメソッドは「1つのZwro Zero」と表示する必要があります。ゼロの数を求めるには、元の数字と反転した数字の桁数の差を確認してください。

//注意： numberToWords, getDigitCount,reverseのメソッドは、これまでのコースで行ってきたようにpublic staticとして定義してください。
//注意：合計で3つのメソッドを書く必要があります。
//注意: 解答コードにメインメソッドを追加しないでください。

public class Main {
    public static void main(String[] args) {

    }
//    private static Map<Integer, String> numNames = new HashMap<Integer, String>() {
//        {
//            put(0, "Zero");
//            put(1, "One");
//            put(2, "Two");
//            put(3, "Three");
//            put(4, "Four");
//            put(5, "Five");
//            put(6, "Six");
//            put(7, "Seven");
//            put(8, "Eight");
//            put(9, "Nine");
//        }
//    };
//
//        public static void numberToWords(int number){
//            if(number < 0){
//                System.out.println("Invalid Value");
//            } else{
//                number = reverse(number);
//                int removedNum;
//                int aDigitRemovedNum;
//                while(number != 0){
//                    removedNum = number % 10;
//                    number /= 10;
//                    for(Map.Entry<Integer, String> entry : numNames.entrySet()){
//                        if(removedNum == entry.getKey()){
//                            System.out.println(entry.getValue());
//                        }
//                    }
//                }
//            }
//        }
//        public static int reverse(int number){
//            String numberStr1 = String.valueOf(number);
//            String reversedNumberStr = new StringBuffer(numberStr1).reverse().toString();
//            return Integer.parseInt(reversedNumberStr);
//        }
//        public static int getDigitCount(int number){
//            if(number < 0){
//                return -1;
//            } else{
//                return String.valueOf(number).length();
//            }
//        }
public static void numberToWords(int number) {

    if (number < 0) {
        System.out.println("Invalid Value");
    }
    // 1234
    // reverseNumber = 4321
    // i             0 1 2 3
    // reverseNumber 432 43 4 0
    // reverseNumber % 10 1 2 3 4
    // getDigitCount(number) = 4
    int reverseNumber = reverse(number);
    for (int i = 0; i < getDigitCount(number); i++) {

        switch (reverseNumber % 10) {
            case 0:
                System.out.print("Zero ");
                break;
            case 1:
                System.out.print("One ");
                break;
            case 2:
                System.out.print("Two ");
                break;
            case 3:
                System.out.print("Three ");
                break;
            case 4:
                System.out.print("Four ");
                break;
            case 5:
                System.out.print("Five ");
                break;
            case 6:
                System.out.print("Six ");
                break;
            case 7:
                System.out.print("Seven ");
                break;
            case 8:
                System.out.print("Eight ");
                break;
            case 9:
                System.out.print("Nine ");
                break;
            default:
                break;
        }
        reverseNumber /= 10;
    }

    System.out.println();
}

    public static int reverse(int number) {

        int reverseNumber = 0;

        while (number != 0) {
            reverseNumber = (reverseNumber * 10) + (number % 10);
            number /= 10;
        }
        return reverseNumber;
    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }

        // numberが2桁以上だったら、1スタートのカウントに1をプラスする
        int counter = 1;
        while (number > 9) {
            number /= 10;
            counter++;
        }
        return counter;
    }

    }





