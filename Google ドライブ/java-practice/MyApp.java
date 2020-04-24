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