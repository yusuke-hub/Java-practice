// 親クラス スーパークラス
class User {
  String name;

  // constructor
  User(String name) {
    this.name = name;
  }

  void sayHi() {
    System.out.println("hi! " + this.name);
  }
}

// 子クラス サブクラス
class AdminUser extends User {
  AdminUser(String name) {
    super(name);
  }
  
  void sayHello() {
    System.out.println("hello! " + this.name);
  }
  
  // override
  // @Overrideでoverrideを明示的に示す
  // annotationと呼ぶ
  @Override void sayHi() {
    System.out.println("[admin]hi! " + this.name);
  }
}

public class MyApp {

  public static void main(String[] args) {
    User tom = new User("tom");
    System.out.println(tom.name);
    tom.sayHi();

    AdminUser bob = new AdminUser("bob");
    System.out.println(bob.name);
    bob.sayHello();
  }

}

// パッケージ
// 関連するクラスをまとめたり、名前の衝突を避ける事ができる
// 名前は組織のドメインを逆にしたものを使う事が推奨されている

// アクセス修飾子
// クラスやそのメンバーがどこからアクセス可能であるかを決定する
  // public
    // どこからでもアクセス可能
  // package private = アクセス修飾子を何もつけない
    // 同じパッケージからのみ、アクセス可能
  // private
    // 同じクラスからのみ呼び出せる
  // protected
    // 別のパッケージであっても、当該クラスのサブクラスからならアクセス可能