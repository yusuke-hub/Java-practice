package academy.learnprograming;

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
public class Main {
    public static void main(String[] args) {
        Hero h1 = new Hero("ミナト");
        Sword s = new Sword("はがねの剣");
        h1.setSword(s);
        System.out.println("装備:" + h1.getSword());
        System.out.println("clone()で複製します");
        Hero h2 = h1.clone();
        System.out.println("コピーもとの勇者の剣の名前を変えます");
        h1.getSword().setName("ヒノキの棒");
        System.out.println("コピー元とコピー先の勇者の装備を表示します");
        System.out.println("コピー元:" + h1.getSword().getName() + "/コピー先:" + h2.getSword().getName());
        // 両方のインスタンスがヒノキの棒を持っている!!
        // Heroインスタンスは複製できたが、swordは参照がコピーされただけ
        // → 浅いコピー



    }





}
