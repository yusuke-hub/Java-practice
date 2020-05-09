public class MyApp {
  public static void main(String[] args) {

    int score = 50;
    double height = 169.5;
    String name = "Kawabata";
    // printf
    // 書式を指定して、出力できるメソッド
    // format
    // printfと似ているメソッド

    // 10:左寄せ -10:右寄せ
    // %[整数の表示する桁数].[小数点以下の表示する桁数]f
    System.out.printf("name: %s, score: %d, height: %f\n", name, score, height);
    System.out.printf("name: %-10s, score: %-10d, height: %5.3f\n", name, score, height);

    String s = String.format("name: %10s, score: %10d, height: %5.2f\n", name, score, height);
    System.out.println(s);
  }
}