public class Main {
  public static void main(final String[] args) {

    int x = 10;
    int y = x;
    y = 5;
    System.out.println(x);
    System.out.println(y);

    // aには値を保存するために用意された複数のメモリ領域の先頭番地が格納されている
    // 故にaを代入されたbは、値が代入されるとそれらの番地に値を格納する
    // int[] a = { 3, 5, 7 };
    // int[] b = a;
    // b[1] = 8;
    // System.out.println(a[1]);
    // System.out.println(b[1]);

    // string型も参照型
    // しかし基本的に文字列は変更が不可になっていて、違う文字列を割り当てると別の領域に新しくデータを確保するという仕組みになっている
    // なので以下の実行結果は、「Hello」「World」となる
    String s = "Hello";
    String t = s;
    t = "World";
    System.out.println(s);
    System.out.println(t);
  }
}
