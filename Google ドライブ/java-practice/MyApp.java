public class MyApp {

  // sayHiメソッド内の変数xはmainメソッド内では使用できない
  public static void sayHi(String name) {
    // int x = 10;
    System.out.println("Hi!" + name);
  }

  // Overload
  // 引数なしのsayHiを定義する
  public static void sayHi() {
    System.out.println("Hi! Nobody!");
  }

  public static void main(final String[] args) {
    sayHi();
  }
}
