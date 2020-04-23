public class Main {
  public static void main(final String[] args) {
    // キャスト
    // 文頭で変換したいデータ型をカッコで囲む
    // double d = 52343.231;
    // int i = (int)d;
    // System.out.println(i);

    int i = 10;
    // 整数型iを4で割ると、計算自体は2.5だが整数型なので小数点以下は切り捨てられ2になる
    // それがdouble型に代入されるので、答えは2.0
    // double d = i / 4;
    double d = (double) i / 4;
    System.out.println(d);

  }
}