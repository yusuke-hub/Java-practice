package academy.learnprograming;
// static import宣言を行うことで、
// 列挙子以外にもstaticがついたクラスメンバについて
// 記述の省略を可能にする
import static academy.learnprograming.AccountType.FUTSU;

class Sword {
    public String name;

    public Sword(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Hero implements Cloneable {
    public String name;
    public Sword sword;
    private int hp, mp;

    public Hero() {
    }

    public Hero(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSword(Sword sword) {
        this.sword = sword;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public String getName() {
        return name;
    }

    public Sword getSword() {
        return sword;
    }

    public int getHp() {
        return hp;
    }

    public int getMp() {
        return mp;
    }

    // ★インスタンスを複製する方法
    // 1, Cloneableインターフェースを実装する
        // これにはclone()は定義されておらず、clone()を実装することで
        // 複製に対応していることを表明するためだけに存在する(マーカーインターフェース)
    // 2, cloneメソッドをpublicでオーバーライドする
        // 子クラスにおけるオーバーライド時のアクセス修飾子は、
        // 親クラスにおけるそれと同じか、よりゆるいアクセス修飾子に限定される
    public Hero clone() {
        Hero result = new Hero();
        result.name = this.name;
        result.hp = this.hp;
        result.sword = this.sword;
        // clone()でswordも複製するためには
        // resule.sword = this.sword.clone()とする
        return result;
    }
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

// ★ジェネリクス
// 1, クラス宣言時に、EやKという「仮の型名」を使っておく
    // 仮型引数の段階で、利用できる実型引数を制限できる
        // ex, public class Pocket <E extends Character>
// 2, クラス利用時に、それをStringなどの「実際の型」に置換して利用する

// ↓ジェネリクスを使わずに実現したPocketクラス(V1)
//    class Pocket {
//    private Object data;
//    public void put(Object d) {
//        this.data = d;
//    }
//    public Object get() {
//        return this.data;
//    }
//    }

// ジェネリクスを使ったPocketクラス(V2)
class Pocket<E> {
    private E data;

    public void put(E d) {
        this.data = d;
    }

    public E get() {
        return this.data;
    }
}
public class Main {
    public static void main(String[] args) {
        // Object型変数dataに値が格納された瞬間、
        // その情報が元々Stringインスタンスであったことは忘れ去られるため
        // キャストしなおさないといけなくなる
        Pocket p = new Pocket();
        p.put("1192");
        String s = (String) p.get();
        System.out.println(s);

        Account a = new Account("172637482", FUTSU);



    }





}
