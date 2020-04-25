// final: 変更ができない
// クラスにつけると継承できなくなり
// メソッドにつけるとOverrideできなくなる
final class User {
  protected String name;
  // 書く順番は決まっていないが、慣習的には以下の順番
  // アクセス修飾子 static final
  private static final double VERSION = 1.1;

  public User(String name) {
    this.name = name;
    // VERSIONは値が変更できない定数^
    // User.VERSION = 1.2;
  }

  public final void sayHi() {
    System.out.println("hi! " + this.name);
  }
}

class AdminUser extends User {

  public AdminUser(String name) {
    super(name);
  }

  @Override
  public void sayHi() {
    System.out.println("[admin] hi! " + this.name);
  }

}

public class MyApp {

  public static void main(String[] args) {
    User tom = new User("tom");
  }

}