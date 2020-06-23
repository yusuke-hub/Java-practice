package academy.learnprograming;

import java.util.*;

class Hero {
    public String name;
}
public class Main {
    public static void main(String[] args) {
        // ★参照の落とし穴
            // 変数hやリストに格納された値が実際には参照であり、
            // Heroインスタンスが生まれた時点で、そのメモリ上の番地がhに代入されている
            // コレクションへ格納が終わった変数のインスタンスの中身を書き換えると、
            // コレクションに格納済みの要素の中身も書き変わってしまう

            //*注意点
                // Heroのように自分で作るクラスをコレクションに格納する場合、とても重要なことがある
                    // equals()/hashCode()を正しくオーバーライドしていないと、
                    // コレクションは正しく動作せず、原因の特定が困難な不具合につながることがある
                // 古参のコレクションクラス、VectorやHashableは
                // ArrayListやHashMapに劣るので、特別な事情がない限り使用しない
        // CollectionsクラスとArraysクラス
            // java.util.Collections: コレクション操作関連の便利なメソッド集
            // java.util.Arrays: 配列操作関連の便利なメソッド集
        
        Hero h = new Hero();
        h.name = "ミナト";
        List<Hero> list = new ArrayList<Hero>();
        list.add(h);
        h.name = "スガワラ";
        System.out.println(list.get(0).name);
        System.out.println(list.hashCode()); // 1513712059;
    }



}
