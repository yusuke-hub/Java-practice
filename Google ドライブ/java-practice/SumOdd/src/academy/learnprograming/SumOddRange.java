package academy.learnprograming;

// sumOddと呼ばれる2つ目のメソッドを書きます。
// このメソッドは for ループを使用して、その範囲内の奇数をすべて合計し、その合計を返します。
// また、各数値が奇数であるかどうかをチェックするために isOdd メソッドを呼び出す必要があります。
// パラメータ end は start と同じかそれ以上である必要があり、start と end の両方のパラメータは 0 より大きくなければなりません。
// これらの条件が満たされない場合は、入力が無効であることを示すためにメソッドから -1 を返します。
public class SumOddRange {
    public static boolean isOdd(int number){
        if(number <= 0){
            return false;
        } else if(number % 2 == 1){
            return true;
        } else{
            return false;
        }
    }
    public static int sumOdd(int start, int end){
        if((start <= end) && (start > 0 && end > 0)){
            int sum = 0;
            for(int i = start; i < end +1; i++){
                if(isOdd(i)){
                    sum += i;
                }else{
                    continue;
                }
            }
            return sum;
        }else {
            return -1;
        }
    }
}
