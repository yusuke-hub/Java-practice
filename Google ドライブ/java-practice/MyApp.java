// static
// インスタンス化しなくても直接使えるフィールドやメソッドを定義できる

class User {
  private String name;
  private static int count = 0;

  public User(String name, int score) {
    this.name = name;
    // staticを定義したクラス変数は先頭にクラス名をつける事でアクセスできる
    User.count++;
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