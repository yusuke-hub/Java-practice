package academy.learnprograming;

import java.util.*;

class Hero {
    public String name;
    private int hp, mp;

    // ★Objectクラスによる効能
    // 1, 全クラスは、Objectクラスで定義されたメソッドを持っていることが保証される
    // 2, Object型変数は、あらゆるインスタンスを代入可能である
        // ●多くのインスタンスに共通して行える5つのメソッド
        // 1, toString() 文字列表現をえる
        // 2, equals() 等価判定を行う
        // 3, hashCode() ハッシュ値を得る
        // 4, compareTo() 大小関係を判定する
        // 5, clone() 複製する

    // 新たにクラスを作ったら、適切な文字列表現を返すようオーバーライドを忘れずに行う
    public String toString() {
        return "勇者(名前=" + this.name + "/HP=" + this.hp + "/MP=" + this.mp + ")";
    }

    
    public int hashCode() {
        int result = 37;
        result = result * 31 + name.hashCode();
        result = result * 31 + hp;
        return result;
    }
}
public class Main {
    public static void main(String[] args) {
        Hero a = new Hero();
        System.out.println(a); // toStringメソッドを定義していない場合 → academy.learnprograming.Hero@5a39699c

    }





}
