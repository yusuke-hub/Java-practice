// interface 
// クラスの仲間であり、抽象クラスの親戚みたいなもの
// implementsする複数の小クラスたちに共通のメソッド群を実装するよう強制できる
// あるクラスがインターフェースを実装していれば、少なくともそのインターフェースが定めたメソッドは持っている事が保証される

// interfaceに宣言されたメソッドは自動的にpublicかつabstractになる
interface Printable {

  // interfaceは本来フィールドを持たないが、
  // public static finalが着いたフィールドだけは宣言が許される
  // 無ければ自動補完されるので、省略可
  double VERSION = 1.2;

  // 抽象メソッド
  void print();

  // defaultメソッド
  public default void getInfo() {
    System.out.println("I/F ver. " + Printable.VERSION);
  }
  // staticメソッド
}

class User implements Printable {
  @Override
  public void print() {
    System.out.println("Now printing user profile...");
  }
}

public class MyApp {

  public static void main(String[] args) {
    User tom = new User();
    tom.print();
    tom.getInfo();
  }

}