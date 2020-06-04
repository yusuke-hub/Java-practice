package academy.learnprograming;

// whileループは、ブロックを実行する前に開始時の条件をチェックします。
// do whileループでは、コードブロックが少なくとも一度は実行され、その後で条件がチェックされます。
// 条件には注意してください。ヒント: 条件や式は常にチェックしてください。
    // continue文や/またはbreak文を使ってループを中断させることができます。
    // continue キーワードを使用すると、
    // ループは continue キーワード以下のコードブロックの部分をバイパスして次の反復を続けます。
    // break キーワードを使用すると、チェックしている条件に応じてループを終了することができます。

public class Main {

    public static void main(String[] args) {
//        int count = 5;
//        while(count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        for(int i=6; i!=6; i++){
//            System.out.println("Count value is " + count);
//          }

        // 条件式の真偽に関係なく、必ず一回は処理が実行される
//        do {
//            System.out.println("Count value is " + count);
//            count++;
//        } while(count != 6);

        // countを再代入しないと、無限ループになってしまう
//        count = 1;
//        while(true) {
//            if(count == 5) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        for(count = 1; count < 6; count++){
//            System.out.println("Count value is " + count);
//        }

        // 問題1
        // int 型のパラメータを取る isEventNumber というメソッドを作成します。
        // このメソッドの目的は、メソッドに渡された引数が偶数であるかどうかを判断することです。
        // 偶数であれば true を返し、そうでなければ false を返します。
//        System.out.println(Challenge.isEventNumber(45));
//        int number = 4;
//        int finishNumber = 20;
//        int evenSum = 0;
//
//        while (number <= finishNumber){
//            number++;
//            if(!Challenge.isEvenNumber2(number)){
//                continue;
//            }
//            System.out.println("Even number " + number);
//            evenSum += number;
//            System.out.println("The even sum is " + evenSum);
//        }



        // 問題2
        // 上記のwhileコードを修正します。
        // 見つかった偶数の総数を記録し、5個見つかったらブレークし
        // 最後に見つかった偶数の総数を表示するようにします。

        // my solution
//        int number = 4;
//        int finishNumber = 20;
//        int count = 0;
//        int evenSum = 0;
//
//        while (number <= finishNumber && count < 5){
//            number++;
//            if(!Challenge.isEvenNumber2(number)){
//                continue;
//            } else {
//                count++;
//                System.out.println("Even number " + number);
//                evenSum += number;
//                System.out.println("The even sum is " + evenSum);
//            }
//        }

        // 回答例
        // 冒頭で条件式に当てはまらない場合、処理を中断するよう書いておき
        // 後ろで条件式を満たす場合の処理を書いておく
        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber){
            number++;
            if(!Challenge.isEvenNumber2(number)){
                continue;
            }
            evenNumbersFound++;
            if(evenNumbersFound >= 5) {
                break;
            }
            System.out.println("Even number " + number);
        }
        System.out.println("Total even numbers found = " + evenNumbersFound);

    }
}
