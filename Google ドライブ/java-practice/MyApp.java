public class MyApp {

  // メソッド名の前のvoidは「何も値を返さないよ」という意味
  // public static void sayHi(String name) {

  // メソッドが値を返す時は、メソッド名の前に、その返すデータの方を書かないといけない
  public static String sayHi(String name) {

    // System.out.println("Hi!" + name);
    return "Hi!" + name;
  }

  public static void main(final String[] args) {
    // sayHi("Yusuke");
    String msg = sayHi("Taiko");
    System.out.println(msg);
  }
}
