public class Main {
  public static void main(final String[] args) {

    // for
    // ある処理を指定した回数繰り返す
    // 0 - 9
    // break
    // ループ処理を完全に停止する
    // continue
    // 指定した条件のみ、処理を飛ばして、処理を全て実行する
    for (int i = 0; i < 10; i++) {
      if (i == 5) {
        // break;
        continue;
      }
      System.out.println(i);
    }
  }
}