public class Main {
  public static void main(final String[] args) {

    // 配列
    final int[] sales = { 700, 400, 500 };

    // for (int i = 0; i < 3; i++) {
    // System.out.println(sales[i]);
    // }

    // 配列salesの値を変数saleに順番に入れていき、その個数分だけ処理を実行する
    for (int sale : sales) {
      System.out.println(sale);
    }
  }
}