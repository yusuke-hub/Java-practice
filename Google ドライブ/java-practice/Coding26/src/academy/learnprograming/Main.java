package academy.learnprograming;
// このメソッドは、星(*)で構成された長方形のパターンを生成するために、
// 対角線をプリントする必要があります。
// これはループ(下記の例を参照)を使うことで実現できます。

// 上のパターンは、行と列の数(ここで、数は印刷する行の数)で構成されています。
// それぞれの行や列には、4つの条件に基づいて星が印刷されます。

// 最初の行または最後の行にある。
// 最初の列または最後の列に
// 行番号と列番号が同じ場合
// 列番号が rowCount - currentRow + 1 の時（currentRow は現在の行番号） ・列番号が rowCount - currentRow + 1 の時（currentRow は現在の行番号

// HINT: 入れ子になったループ(ループ内のループ)を使用します。
// HINT: 同じ行に印刷するには、println の代わりに print メソッドを使用してください。
// HINT: 別の行に「移動」するには、空のprintln呼び出しを使用することができます。
// 注意: printSquareStar メソッドは、これまでのコースで行ってきたように、public static として定義する必要があります。
// 注意: 解答コードにメインメソッドを追加しないでください。


public class Main {

    public static void main(String[] args) {
        printSquareStar(9);
    }
    //
//    public static void printSquareStar(int number) {
//        String star = "*****";
//        for(int i = 0; i < star.length(); i++) {
//            star = star + "*";
//            System.out.println(star);
//        }
//    }

    // printメソッド
    // 特徴:改行せずに、文字列を画面に表示する命令メソッド
    public static void printSquareStar(int number){
        if(number < 5) System.out.println("Invalid Value");
        else{
            for (int row = 0; row <number; row++){
                for (int column=0; column<number; column++){
                    if(row==0 || row==number-1 || column==0 || column==number-1 || column==row || column==number-1-row) System.out.print("*");
                    else System.out.print(" ");
                }
                System.out.println("");
            }
        }
    }

}
