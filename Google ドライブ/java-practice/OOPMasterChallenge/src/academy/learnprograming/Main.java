// 架空の会社「ビルズバーガー」の経営支援を目的としています。
// ハンバーガーを販売するための彼らのプロセス。
// 私たちのアプリケーションは、ビルがハンバーガーの種類を選択するのに役立ちます、
// いくつかの追加項目（追加）をハンバーガーと価格設定に追加します。
// 基本のハンバーガーだけでなく、ビルズストアで人気のあるハンバーガーを2種類作りたいと思います。

// ◉Customer
    // add
// ◉Basic Humberger
    // String name, static int price
        // ●Additions(Up to 4)
            // String BreadRollType, String meat / boolean letace, tomato, carrot, onion
                // price
    // constructor
        // name, BreadRollType, meatType, price,
// ◉Healthy Humberger
    // String BrownRyeBreadRoll + 2additions
// ●Vegetables
    //


// 基本のハンバーガーは、以下のようなものを用意したいと思います。
// ロールパンタイプ、肉、そして最大4つの追加要素（レタス、トマト、ニンジンなど）を用意します。
// 顧客はハンバーガーに追加するかどうかを選択することができます。
// これらのアイテムのそれぞれが追加料金を請求されるので、どのくらいのアイテムが追加されたかを追跡するための何らかの方法が必要です。
// そして最終的な価格を計算します（基本のハンバーガーにすべての追加要素を加えたもの）。
// このハンバーガーには基本価格があり、追加要素はすべて個別に価格が設定されています(最大4つの追加要素まで、上記参照)。

// 上記の全てを処理するためのハンバーガークラスを作成します。
// コンストラクタには、ロールの種類、肉、価格だけを含める必要がありますが、ハンバーガーの名前を含めることもできます。
// セッターを使用することができます。

// また、ハンバーガーに対応するために、2種類の追加のハンバーガー（サブクラス）を作成します。
// a) ヘルシーバーガー(ブラウンライ麦パンロールの上)にプラスして、2つの追加アイテムを追加することができます。
// ヘルシーバーガーは合計で6つのアイテム(Additions)を持つことができます。
// ヒント：この新しいクラス(ハンバーガーのサブクラス)で2つの追加項目を処理した方がいいかもしれません。
// ベースクラス (ハンバーガー) ではありません。
// (つまり新しいハンバーガータイプ)です。

// b) デラックスハンバーガー - 追加でチップスとドリンクが付いてきますが、追加で追加することはできません。
// ヒント: デラックスハンバーガーを作る時に自動的に追加する方法を見つけなければなりません。
// オブジェクトを作成して、他の追加ができないようにします。

// 3つのクラスはすべて、ハンバーガーの基本価格を表示するためにいつでも呼び出すことができるメソッドを持っている必要があります
// 加えて、すべての加算を表示し、それぞれに加算名、加算価格、およびその合計を表示します。
// ハンバーガー (基本価格＋全ての追加)
// 追加の2つのクラスについては、ベースクラスの価格設定を見てから
// 最終的な価格に合計を追加します。



package academy.learnprograming;

public class Main {

    public static void main(String[] args) {
        Humburger humburger = new Humburger("Basic", "Sausage", 3.56, "whitte");
        double price = humburger.itemizeHamburger();
        humburger.addHamburgerAddition1("Tomato", 0.27);
        humburger.addHamburgerAddition2("Lettuce", 0.75);
        humburger.addHamburgerAddition3("Cheese", 1.12);
        System.out.println("Total Burger price is " + humburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition2("Lenthils", 3.41);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());

        DeluxeBurger db = new DeluxeBurger();
        db.addHamburgerAddition1("Should not do this", 50.53);
        db.itemizeHamburger();

//        ★ My Solution
//        Humburger humburger = new Humburger("ハンバーガー", "小麦");
//        humburger.add(true, false, true, false, true);
//        System.out.println(humburger.getAdditions());
    }
}
