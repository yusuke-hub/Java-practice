package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
        // 3, インスタンスが生成されていなくてもアクセスできる
        Hero.money = 300;
        System.out.println(Hero.money);
        Hero h1;
        h1 = new Hero();
        h1.name = "ボブ";
        h1.hp = 100;
        System.out.println(h1.name + "の所持金は" + h1.money + "円です");


        // 引数付きのコンストラクタが実行される
        Hero h2 = new Hero("ミナト");
        // 2, 全インスタンスに箱の分身が準備される
        h2.money = 100;
        Hero h3 = new Hero();
        System.out.println(h2.name + "の所持金は" + h2.money + "円です");
        System.out.println(h3.name);


        // Sword型のインスタンスに値を設定
        Sword s = new Sword();
        s.name = "炎の剣";
        s.damage = 10;

        // 勇者h1のフィールドswordにsを設定
        h1.sword = s;
        System.out.println(h1.name + "の現在の武器は" + h1.sword.name);

        Wizard w = new Wizard();
        w.name = "ジョン";
        w.hp = 50;
        w.heal(h1);

    }
}
