import java.util.*;

public class MyApp {
  // ArrayList
  // リストは配列とよく似ており、値の集合を扱うために使用する
  // リストは要素が追加された順番を保持し、重複した要素もそのまま保持できる

  public static void main(String[] args) {
    // リストの要素は参照型である必要があるため、intのような基本データ型を要素に持つリストは作成できない。
    // 基本型を扱うリストを作成したい場合は、下記のようにラッパークラスを用いて定義する。
    List<Integer> sales = new ArrayList<>();

    sales.add(10);
    sales.add(20);
    sales.add(30);

    for (int i = 0; i < sales.size(); i++) {
      System.out.println(sales.get(i));
    }

    // 0番目の要素を100に置き換える
    sales.set(0, 100);
    // 2番目の要素を削除する
    sales.remove(2);

    for (Integer sale : sales) {
      System.out.println(sale);
    }
  }
}