package academy.learnprograming;


// bigCount, smallCount, goalというint型の3つのパラメータを持つcanPackというメソッドを書きます。
// bigCountというパラメータは、大きな小麦粉の袋(5キロずつ)の数を表しています。
// smallCountは小麦粉の小袋の数(1キロずつ)を表します。
// goalパラメータは、パッケージを組み立てるのに必要な小麦粉のキロ数を表します。

//したがって、bigCountとsmallCountのキロ数の合計は、少なくともゴールの値に等しくなければなりません。
// このメソッドは、目標のキロ数の小麦粉でパッケージを作ることが可能な場合には真を返します。
//
//合計がゴールよりも大きい場合は、ゴール量に向かって満杯の袋だけが使用されることを確認してください。
// 例えば、goal = 9、bigCount = 2、smallCount = 0の場合
// それぞれの大きな袋は5キロであり、分割できないので、
// メソッドはfalseを返す必要があります。

// しかし、ゴール=9、bigCount=1、smallCount=5の場合は、
// bigCountの袋が1つでsmallCountの袋が4つでゴールと同じなので、
// メソッドはtrueを返すべきで、追加の袋が残っていても問題ありません。
// パラメータのどれかが負の場合は、falseを返します。
public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        } else {
            for(int b = 0; b < bigCount + 1; b++){
                for(int s = 0; s < smallCount + 1; s++){
                    if(goal == 5 * b + 1 * s) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
