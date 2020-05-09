import java.util.*;

public class MyApp {
  // ArrayList
  // リストは配列とよく似ており、値の集合を扱うために使用する
  // リストは要素が追加された順番を保持し、重複した要素もそのまま保持できる

  public static void main(String[] args) {
    // HashSet
    // 重複して同じ値を入れる事はできない
    // データを保持する順番が定まらない

    // TreeSet
    // 値順にソートされる
    // LinkedHachSet
    // 追加された順番を保持する
    
    // HashSet<Integer> sales = new HashSet<>();
    TreeSet<Integer> sales = new TreeSet<>();
    sales.add(40);
    sales.add(20);
    sales.add(80);
    sales.add(10);

    System.out.println(sales.size());
    for (Integer sale : sales) {
      System.out.println(sale);
    }

    sales.remove(10);

    for (Integer sale : sales) {
      System.out.println(sale);
    }
  }
}