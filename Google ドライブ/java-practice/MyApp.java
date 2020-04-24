class User {
  String name;

  // constructor
  User(String name) {
    this.name = name;
  }

  // this()

  User() {
    // this.name = "Me!";
    this("Me!");
  }

  void sayHi() {
    System.out.println("hi! " + this.name);
  }
}

public class MyApp {

  public static void main(String[] args) {
    User tom;
    // tom = new User("Tom");
    tom = new User();
    System.out.println(tom.name);
    tom.sayHi();
  }

}