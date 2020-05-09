import java.util.*;

public class MyApp {
  public static void main(String[] args) {

    // Stream
    // 複数の値を順番に処理していくための仕組み。
    // ArrayListなどの集合データと合わせて、使われる

    // 宣言と同時に値を入れ込んでいく方法↓
    // Arrays.asList()で配列を作り、値を入れ込んでいく
    List<Integer> sales = new ArrayList<>(Arrays.asList(12, 30, 22, 4, 9));

    sales.stream()
        // 中間処理
        // 指定した条件が真の値だけを抽出できる
        .filter(e -> e % 3 == 0).map(e -> "(" + e
            + ")")

        // 終端処理
        // .forEach
        // 抽出した値に対して、処理を実行する
        // メソッド参照という仕組みを用いて、メソッド自体を.forEach()に渡すことができる.
        
        .forEach(System.out::println);
  }

}