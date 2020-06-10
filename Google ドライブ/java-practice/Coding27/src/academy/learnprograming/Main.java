// inputThenPrintSumAndAverageというメソッドを書きます。
// このメソッドは何も返さず(void)、キーボードから整数を読み続ける必要があります。
// ユーザーが整数ではない何かを入力したときに、
// "SUM = XX AVG = YY "という形式でメッセージを表示する必要があります。

//XXは、入力されたすべてのint型の数値の合計を表します。
//YYはlong型のすべての数値の計算された平均値を表します。

//ヒント: スキャナを使用して、ユーザからの入力を読み取ることができます。
//ヒント: ラウンド メソッドを呼び出す際には、パラメータとして double を必要とするため、キャスティングを使用します。
//ヒント: 計算された平均値(double)を丸めるには、Math.round メソッドを使用します。メソッド round は long を返します。

//注: 印刷されるメッセージのスペースに注意してください。
//注意: すぐに無効な入力を入力する可能性のあるユーザに注意してください(上記の例を参照してください)。
//注意: inputThenPrintSumAndAverage メソッドは、これまでのコースで行ってきたように、public static として定義する必要があります。
//注意: メインメソッドをソリューションコードに追加しないでください。

package academy.learnprograming;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
    public static void inputThenPrintSumAndAverage(){
//        int counter = 0;
//        int sum = 0;
//        long average = 0;
//
//
//        Scanner scanner = new Scanner(System.in);
//        while(true) {
//            System.out.println("Enter number:");
//            boolean isAnInt = scanner.hasNextInt();
//            if(isAnInt) {
//                counter++;
//                int number = scanner.nextInt();
//                sum += number;
//                average = sum / counter;
//            } else {
//                System.out.println("SUM = 0 AVG = 0");
//                break;
//            }
//            scanner.nextLine();
//        }
//
//        System.out.println("SUM = " + sum + " AVG = " + average);
//        scanner.close();

        // Solution Example
        long sum = 0;
        long average = 0;
        long counter = 0;

        Scanner scanner = new Scanner(System.in);

        while(true) {
            boolean isALong = scanner.hasNextLong();

            if(isALong) {
                counter++;
                sum += scanner.nextLong();
                average = Math.round((double)sum / (double)counter);
            } else {
                break;
            }

            scanner.nextLine();
        }

        System.out.println("SUM = " + sum + " AVG = " + average);
        scanner.close();
    }
}
