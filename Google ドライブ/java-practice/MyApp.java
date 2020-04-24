// class名の先頭は大文字
class User {
  String name = "Me!";

  void sayHi() {
    System.out.println("Hi!");
  }
}

public class MyApp {

  public static void main(final String[] args) {

    // Class
    User tom = new User();
    System.out.println(tom.name);
    tom.sayHi();
  }
}
