public class MyApp {
  public static void main(String[] args) {
    String s = "abcdef";
    System.out.println(s.length());
    // substring(i1, i2)
    // i1番目からi2番目の手前までの文字列を出力する
    System.out.println(s.substring(1, 4));
    // replaceALL("s1", "s2")
    // s1をs2に置換する
    System.out.println(s.replaceAll("cd", "CD"));

    String s1 = "ab";
    String s2 = "ab";

    // 文字列型においては、既に宣言されている変数と同じ文字列で
    // 新たに変数が宣言された場合、既に宣言されて居る変数と同じメモリ領域が使われる
    if (s1.equals(s2)) {
      System.out.println("same!");
    }

    if (s1 == s2) {
      System.out.println("same!same!");
    }

    // 新しいメモリ領域を確保したい場合は、以下のように明示的にインスタンス化する
    String ss1 = new String("ab");
    String ss2 = new String("ab");

    if (ss1 == ss2) {
      System.out.println("same!same!same!");
    }
  }
}