package academy.learnprograming;

// sumDigitsという名前のメソッドを書きます。
// パラメータが >= 10 の場合
    // このメソッドは数値を処理してすべての桁の合計を返し、
// そうでない場合は無効な値を示すために -1 を返します。
// 0から9までの数字は1桁なので、我々はそれらを処理したくないので、
    // また、我々は負の数を処理したくないので、負の数のためにも-1を返します。
        // 例えば、sumDigits(125)というメソッドを呼び出すと、1 + 2 + 5 = 8なので、8を返さなければなりません。
        // sumDigits(1)のメソッドを呼び出すと、上で説明したように-1を返します。
// メイン・メソッドにコードを追加して、
// 引数として渡された有効な値と無効な値に対して正しく動作しているかどうかを判断するために、
// sumDigits メソッドをテストします。

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of the digits in number 125 is " + sumDigits(125));
        System.out.println("The sum of the digits in number 125 is " + sumDigits(-125));
        System.out.println("The sum of the digits in number 125 is " + sumDigits(4));
        System.out.println("The sum of the digits in number 125 is " + sumDigits(31223));
    }

    // my solution
//    public static int sumDigits(int digit){
//        int digit1;
//        int digit2;
//        int sumDigits;
//
//        if(digit < 10 && digit < 0){
//            return -1;
//        } else {
//            do{
//                digit1 = digit / 10;
//                digit2 = digit % 10;
//                sumDigits = digit1 + digit2;
//            } while(digit2 != 0);
//            return sumDigits;
//        }

        // digit
        // 125 % 10 = 5
        // 125 / 10 = 12
        // 12 % 10 = 2
        // 12 / 10 = 1
//    }
//}

    private static int sumDigits(int number){
        if(number < 10){
            return -1;
        }
        int sum = 0;

        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125 - 120 = 5
        while (number > 0){
            // extract the lest- significant digit
            int digit = number % 10;
            sum += digit;

            // drop the least-significant digit
            number /= 10; // same as number = number / 10;
        }
        return sum;
    }
}