// static
// インスタンス化しなくても直接使えるフィールドやメソッドを定義できる

class User {
  private String name;
  private static int count = 0;

  // static {}
  // クラスを使う前に、行いたい初期化処理を記述する
  static {
    User.count = 0;
    System.out.println("Static initializer");
  }

  // インスタンス・イニシャライザ
  // インスタンスを初期化する際に行う処理を書く
  {
    System.out.println("Instance initializer");
  }

  public User(String name, int score) {
    this.name = name;
    // staticを定義したクラス変数は先頭にクラス名をつける事でアクセスできる
    User.count++;
    System.out.println("Constructor");
  }

  public static void getInfo() {
    System.out.println("# of instances:" + User.count);
  }

}

public class MyApp {

  public static void main(String[] args) {
    User.getInfo();
    User tom = new User("tom", 85);
    User.getInfo();
    User bob = new User("bob", -21);
    User.getInfo();
  }

}